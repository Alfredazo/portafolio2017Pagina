<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
        <p><i>To display a different welcome page for this project, modify</i>
            <tt>index.jsp</tt> <i>, or create your own welcome page then change
                the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                welcome page and also update the welcome-file setting in</i>
            <tt>web.xml</tt>.</p>

        <a href="login.htm">Iniciar Sesión</a>
    

    <form:form method="post" action="login.htm" commandName="login2">
        <h1>Iniciar Sesión</h1>          
        Nombre Usuario o Email:<input class ="iptRegister" type="text" id="txtNombreUsuario" name="txtNombreUsuario" value="" />
        <br>
        Nombre Contraseña:<input class ="iptRegister" type="password" id="txtClave" name="txtClave" value="" />
        <br>            
        <input type="submit" id="btnRegister" name="btnRegister" value="Register" onclick="" style="cursor:pointer"/>
    </form:form>


</body>


</html>
