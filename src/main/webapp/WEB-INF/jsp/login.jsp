<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>集群管理</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/demo.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="apple-touch-icon" sizes="76x76" href="img/apple-icon.png">
    <link rel="icon" type="image/png" sizes="96x96" href="img/favicon.png">
</head>
<body>
<div id="wrapper">
    <div class="vertical-align-wrap">
        <div class="vertical-align-middle">
            <div class="auth-box ">
                <div class="left">
                    <div class="content">
                        <div class="header">
                            <div class="logo text-center"><img src="img/logo-dark.png" alt="Klorofil Logo"></div>
                            <p class="lead">请输入你的账户</p>
                        </div>
                        <form class="form-auth-small" method="post" action="${pageContext.request.contextPath}/login">
                            <div class="form-group">
                                <label class="control-label sr-only">用户名</label>
                                <input type="text" class="form-control" name="userName"  value="adm" placeholder="username">
                            </div>
                            <div class="form-group">
                                <label  class="control-label sr-only">密码</label>
                                <input type="password" class="form-control" name="password" value="123" placeholder="Password">
                            </div>
                            <button type="submit" class="btn btn-primary btn-lg btn-block">登陆</button>
                        </form>
                    </div>
                </div>
                <div class="right">
                    <div class="overlay"></div>
                    <div class="content text">
                        <h1 class="heading">根据您目前集群状况</h1>
                        <p>为你分配最为合理的虚拟机迁移方案</p>
                    </div>
                </div>
                <div class="clearfix"></div>
                <footer>
                    <div class="container-fluid">
                        <p class="copyright">&copy; 2017 感谢该模板的提供者</p>
                    </div>
                </footer>
            </div>
        </div>
    </div>
</div>
</body>
</html>
