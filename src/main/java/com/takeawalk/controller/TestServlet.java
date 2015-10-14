package com.takeawalk.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.Template;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.VelocityViewServlet;


public class TestServlet extends VelocityViewServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected Template getTemplate(HttpServletRequest request, HttpServletResponse response) {
		return super.getTemplate(request, response);
	}

	@Override
	protected Template handleRequest(HttpServletRequest request, HttpServletResponse response, Context ctx) {
		return super.handleRequest(request, response, ctx);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	
}
