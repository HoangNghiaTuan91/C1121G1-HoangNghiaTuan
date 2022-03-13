package controller;

import model.Calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
//        requestDispatcher.forward(request, response);
        // điều hướng trang kết quả trở về trang chủ,gửi theo data,enter trên trình duyệt,f5 ko được
        response.sendRedirect("index.jsp");
        // điều hướng trang kết quả trở về trang chủ,ko gửi theo data,enter trên trình duyệt,f5 ko được
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand = Float.parseFloat(request.getParameter("first-operand"));
        float secondOperand = Float.parseFloat(request.getParameter("second-operand"));
        char operator = request.getParameter("operator").charAt(0);
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>Result:</h1>");
        try {
            float result = Calculator.calculate(firstOperand, secondOperand, operator);
            printWriter.println(firstOperand + " " + operator + " " + secondOperand + " = " + result);
        } catch (Exception ex) {
            printWriter.println("Error: " + ex.getMessage());
        }
        printWriter.println("</html>");
    }
}
