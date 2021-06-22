/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertoargueta.servlts;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rober
 */
public class Servlet_AA19091 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet_AA19091</title>");            
            out.println("</head>");
            out.println("<body>");
            String user= request.getParameter("user");
            String num1= request.getParameter("Txtnum1");
            String num2= request.getParameter("Txtnum2");
            String btnsumar= request.getParameter("btnsumar");
            String btnrestar= request.getParameter("btnrestar");
            String btndividir= request.getParameter("btndividir");
            String btnmultiplicar= request.getParameter("btnmultiplicar");
            Primos primos = new Primos();// llamamos la clase o metodo

            int array[] = primos.primeList(Integer.parseInt(num1), Integer.parseInt(num2));//ingresamos parametros y convertimos

            primos.reverse(array);//me los haga desendente

            String numerosprimos = "";

            int index = array.length - 1;
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    numerosprimos += array[i];
                } else {
                    numerosprimos += array[i] + "-";
                }
            }
            if (btnsumar!=null){
                int resultado= Integer.parseInt(num1)+ Integer.parseInt(num2);
                out.print(" Bienvenido !! " + user +  " El resultado de la suma es : " + resultado + "<p>LOS PRIMOS SON " + numerosprimos );  
            }
            if (btnrestar!=null){
                int resultado= Integer.parseInt(num1)- Integer.parseInt(num2);
                out.print(" Bienvenido !! " + user + " El resultado de la resta es : " + resultado + "<p>LOS PRIMOS SON : " + numerosprimos );  
            }
            if (btndividir!=null){
                double resultado= Integer.parseInt(num1) / Integer.parseInt(num2);
                out.print(" Bienvenido !! " + user + " El resultado de la division es : " + resultado +"<p>LOS PRIMOS SON : " + numerosprimos);  
            }
            if (btnmultiplicar!=null){
                int resultado= Integer.parseInt(num1)* Integer.parseInt(num2);
                out.print(" Bienvenido !! " + user + " El resultado de la multiplicacion es : " + resultado + "<p>LOS PRIMOS SON : " + numerosprimos); 
                
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
//AUTOR: ROBERTO CARLOS ARCE ARGUETA  
//CODIGO: AA19091