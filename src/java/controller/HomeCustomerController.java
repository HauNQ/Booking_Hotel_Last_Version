/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import model.RoomModel;
import service.IRoomService;
import service.impli.RoomService;

/**
 *
 * @author Nguyen Quang Hau
 */
@WebServlet(name = "HomeCustomerController", urlPatterns = {"/HomeCustomerController"})
public class HomeCustomerController extends HttpServlet {
    
    private IRoomService roomService = new RoomService();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HomeCustomerController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HomeCustomerController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int page;
        int fetch;
        int offset;
        
        //paging
        try {
            page = Integer.parseInt(request.getParameter("page"));
            fetch = Integer.parseInt(request.getParameter("fetch"));
            offset = (page-1)*fetch;        
        } catch (Exception e) {
            page = 1;
            offset = 0;
            fetch = 6;
        }
        
        
        request.setAttribute("page", page);
        request.setAttribute("totalPage",(int)Math.ceil(roomService.countTotal()/fetch));
        request.setAttribute("rooms",roomService.findWithLimit(offset, fetch));

        // send 
        request.getRequestDispatcher("/views/customer/CustomerHome.jsp").forward(request, response);     
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
