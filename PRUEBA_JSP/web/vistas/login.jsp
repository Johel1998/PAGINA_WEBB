<%-- 
    Document   : Login
    Created on : 05/07/2019, 06:23:42 PM
    Author     : JOHEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Iniciar Seccion</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../css/MyStyles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <h1>Iniciar Seccion</h1>
        </header>
        <main>
            <form action="">
                <div id="enLineaBloque">
                    <label class="labelCrearUsuario" for="nombre">Nombre Usuario:<label>
                    <input type="text" name="nombre" id="nombre" required/> <br/>
                    <br/>
                    <label class="labelCrearUsuario" for="password">Contraseña:</label>
                    <input type="password" name="password" id="password" required/> <br/> 
                    <br/>
            </form>
        </main>
        <div id="botones">
            <input type="submit" value="Continuar" name="continuar" id="enviar"/>
            <input type="reset" value="Limpiar Campos" name="limpiar" id="enviar"/>
        <footer>
            <nav>
                <ul> 
                    <li>
                        <a href="index.jsp">Inicio</a>
                        <a href="register.jsp">Crear Usuario</a>

                    </li>
                </ul>
            </nav>
        </footer>
    </body>
</html>
