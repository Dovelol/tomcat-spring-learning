package com.dovelol.tomcatdemo.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Dovelol
 * @date 2018/9/28 9:59
 */
public class MySpringListenerDemo {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MySpringListenerDemo.class);

        //context.refresh();

        context.addApplicationListener(new MyApplicationListener());

        context.publishEvent(new MyApplicationEvent("Hello World!"));
        context.publishEvent(new MyApplicationEvent("123"));
        
    }

    private static class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

        @Override
        public void onApplicationEvent(MyApplicationEvent event) {
            System.out.println("receive:" + event.getSource());
        }
    }


    private static class MyApplicationEvent extends ApplicationEvent {

        public MyApplicationEvent(Object source) {
            super(source);
        }
    }


}
