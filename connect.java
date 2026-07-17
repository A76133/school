
package school;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class connect extends HttpServlet{
    @Override
   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
     res.setContentType("text/html");
        PrintWriter out=res.getWriter();
         String name=req.getParameter("name");
           String email=req.getParameter("email");
            String subject=req.getParameter("subject");
             String message=req.getParameter("message");
             out.print("<h1 style='color:lightpink;padding=1px;border:2px solid black;'>your name is : </h1><br>"+name);
             out.print("<h1 style='color:lightpink;padding=1px;border:2px solid black;'>your name is : </h1><br>"+email);
             out.print("<h1 style='color:lightpink;padding=1px;border:2px solid black;'>your name is : </h1><br>"+subject);
             out.print("<h1 style='color:lightpink;padding=1px;border:2px solid black;'>your name is : </h1><br>"+message);
   }    
}
