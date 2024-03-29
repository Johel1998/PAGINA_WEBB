package Controlador;

import DAO.arrayList.ProductoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.Producto;

@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    public String listar = "vistas/listar.jsp";    // listar.jsp

    public String agregar="vistas/agregar.jsp";    // agregar.jsp

    public String editar="vistas/editar.jsp";    // editar.jsp
   
    
    public Producto p = new Producto();
    public ProductoDAO dao = new ProductoDAO();
    public int id;
    
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
       
       String acceso ="";
       String accion = request.getParameter("accion");
       if (accion.equalsIgnoreCase("listar")){
            acceso = listar;
       }else if(accion.equalsIgnoreCase("agregar")){
            acceso=agregar;
        }else if(accion.equalsIgnoreCase("insertar")){
            String nombre = request.getParameter("txtNombre");
            String apellidos = request.getParameter("txtApellidos");
//            p.setNombre(nombre);
//            p.setApellidos(apellidos);
//            dao.insertar(p);
            acceso=listar;
        }else if(accion.equalsIgnoreCase("editar")){
            request.setAttribute("id_alumno", request.getParameter("id"));
            acceso=editar;
        }else if(accion.equalsIgnoreCase("actualizar")){
            int id = Integer.parseInt(request.getParameter("txtId"));
            String nombre = request.getParameter("txtNombre");
            String apellidos = request.getParameter("txtApellido");
//            p.setId(id);
//            p.setNombre(nombre);
//            p.setApellidos(apellidos);
//            dao.actualizar(p);
           acceso=listar; 
        }else if(accion.equalsIgnoreCase("eliminar")){
            int id = Integer.parseInt(request.getParameter("id"));
//            p.setId(id);
//            dao.eliminar(p);
            acceso = listar;
        }
       
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
       
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
