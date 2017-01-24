package com.mywebprojects;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;




public class LifeCycleServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
   
   
       
        public void init(ServletConfig con){
        
		System.out.println("In init");
    }
	
	public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException{
		System.out.println("in service");
	}

	
	public void destroy(){
		
		System.out.println("in destroy!");
	}

}
