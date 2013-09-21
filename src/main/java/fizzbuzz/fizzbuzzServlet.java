package fizzbuzz;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.*;

public class fizzbuzzServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Fizzbuzz fb = new Fizzbuzz();
		String hasta = request.getParameter("hasta");
		response.getWriter().println(fb.imprimir(Integer.parseInt(hasta)));
		//response.getWriter().println("Se recibio el parametro: " + hasta);
	}
	
	public static void main(String[] args) throws Exception{
		Server server = new Server(Integer.valueOf(System.getenv("PORT")));
		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");
		server.setHandler(context);
		context.addServlet(new ServletHolder(new fizzbuzzServlet()), "/");
		server.start();
		server.join();
	}
}
