package comm.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.model.Customer;
import comm.service.CustomerService;
import comm.service.CustomerServiceImpl;

public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   private CustomerService service=null;
	   
	   
		@Override
	public void init() throws ServletException {
		
		super.init();
		service=new CustomerServiceImpl();
	}


		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doProcess(request, response);
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doProcess(request, response);
		}

		protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			Customer c=service.findById(Integer.parseInt(request.getParameter("customerId")));
			request.setAttribute("customer", c);
			RequestDispatcher view=request.getRequestDispatcher("updatecustomer.jsp");
			view.forward(request, response);
	}

}
