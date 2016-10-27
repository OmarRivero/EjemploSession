/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SesionesServlet extends HttpServlet {
   
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String nombre;
        String apellido;
        
        //recuperamos los datos del formulario
        nombre = request.getParameter("NOMBRE");
        apellido = request.getParameter("APELLIDO");
         
        HttpSession sesion = request.getSession();
        sesion.setAttribute("claveSesion", nombre + apellido);

        response.setContentType("text/html");
        //Mostramos los  valores en el cliente
        PrintWriter out = response.getWriter();
       
      
      
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
        out.println("<title>Resultados</title>");
        out.println("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">");
        out.println("<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>");
        out.println("<link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>");
        out.println("<link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\" type=\"text/css\">");
        out.println("<link rel=\"stylesheet\" href=\"css/animate.min.css\" type=\"text/css\">");
        out.println("<link rel=\"stylesheet\" href=\"css/creative.css\" type=\"text/css\">");
        out.println("</head>");
        out.println("<body id=\"page-top\">");
        out.println("<header>");
        out.println("<a href=\"/EjemploSession/catalogo.jsp\"> Link al catalogo del carrito  </a>");
        out.println("<br>");
        out.println("ID de la sesi&oacute;n: " + sesion.getId());
        out.println("</header>");
        out.println("<br>");
        out.println("<br>");
        out.println("<script src=\"js/jquery.js\"></script>");
        out.println("<script src=\"js/bootstrap.min.js\"></script>");
        out.println("<script src=\"js/jquery.easing.min.js\"></script>");
        out.println("<script src=\"js/jquery.fittext.js\"></script>");
        out.println("<script src=\"js/wow.min.js\"></script>");
        out.println("<script src=\"js/creative.js\"></script>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

}
