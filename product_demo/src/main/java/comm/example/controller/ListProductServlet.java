package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Product> listLeague = null;
  
    public ListProductServlet() throws ServletException {
    	listLeague = new ArrayList<Product>();
        super.init();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	
	}
	

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		listLeague.add(new Product(UUID.randomUUID().toString(), "Mango", "Pantry", "Fruit"));
		
		
		out.println("<html><head><title>list league</title></head><body>");
		out.println("<table border='1'><tr><td>League ID</td><td>League Name</td><td>League Season</td><td>League Year</td></tr>");
		
		listLeague.forEach(product->{
			out.println("<tr><td>"+product.getProductId()+"</td><td>"+product.getProductName()
			+"</td><td>"+product.getProductType()+"</td><td>"+product.getProductDesc()+"</td></tr>");
		});
		
		out.println("</table><body></html>");
		
		
	}

}
