package com.iboltpag.util;

import java.io.IOException;

import javax.inject.Singleton;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Singleton
@Provider
public class FilterCross implements ContainerResponseFilter{

	@Override
	public void filter(ContainerRequestContext arg0, ContainerResponseContext arg1) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Executando filtro Response");
		
	}
	
}
