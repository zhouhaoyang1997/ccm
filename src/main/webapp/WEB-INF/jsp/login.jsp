<%--
  Created by IntelliJ IDEA.
  User: 18236
  Date: 2017/9/15
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登陆ccm</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/style.css">

</head>
<body class="style-3">

<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-push-8">


            <!-- Start Sign In Form -->
            <form action="${pageContext.request.contextPath}/login" method="post" class="fh5co-form animate-box" data-animate-effect="fadeInRight">
                <h2>登陆</h2>
                <div class="form-group">
                    <input type="text" class="form-control"  name="userName" placeholder="用户名" autocomplete="off">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control"  name="password" placeholder="密码" autocomplete="off">
                </div>
                <div class="form-group">
                    <input type="submit" value="登陆" class="btn btn-primary">
                </div>
            </form>
            <!-- END Sign In Form -->


        </div>
    </div>
</div>
</body>
</html>
