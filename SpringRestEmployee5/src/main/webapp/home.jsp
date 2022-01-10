<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form action="addEmployee">
          <input type="text" name="eId" placeholder="Enter eId"><br><br>
          <input type="text" name="eName" placeholder="Enter eName"><br><br>
          <input type="text" name="eDepartment" placeholder="Enter eDepartment "><br><br>
          <input type="text" name="eDesignation" placeholder="Enter eDesignation"><br><br>
          <input type="text" name="eSalary" placeholder="Enter eSalary"><br><br>
          <input type="submit"><br><br><br>
    </form>
    <form action="getEmployee" >
    <input type="text" name="eId" placeholder="Enter ID for searching"><br><br>
    <input type="Submit"><br><br>
    </form>
    
    <form action="deleteEmployee" >
    <input type="text" name="eId" placeholder="Enter ID for Delete"><br><br>
    <input type="Submit"><br><br>
    </form>
</body>
</html>