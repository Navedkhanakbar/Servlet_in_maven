<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <body>
    <h2>User List</h2>
    <ul>
      <c:forEach var="user" items="${userslist}">
        <li>${user}</li>
      </c:forEach>
    </ul>
  </body>
</html>

