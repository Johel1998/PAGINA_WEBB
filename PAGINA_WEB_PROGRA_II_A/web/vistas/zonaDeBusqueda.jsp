<%-- 
    Document   : ZonaDeBusqueda
    Created on : 05/07/2019, 06:26:36 PM
    Author     : JOHEL
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Singleton.ArticuloS"%>
<%@page import="listaDAO.Lista_De_Articulos_DAO"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Articulo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../MyStyles.css" rel="stylesheet" type="text/css"/>
        <title>Zona De Busqueda</title>

    </head>
    <body>
        <h1>Zona De Busqueda</h1>
        <a href="Controlador?accion=perfil">perfil</a>
        <a href="Controlador?accion=zonaDeCarga">Zona De Carga</a>
        <br>
        <br>
        <table class="centrar">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                </tr>
            </thead>
            <%
                Lista_De_Articulos_DAO listaArticulosDAO = new Lista_De_Articulos_DAO();
                List<Articulo> list = listaArticulosDAO.obtenerArticulo();
                Iterator<Articulo> itr = list.iterator();
                Articulo articulo = null;
                while (itr.hasNext()) {
                    articulo = itr.next();
                //List <Articulo> listaDeArticulos = ArticuloS.getInstance().listaArticulos;
%>
            <tbody>
                <tr>
                    <td><%=articulo.getCodigo()%></td>
                    <td><%=articulo.getNombreArticulo()%></td>
                    <td><%=articulo.getPrecio()%></td>
                    <td>
                        <a></a>
                    </td>
                </tr>
                <%}%>
            </tbody>
        </table>
    </body>
</html>
