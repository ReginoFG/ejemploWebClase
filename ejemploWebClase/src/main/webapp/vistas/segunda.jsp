<%@ include file="/vistas/cabecera.jsp" %>
<html>
  <head>
  <title>SegundaEjemploWeb</title>
  </head>
  <body>
    <h1>EJEMPLO APLICACI�N WEB</h1>
    <p>SEGUNDA (dentro de vistas)</p>
    <p>Mensaje del controlador: <c:out value="${miModelo.mensaje}"/></p>
    <p>hola: ${miModelo.mensaje}</p>
  </body>
</html>