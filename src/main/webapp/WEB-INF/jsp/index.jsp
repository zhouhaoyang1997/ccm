<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
    <link rel="stylesheet" href="../css/amazeui.min.css"/>
    <link rel="stylesheet" href="../css/admin.css">
    <link rel="stylesheet" href="../css/app.css">
    <script src="../js/jquery.min.js"></script>
    <script src="../js/echarts.min.js"></script>

    <title>CCM</title>
</head>
<body>
<header class="am-topbar am-topbar-inverse admin-header">
    <div class="am-topbar-brand">
        <a href="javascript:;" class="tpl-logo">
            <img src="../img/logo.png" alt="" style="margin-top: 30px;">
        </a>
    </div>
</header>
<div class="tpl-page-container tpl-page-header-fixed">


    <div class="tpl-left-nav tpl-left-nav-hover">
        <div class="tpl-left-nav-title" style="font-size: 17px;">
            集群列表
        </div>
        <div class="tpl-left-nav-list">
            <ul class="tpl-left-nav-menu">
                <c:forEach var="cluster" items="${cluster}">

                    <li class="tpl-left-nav-item">
                        <a href="javascript:;" class="nav-link tpl-left-nav-link-list active">
                            <i class="am-icon-bar-chart"></i>
                            <span>${cluster.cluster}</span>
                            <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right"></i>
                        </a>

                        <ul class="tpl-left-nav-sub-menu" style="display:block">
                            <c:forEach var="serv" varStatus="status" items="${cluster.serverIp}">
                                <li>
                                    <a href="javascript:;" onclick="act('${serv}')"
                                       data-server="${serv}">
                                            <span style="margin-left:30px"><i
                                                    class="am-icon-television"></i>${serv}</span>
                                    </a>
                                </li>
                            </c:forEach>
                        </ul>
                    </li>

                </c:forEach>
            </ul>
        </div>
    </div>

    <div class="tpl-content-wrapper" id="filling">
        <div class="am-g">
            <div class="am-u-sm-12">
                <form class="am-form">
                    <table class="am-table am-table-striped am-table-hover table-main">
                        <thead>
                        <tr>
                            <th>名称</th>
                            <th>IP</th>
                            <th>服务器Ip</th>
                            <th>CPU利用率</th>
                            <th>内存利用率</th>
                            <th>流量(入/出)</th>
                            <th>开机时间</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="vm" items="${server.vm}">


                        <tr>
                            <td><a href="/vmDetail?ipId=${vm.ipId}">${vm.osPlatform}</a></td>
                            <td>${vm.ipId}</td>

                            <td>${vm.serverIp}</td>

                            <td><a href="#"><span class="progress">
            <div class="progress-bar am-progress-bar-success" style="width: ${vm.cpuPercent}%;">${vm.cpuPercent}%
            </div></span>
                            </a></td>
                            <td><a href="#"><span class="progress">
            <div class="progress-bar am-progress-bar-success" style="width:${vm.memoryPercent}%;">${vm.memoryPercent}%
            </div></span>
                            </a></td>
                            <td><a href="#">${vm.sent}/${vm.receive}Kbps
                                </a></td>
                            <td>${vm.bootTime}</td>
                        </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    <hr>
                </form>
            </div>
        </div>
    </div>


</div>

<script src="../js/amazeui.min.js"></script>
<script src="../js/iscroll.js"></script>
<script src="../js/app.js"></script>
</body>
</html>
