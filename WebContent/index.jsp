<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="MorgageCalculatorServlet" method="post">
  Enter Principal Amount:<br><input type="text" name="principal"><br>
  Enter the term:<br><input type="text" name="years">years<br><br>
  <input type="submit" value="Submit">
</form> 
<p> your total payment is:${result}</p>

</body>
</html>