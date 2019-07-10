package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import listaDAO.ListaUsuarioDAO;
import modelo.Usuario;

/**
 *
 * @author JOHEL
 */
public class Controlador extends HttpServlet {

    public String index = "index.jsp";
    public String login = "vistas/login.jsp";
    public String registro = "vistas/register.jsp";
    public String zonaDeCarga = "vistas/zonaDeCarga.jsp";
    public String perfil = "vistas/Perfil_Usuario.jsp";
    public String zonaTrueques = "vistas/zonaDeTrueques.jsp";

    public Usuario usuario = new Usuario();
    public ListaUsuarioDAO listaUsuarioDAO = new ListaUsuarioDAO();
    public int cedula;
    public boolean seRegistro = false;
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
        //processRequest(request, response);
        String acceso = "";
        String accion = request.getParameter("accion");
        if (accion.equalsIgnoreCase("login")) {
            acceso = login;
        }else if (accion.equalsIgnoreCase("index")) {
            acceso = index;
        }else if (accion.equalsIgnoreCase("register")) {
            acceso = registro;
        } else if (accion.equalsIgnoreCase("verificarUsuario")) {

        } else if (accion.equalsIgnoreCase("zonaDeCarga")) {
            acceso = zonaDeCarga;

        } else if (accion.equalsIgnoreCase("perfil")) {
            request.setAttribute("actualUser", usuario);
            acceso = perfil;
        } else if (accion.equalsIgnoreCase("zonaDeTrueques")) {
            acceso = zonaDeCarga;
        }else if (accion.equalsIgnoreCase("registrar")) {
            try {
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String correo = request.getParameter("correo");
                String password = request.getParameter("password");
                int cedula = Integer.parseInt(request.getParameter("cedula"));
                String provincia = request.getParameter("provincia");
                String canton = request.getParameter("canton");
                String distrito = request.getParameter("distrito");
                usuario = new Usuario(nombre, apellido, password, cedula, correo, provincia, canton, distrito);
                listaUsuarioDAO.insertar(usuario);
                System.out.println(usuario.toString());
                acceso = login;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if (accion.equalsIgnoreCase("Iniciar Seccion")) {
            boolean seEntro = false;
            String correo = request.getParameter("correo");
            String password = request.getParameter("password");
            for (int i = 0; i < listaUsuarioDAO.getListaUsuario().size(); i++) {
                if ((listaUsuarioDAO.getListaUsuario().get(i).getEmail().equals(correo)) && (listaUsuarioDAO.getListaUsuario().get(i).getPassword().equals(password))) {
                seEntro = true;
                usuario = listaUsuarioDAO.getListaUsuario().get(i);
                }
            }
            if (seEntro == true) {
                request.setAttribute("actualUser", usuario);
                acceso = zonaDeCarga;
            }
        }else if (accion.equalsIgnoreCase("Cerrar Seccion")) {
            usuario.reiniciarUsuario();
            acceso = index;
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
