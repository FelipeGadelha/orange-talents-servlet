package br.com.alura.manager.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.alura.manager.dao.Bank;
import br.com.alura.manager.model.Enterprise;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update-enterprise")
public class UpdateEnterpriseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		Bank bank = new Bank();
		
		request.setAttribute("enterprise", bank.findById(id));
		request
			.getRequestDispatcher("form-update-enterprise.jsp")
			.forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("alterando empresa");
    	
		Integer idEnterprise = Integer.valueOf(req.getParameter("id"));
    	String nameEnterprise = req.getParameter("name");
    	String dateEnterprise = req.getParameter("date");
    	System.out.println(idEnterprise);
    	
    	var bank = new Bank();
    	Enterprise enterprise = bank.findById(idEnterprise);
    	enterprise.setName(nameEnterprise);

    	try {
    		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			enterprise.setOpeningDate(format.parse(dateEnterprise));
		} catch (ParseException e) {
			throw new ServletException(e);
		}
    	resp.sendRedirect("list-enterprises");
	}

}
