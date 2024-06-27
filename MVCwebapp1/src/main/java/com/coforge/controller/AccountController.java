package com.coforge.controller;

import java.io.IOException;
import com.coforge.model.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		float balance=Float.parseFloat(request.getParameter("balance"));
		String act_type=request.getParameter("act_type");
		
		Account account=new Account();
		account.setId(id);
		account.setName(name);
		account.setBalance(balance);

		
		HttpSession session=request.getSession();		
		session.setAttribute("account", account);
		
		RequestDispatcher dispatcher;
		
		if(act_type.equals("saving")) {
			dispatcher=request.getRequestDispatcher("/SavingAccount.jsp");
			dispatcher.forward(request, response);
		}
		 if(act_type.equals("current")) {

			  dispatcher=request.getRequestDispatcher("/CurrentAccount.jsp");

			  dispatcher.forward(request, response);

			 }

}
}