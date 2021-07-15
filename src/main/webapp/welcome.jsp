
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <link href="Style.css" type="text/css" rel="stylesheet">

</head>
<body>
<div class="title">
    <h1>Welcome..!</h1>
</div>

<div class="container">
    <div class="logout">
        <form action="login" method="post" methodAttribute="user">
            <table>
                <tr class="heading_l">
                    <td colspan="2" align="center ">Login</td>
                </tr>
                <tr>
                    <td><label for="signin_un">Username</label></td>
                    <td><input type="text" name="username"  id="signin_un"
                               placeholder="Username" required></td>
                </tr>
                <tr>
                    <td><label for="signin_pwd">Password</label></td>
                    <td><input type="password" name="password" id="signin_pwd"
                               placeholder="Password"  required></td>
                </tr>
                <tr>
                    <td colspan="2" align="right"><input type="submit"
                                                         value="Signin"></td>
                </tr>
            </table>
        </form>

    </div>

    <div class="container">
        <div class="logout">
            <form action="register" method="post" modelAttribute="user">
                <table>
                    <tr class="heading_l">
                        <td colspan="2" align="center ">Register</td>
                    </tr>
                    <tr>
                        <td><label for="signup_un">Username</label></td>
                        <td><input type="text" name="username" id="signup_un"
                                   placeholder="Username" required></td>
                    </tr>
                    <tr>
                        <td><label for="signup_pwd">Password</label></td>
                        <td><input type="password" name="password" id="signup_pwd"
                                   placeholder="Password" required></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="right"><input type="submit"
                                                             value="Signup"></td>
                    </tr>
                </table>
            </form>

        </div>
    </div>
</div>
</body>
</html>