package comm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.model.Customer;
import comm.service.CustomerService;
import comm.service.CustomerServiceImpl;


public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private CustomerService service=null;
   List<Customer> list=null;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			service=new CustomerServiceImpl();
			 list=service.getAllCustomers();
			request.setAttribute("customers",list);
			RequestDispatcher view = request.getRequestDispatcher("listcustomers.jsp");
			view.forward(request, response);
			
	}

}
