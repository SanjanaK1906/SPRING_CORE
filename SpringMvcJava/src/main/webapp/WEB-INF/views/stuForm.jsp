<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="log3" method="post">
<label for="name">sid:</label>
        <input type="text" id="sid" name="sid" required>
        <br><br>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <br><br>

        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required>
        <br><br>

        <label for="std_class">Class:</label>
        <input type="text" id="class" name="std_class" required>
        <br><br>

        <button type="submit">Submit</button>
</form>
</body>
</html>