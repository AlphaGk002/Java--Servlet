import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Addservlet extends HttpServlet
{
   public void service(HttpServletRequest req,HttpServletResponse res) throws IOException 
   {
	   final long serialVersionUID = 1L;
	   
	   int i = Integer.parseInt(req.getParameter("num1"));
	   int j = Integer.parseInt(req.getParameter("num2"));
	   
	   int  k = i+j;
	   
	   PrintWriter out = res.getWriter();
	   out.println("Result:"+k);
	   
	  
	   
	   }
}
