package com.mywebprojects;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class PainTextServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;


    	public void init(ServletConfig con)throws ServletException{
    		super.init(con);
    	}

    	public void service (ServletRequest req, ServletResponse res) throws ServletException, IOException{
    		res.setContentType("text/plain");
    		PrintWriter out =res.getWriter();
    		out.println("Welcome to Vensoft!");
    	}
    	public void destroy(){
    		System.out.println("destroying!");
    		
    	}

}
