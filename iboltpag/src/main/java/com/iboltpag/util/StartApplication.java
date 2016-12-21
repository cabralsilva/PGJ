package com.iboltpag.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javassist.CtField.Initializer;

public class StartApplication extends ResourceConfig implements ServletContextListener{
	
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando aplicação");
		
	}
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Encerrando aplicação");
	}

	

	

}
