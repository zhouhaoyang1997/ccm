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
    <script src="../js/index.js"></script>
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
                <c:forEach var="cluster" items="${clusterAndServ}">

                    <li class="tpl-left-nav-item">
                        <a href="javascript:;" class="nav-link tpl-left-nav-link-list active">
                            <i class="am-icon-bar-chart"></i>
                            <span>${cluster.key}</span>
                            <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right"></i>
                        </a>

                        <ul class="tpl-left-nav-sub-menu" style="display:block">
                            <c:forEach var="serv" varStatus="status" items="${cluster.value}">
                                <c:if test="${status.index==0}">
                                    <li>
                                        <a href="javascript:;" onclick="act('${serv}')" id="firstData" data-server="${serv}">
                                            <span style="margin-left:30px"><i class="am-icon-television"></i>${serv}</span>
                                        </a>
                                    </li>
                                </c:if>
                                <c:if test="${status.index!=0}">
                                    <li>
                                        <a href="javascript:;" onclick="act('${serv}')">
                                            <span style="margin-left:30px"><i class="am-icon-television"></i>${serv}</span>
                                        </a>
                                    </li>
                                </c:if>
                            </c:forEach>
                        </ul>
                    </li>

                </c:forEach>
            </ul>
        </div>
    </div>

    <div class="tpl-content-wrapper">
        <div class="row" style="margin-left:30px" id="filling">

        </div>
    </div>



</div>

        </div>
    </div>
</div>
<script src="../js/amazeui.min.js"></script>
<script src="../js/iscroll.js"></script>
<script src="../js/app.js"></script>
</body>
</html>
