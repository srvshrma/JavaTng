package comm.controller;

import java.io.IOException;

import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.dto.CustomerDtoImpl;
import comm.dto.CustomerMapper;
import comm.model.Customer;
import comm.model.CustomerDto;
import comm.service.CustomerService;
import comm.service.CustomerServiceImpl;


public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustomerService service=null;
	CustomerDtoImpl impl=null;
  
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		service=new CustomerServiceImpl();
		impl = new CustomerMapper();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		CustomerDto dto=new CustomerDto( name, email);
		Customer customer=service.createCustomer(impl.customerDtoToCustomer(dto));
		if(customer!=null) {
			
			
			RequestDispatcher view=request.getRequestDispatcher("homecontroller.do");
			view.forward(request, response);
		}
			else {
				RequestDispatcher view=request.getRequestDispatcher("error.html");
				view.forward(request, response);
				
			}
		}
	
	}

