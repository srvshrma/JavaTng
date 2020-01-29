package comm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.model.Customer;
import comm.service.CustomerService;
import comm.service.CustomerServiceImpl;

public class CustomerUpdateController extends HttpServlet {
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
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Customer customer=service.findById(Integer.parseInt(request.getParameter("id")));
		
		customer.setName(request.getParameter("name"));
		customer.setEmail(request.getParameter("email"));
		service.update(customer);
		RequestDispatcher view=request.getRequestDispatcher("homecontroller.do");
		view.forward(request, response);
	}

}
