package br.com.alura.manager.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.alura.manager.dao.Bank;
import br.com.alura.manager.model.Enterprise;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/new-enterprise")
public class NewEnterpriseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    	System.out.println("cadastrando nova empresa");
    	
    	String nameEnterprise = req.getParameter("name");
    	String dateEnterprise = req.getParameter("date");
    	var enterprise = new Enterprise();
    	Date date = null;
    	try {
    		var format = new SimpleDateFormat("dd/MM/yyyy");
			date = format.parse(dateEnterprise);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
    	enterprise.setOpeningDate(date);
    	enterprise.setName(nameEnterprise);
    	
    	var bank = new Bank();
    	bank.save(enterprise);

    	resp.sendRedirect("list-enterprises");
    	
//    	RequestDispatcher rd = req.getRequestDispatcher("/list-enterprises");
//    	req.setAttribute("enterprise", enterprise.getName());
//    	rd.forward(req, resp);
		
	}
}
