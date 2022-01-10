<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
    <form action="addZipcode">
          <input type="text" name="zcode" placeholder="Enter zipcode"><br><br>
          <input type="text" name="state" placeholder="Enter state"><br><br>
          <input type="text" name="city" placeholder="Enter city"><br><br>
          <input type="text" name="country" placeholder="Enter country"><br><br>
          <input type="submit"><br><br><br>
    </form>
    
    <form action="getZipcode">
        <input type="text" name="zcode" placeholder="enter zipcode"><br><br>
        <input type="submit"><br>
        
    
    </form>
    
</body>
</html>