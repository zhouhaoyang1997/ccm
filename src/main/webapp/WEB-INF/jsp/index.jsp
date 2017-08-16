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
                <li class="tpl-left-nav-item">
                    <a href="javascript:;" class="nav-link tpl-left-nav-link-list">
                        <i class="am-icon-bar-chart"></i>
                        <span>xx集群</span>
                        <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right"></i>
                    </a>
                    <ul class="tpl-left-nav-sub-menu">
                        <li>
                            <a href="javascript:;" class="nav-link tpl-left-nav-link-list">
                                <span style="margin-left:30px"><i class="am-icon-television"></i>xx服务器</span>
                                <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right"></i>
                            </a>
                            <ul class="tpl-left-nav-sub-menu" style="margin-left:25px">
                                <li>
                                    <a href="#">
                                        <span>xx虚拟机</span>
                                    </a>

                                    <a href="#">
                                        <span>xx服务器</span>
                                    </a>

                                    <a href="#">
                                        <span>xx服务器</span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="javascript:;" class="nav-link tpl-left-nav-link-list">
                                <span style="margin-left:30px"><i class="am-icon-television"></i>xx服务器</span>
                                <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right"></i>
                            </a>
                            <ul class="tpl-left-nav-sub-menu" style="margin-left:25px">
                                <li>
                                    <a href="#">
                                        <span>xx虚拟机</span>
                                    </a>

                                    <a href="#">
                                        <span>xx服务器</span>
                                    </a>

                                    <a href="#">
                                        <span>xx服务器</span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="javascript:;" class="nav-link tpl-left-nav-link-list">
                                <span style="margin-left:30px"><i class="am-icon-television"></i>xx服务器</span>
                                <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right"></i>
                            </a>
                            <ul class="tpl-left-nav-sub-menu" style="margin-left:25px">
                                <li>
                                    <a href="#">
                                        <span>xx虚拟机</span>
                                    </a>

                                    <a href="#">
                                        <span>xx虚拟机</span>
                                    </a>

                                    <a href="#">
                                        <span>xx虚拟机</span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li class="tpl-left-nav-item">
                    <a href="javascript:;" class="nav-link tpl-left-nav-link-list">
                        <i class="am-icon-bar-chart"></i>
                        <span>xx集群</span>
                        <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right"></i>
                    </a>
                    <ul class="tpl-left-nav-sub-menu">
                        <li>
                            <a href="#">
                                <i class="am-icon-angle-right"></i>
                                <span>xx服务器</span>
                            </a>

                            <a href="#">
                                <i class="am-icon-angle-right"></i>
                                <span>xx服务器</span>
                            </a>

                            <a href="#">
                                <i class="am-icon-angle-right"></i>
                                <span>xx服务器</span>
                            </a>
                        </li>
                    </ul>
                </li>

                <li class="tpl-left-nav-item">
                    <a href="javascript:;" class="nav-link tpl-left-nav-link-list">
                        <i class="am-icon-bar-chart"></i>
                        <span>xx集群</span>
                        <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right"></i>
                    </a>
                    <ul class="tpl-left-nav-sub-menu">
                        <li>
                            <a href="#">
                                <i class="am-icon-angle-right"></i>
                                <span>xx服务器</span>
                            </a>

                            <a href="#">
                                <i class="am-icon-angle-right"></i>
                                <span>xx服务器</span>
                            </a>

                            <a href="#">
                                <i class="am-icon-angle-right"></i>
                                <span>xx服务器</span>
                            </a>
                        </li>
                    </ul>
                </li>

                <li class="tpl-left-nav-item">
                    <a href="javascript:;" class="nav-link tpl-left-nav-link-list">
                        <i class="am-icon-bar-chart"></i>
                        <span>xx集群</span>
                        <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right tpl-left-nav-more-ico-rotate"></i>
                    </a>
                    <ul class="tpl-left-nav-sub-menu">
                        <li>
                            <a href="#">
                                <i class="am-icon-angle-right"></i>
                                <span>xx服务器</span>
                            </a>

                            <a href="#">
                                <i class="am-icon-angle-right"></i>
                                <span>xx服务器</span>
                            </a>

                            <a href="#">
                                <i class="am-icon-angle-right"></i>
                                <span>xx服务器</span>
                            </a>
                        </li>
                    </ul>
                </li>

            </ul>
        </div>
    </div>

    <div class="tpl-content-wrapper">
        <div class="row" style="margin-left:30px">
            <div class="tpl-portlet">
                <div class="tpl-portlet-title">
                    <div class="tpl-caption font-green ">
                        <span>集群xxx</span>
                    </div>

                </div>

                <div class="am-tabs tpl-index-tabs" data-am-tabs>
                    <ul class="am-tabs-nav am-nav am-nav-tabs">
                        <li class="am-active"><a href="#tab1">CPU</a></li>

                        <li><a href="#tab2">Memory</a></li>
                        <li><a href="#tab3">Network</a></li>
                    </ul>

                    <div class="am-tabs-bd">
                        <div class="am-tab-panel am-fade am-in am-active" id="tab1">
                            <div class="tpl-echarts" id="cpu">
                            </div>
                            <script type="text/javascript">
                                    var trends = echarts.init(document.getElementById("cpu"));

                                    function randomData() {
                                        now = new Date(+now + oneDay);
                                        value = value + Math.random() * 21 - 10;
                                        return {
                                            name: now.toString(),
                                            value: [
                                                [now.getFullYear(), now.getMonth() + 1, now.getDate()].join('/'),
                                                Math.round(value)
                                            ]
                                        }
                                    }

                                    var data = [];
                                    var now = +new Date(1997, 9, 3);
                                    var oneDay = 24 * 3600 * 1000;
                                    var value = Math.random() * 1000;
                                    for (var i = 0; i < 1000; i++) {
                                        data.push(randomData());
                                    }

                                    option = {
                                        title: {
                                            text: 'CPU + 时间坐标轴'
                                        },
                                        tooltip: {
                                            trigger: 'axis',
                                            formatter: function (params) {
                                                params = params[0];
                                                var date = new Date(params.name);
                                                return date.getDate() + '/' + (date.getMonth() + 1) + '/' + date.getFullYear() + ' : ' + params.value[1];
                                            },
                                            axisPointer: {
                                                animation: false
                                            }
                                        },
                                        xAxis: {
                                            type: 'time',
                                            splitLine: {
                                                show: false
                                            }
                                        },
                                        yAxis: {
                                            type: 'value',
                                            boundaryGap: [0, '100%'],
                                            splitLine: {
                                                show: false
                                            }
                                        },
                                        series: [{
                                            name: '模拟数据',
                                            type: 'line',
                                            showSymbol: false,
                                            hoverAnimation: false,
                                            data: data
                                        }]
                                    };

                                    timeTicket = setInterval(function () {

                                        for (var i = 0; i < 5; i++) {
                                            data.shift();
                                            data.push(randomData());
                                        }

                                        trends.setOption({
                                            series: [{
                                                data: data
                                            }]
                                        });
                                    }, 1000);

                                    trends.setOption(option);
                            </script>
                        </div>
                        <div class="am-tab-panel am-fade" id="tab2">

                        </div>

                        <div class="am-tab-panel am-fade" id="tab3">

                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="../js/jquery.min.js"></script>
<script src="../js/amazeui.min.js"></script>
<script src="../js/iscroll.js"></script>
<script src="../js/app.js"></script>
</body>
</html>
