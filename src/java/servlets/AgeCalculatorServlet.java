
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
 
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age1 = request.getParameter("age");
        request.setAttribute("age_1", age1);
        try{
       if (age1 == null || age1.equals("")) {
        String message = "You must give your current age.";
            request.setAttribute("message", message);
        }
         else {
            int agenum = Integer.parseInt(age1);
            agenum++;
            String message = "Your age next birthday will be " + agenum;
            request.setAttribute("message", message);
           
            
        }}
      catch(Exception e) {
            String message = "You must enter a number.";
            request.setAttribute("message", message);
            
        }
          getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
       return;
    }

  
        
            }
    

  


  


