package user;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import base.InterfaceGetFilm;
import base.Film;
import java.util.List;
/**
 *
 * @author moi
 */
@WebServlet(urlPatterns = {"/Film","/film"})
public class ServFilm extends HttpServlet {

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
        PrintWriter out = response.getWriter();
                    out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Test</title>");            
            out.println("</head>");
            out.println("<body>");
        try {
            
            javax.naming.Context ic = new javax.naming.InitialContext();
            InterfaceGetFilm f = (InterfaceGetFilm) ic.lookup("java:global/cinema/cinema-ejb/get_film");
            
            /* TODO output your page here. You may use following sample code. */
            if (request.getParameter("id")!=null)
            {
            Film film=  f.getFilm(new Long(request.getParameter("id")));
            if (film!=null)
            {
            out.println("<h1>" +film.getTitre() + "</h1>");
            out.println("<p>" +film.getRelease() + "</p>");
            out.println("<p>" +film.getRuntime() + " minutes</p>");
            out.println("<p>" +film.getPrix() + " €</p>");
            out.println("<img src=\"" +film.getAffiche("w500") + "\" />");
            }
            else
            {
                out.println("<p>Film non disponible </p>");
            }
            }
            else
            {
                List<Film> films = f.getAllFilm();
                for (Film film : films)
                {
                    out.println("<a href=\"Film?id="+film.getId()+"\">"+film.getTitre()+"</p>");
                }
            }

        }  catch (NamingException ex) {Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
        out.println(ex.toString());
        }
        
                    out.println("</body>");
            out.println("</html>");
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
