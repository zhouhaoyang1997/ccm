<%--
  Created by IntelliJ IDEA.
  User: 18236
  Date: 2017/8/18
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
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
<!-- WRAPPER -->
<div id="wrapper">
    <!-- NAVBAR -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="brand">
            <a href="index.html"><img src="img/logo-dark.png" alt="Klorofil Logo" class="img-responsive logo"></a>
        </div>
        <div class="container-fluid">
            <div class="navbar-btn">
                <button type="button" class="btn-toggle-fullwidth"><i class="lnr lnr-arrow-left-circle"></i></button>
            </div>
            <div id="navbar-menu">
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle icon-menu" data-toggle="dropdown">
                            <i class="lnr lnr-alarm"></i>
                            <span class="badge bg-danger">2</span>
                        </a>
                        <ul class="dropdown-menu notifications">
                            <li><a href="#" class="notification-item"><span class="dot bg-warning"></span>集群xx中的xx服务器中xx虚拟机xx利用率过高</a>
                            </li>
                            <li><a href="#" class="notification-item"><span class="dot bg-danger"></span>集群xx中的xx服务器中xx虚拟机xx利用率过高</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="img/user.png"
                                                                                        class="img-circle" alt="Avatar">
                            <span>Samuel</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
                        <ul class="dropdown-menu">
                            <li><a href="#"><i class="lnr lnr-exit"></i> <span>注销</span></a></li>
                        </ul>
                </ul>
            </div>
        </div>
    </nav>
    <!-- END NAVBAR -->
    <!-- LEFT SIDEBAR -->
    <div id="sidebar-nav" class="sidebar">
        <div class="sidebar-scroll">
            <!--集群和物理机列表 -->
            <nav>
                <ul class="nav">
                    <c:forEach var="cluster" varStatus="idNum" items="${cluster}">
                        <li><a href="#collspase${idnum}" data-toggle="collapse" class="active"><i
                                class="lnr lnr-home"></i><span>${cluster.cluster}</span><i
                                class="icon-submenu lnr lnr-chevron-right"></i></a>
                            <div class="collapse in" id="collspase${idnum}">
                                <ul class="nav">
                                    <c:forEach var="serv" items="${cluster.serverIp}">
                                        <li><a href="${pageContext.request.contextPath}/server?serverIp=${serv}"
                                               class="">${serv}</a></li>
                                    </c:forEach>
                                </ul>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
            </nav>
        </div>
    </div>
    <!-- END LEFT SIDEBAR -->
    <!-- MAIN -->
    <div class="main">
        <!-- MAIN CONTENT -->
        <div class="main-content">
            <div class="container-fluid">
                <h3><span>${location.cluster}</span><i
                        class="icon-submenu lnr lnr-chevron-right"></i><a
                        href="/server?serverIp=${location.serverIp}">${vm.serverIp}</a><i
                        class="icon-submenu lnr lnr-chevron-right"></i><a href="/vm?ipId=${location.ipId}">${vm.ipId}</a></h3>

                <div class="panel panel-success">
                    <div class="panel-heading"><h3>信息总览</h3></div>
                    <div class="panel-body">
                        <table>
                            <tr><td>cpu核心数:</td><td>${vm.cpuCount}核</td></tr>
                            <tr><td>内存大小:</td><td>${vm.memoryTotal}M</td></tr>
                            <tr><td>名称:</td><td>${vm.pcName}</td></tr>
                            <tr><td>系统开机时间:</td><td>${vm.bootTime}</td></tr>
                        </table>
                    </div>
                </div>
            <div class="row">
                <input type="hidden" value="${vm.ipId}" id="ipId">
                <!-- Row start -->
                <div class="col-md-3">
                    <div class="card-box" style="background-color: #ffffff">
                        <h4 class="header-title m-t-0" align="center">CPU</h4>
                        <a href="../cpu?ip=${vm.ipId}" data-toggle="tooltip" data-placement="top" title="点击查看近期详情">
                            <div id="cpu" style="height: 345px"></div>
                        </a>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="card-box" style="background-color: #ffffff">
                        <h4 class="header-title m-t-0" align="center">内存</h4>
                        <a href="../memory?ip=${vm.ipId}" data-toggle="tooltip" data-placement="top"
                           title="点击查看近期详情">
                            <div id="memory" style="height: 345px"></div>
                        </a>
                    </div>
                </div>

                <div class="col-md-3">
                    <div class="card-box" style="background-color: #ffffff">
                        <h4 class="header-title m-t-0" align="center">网络</h4>
                        <a href="../net?ip=${vm.ipId}" data-toggle="tooltip" data-placement="top"
                           title="点击查看近期详情">
                            <div id="net" style="height: 345px;">

                            </div>
                        </a>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="card-box" style="background-color: #ffffff">
                        <h4 class="header-title m-t-0" align="center">磁盘IO</h4>
                        <a href="../io?ip=${vm.ipId}" data-toggle="tooltip" data-placement="top" title="点击查看近期详情">
                            <div id="io" style="height: 345px;"></div>
                        </a>
                    </div>
                </div>
            </div>
        </div>

        </div>
        <!-- END MAIN CONTENT -->
    </div>
    <!-- END MAIN -->

    <div class="clearfix"></div>
    <footer>
        <div class="container-fluid">
            <p class="copyright">&copy; 2017 感谢该模板的提供者</p>
        </div>
    </footer>
</div>
<!-- END WRAPPER -->
<!-- Javascript -->
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/klorofil-common.js"></script>
<script src="js/echarts.min.js"></script>
<script src="js/echarts-liquidfill.js"></script>
<script src="js/vmDetail.js"></script>
</body>

</html>