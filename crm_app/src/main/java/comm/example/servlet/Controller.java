package comm.example.servlet;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.Dto.CustomerDtoImpl;
import comm.example.Dto.CustomerMapper;
import comm.example.model.Customer;
import comm.example.model.CustomerDto;
import comm.example.service.CustomerService;
import comm.example.service.CustomerServiceImpl;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService service=null;
	private CustomerDtoImpl impl;
   
	@Override
	public void init() throws ServletException {
		
		super.init();
		service=new CustomerServiceImpl();
		impl=new CustomerMapper();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name= request.getParameter("name");
		String email=request.getParameter("email");
		
		CustomerDto cdto=new CustomerDto(UUID.randomUUID().toString(),name,email);
		Customer customer=service.createCustomer(impl.customerDtoToCustomer(cdto));
		if(customer!=null) {
			List<Customer> customers=service.getAllCustomer();
			request.setAttribute("Success", customers);
			RequestDispatcher view=request.getRequestDispatcher("success.jsp");
			view.forward(request, response);
		}
		else {
			RequestDispatcher view=request.getRequestDispatcher("error.html");
			view.forward(request, response);
		}
		
		
	}
}
