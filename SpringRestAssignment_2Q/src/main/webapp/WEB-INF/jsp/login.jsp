<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
  <h2>${errorMsg}</h2>
   <form method="post">
     <input type="text" name="UserId" placeholder="User ID"/>
      <br><br>
     <input type="password" name="Password" placeholder="password"/>
      <br><br>
     <button>Submit</button>
  </form>
</body>
</html>