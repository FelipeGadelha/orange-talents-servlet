package br.com.alura.manager.servlet;

import java.io.IOException;
import java.util.List;

import br.com.alura.manager.dao.Bank;
import br.com.alura.manager.model.Enterprise;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/list-enterprises")
public class ListEnterprisesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Bank bank = new Bank();
		
		List<Enterprise> enterprises = bank.getEnterprise();
		RequestDispatcher rd = req.getRequestDispatcher("/list-enterprises.jsp");
		req.setAttribute("enterprises", enterprises);
		rd.forward(req, resp);
	}
}
