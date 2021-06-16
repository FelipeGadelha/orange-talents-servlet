package br.com.alura.manager.servlet;

import java.io.IOException;

import br.com.alura.manager.dao.Bank;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/remove-enterprise")
public class RemoveEnterpriseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Bank bank = new Bank();
		bank.removeEnterprise(id);
		response.sendRedirect("list-enterprises");
	}

}
