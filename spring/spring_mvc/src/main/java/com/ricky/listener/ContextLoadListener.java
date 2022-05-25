package com.ricky.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoadListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {

        ServletContext servletContext = servletContextEvent.getServletContext();

        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        ApplicationContext app = new ClassPathXmlApplicationContext(contextConfigLocation);
        servletContext.setAttribute("app",app);

        System.out.println("spring容器创建完毕....");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
