
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {



   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
 
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String f1 = request.getParameter("first");
        request.setAttribute("val1", f1);
        String f2 = request.getParameter("second");
        request.setAttribute("val2", f2);
        try {
            int value1 = Integer.parseInt(f1);
            int value2 = Integer.parseInt(f2);
            int value3 = 0 ;
            String calc =  request.getParameter("calculation");
            switch (calc){
            case "+":
                value3 = value1 + value2;
                break;
             case "-":
                value3 = value1 - value2;
                break;
             case "*":
                value3 = value1 * value2;
                break;
              case "%":
                value3 = value1 / value2;
                break;
            }
            
            int message = value3;
            request.setAttribute("message", message);
        } catch (Exception e) {
            String message = "Invalid";
            request.setAttribute("message", message);
        }
        
        
        
        
        
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
          return;

    }


}
