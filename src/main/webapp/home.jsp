<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tg" %>

<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>

<tg:if test="${active[1].equals('1')}">
    <h1>Welcome ${active[0]}</h1>
    <a href="logout"><input type="submit" value="Logout"></a>
</tg:if>
<tg:if test="${active[1].equals('3')}">
    <h1>Incorrect Credentials</h1>
    <a href="logout"><input type="submit" value="Please Return"></a>
</tg:if>
<tg:if test="${active[1].equals('4')}">
    <h1>Not a authorized User</h1>
    <a href="logout"><input type="submit" value="Register"></a>
</tg:if>
<tg:if test="${active[1].equals('2')}">
    <h1>User Already Exist</h1>
    <a href="logout"><input type="submit" value="Register"></a>
</tg:if>



</body>
</html>