package com.dovelol.tomcatdemo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author Dovelol
 * @date 2018/10/9 11:24
 */

@WebFilter(filterName = "myFilter", urlPatterns = {"/*"})
public class MyFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("filter init:" + filterConfig.getFilterName());
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("filter:" + request.getLocalAddr());
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        logger.info("filter destory.");
    }
}
