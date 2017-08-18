var memory = echarts.init(document.getElementById("memory"));
var cpu = echarts.init(document.getElementById("cpu"));
var io = echarts.init(document.getElementById("io"));
var net = echarts.init(document.getElementById("net"));
$(function () {
    memory.setOption({
        title:{
          text:'内存利用率'
        },
        series: [{
            type: 'liquidFill',
            data: [0.6],
            radius: '70%',
            outline:{
                show:false
            }
        }]
    });

    io.setOption({
        title:{
            text:'磁盘IO'
        }, tooltip: {
            formatter: "{a} <br/>{c} {b}"
        },
        toolbox: {
            show: true,
            feature: {
                restore: {show: true},
                saveAsImage: {show: true}
            }
        },
        series: [
            {
                name: '计划施工项目数（个）',
                type: 'gauge',
                center: ['68%', '68%'],    // 默认全局居中
                radius: '50%',
                min: 0,
                max: 1000,
                splitNumber: 8,
                axisLine: {            // 坐标轴线
                    lineStyle: {       // 属性lineStyle控制线条样式
                        width: 8
                    }
                },
                axisTick: {            // 坐标轴小标记
                    length: 12,        // 属性length控制线长
                    lineStyle: {       // 属性lineStyle控制线条样式
                        color: 'auto'
                    }
                },
                splitLine: {           // 分隔线
                    length: 20,         // 属性length控制线长
                    lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
                        color: 'auto'
                    }
                },
                pointer: {
                    width: 5
                },
                title: {
                    offsetCenter: [0, '-30%'],       // x, y，单位px
                },
                detail: {
                    textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                        fontWeight: 'bolder'
                    }
                },
                data: [{value: 40, name: '写 次/秒'}]
            },
            {
                name: '计划施工项目数（个）',
                type: 'gauge',
                center: ['28%', '38%'],    // 默认全局居中
                radius: '50%',
                min: 0,
                max: 1000,
                splitNumber: 8,
                axisLine: {            // 坐标轴线
                    lineStyle: {       // 属性lineStyle控制线条样式
                        width: 8
                    }
                },
                axisTick: {            // 坐标轴小标记
                    length: 12,        // 属性length控制线长
                    lineStyle: {       // 属性lineStyle控制线条样式
                        color: 'auto'
                    }
                },
                splitLine: {           // 分隔线
                    length: 20,         // 属性length控制线长
                    lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
                        color: 'auto'
                    }
                },
                pointer: {
                    width: 5
                },
                title: {
                    offsetCenter: [0, '-30%'],       // x, y，单位px
                },
                detail: {
                    textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                        fontWeight: 'bolder'
                    }
                },
                data: [{value: 40, name: '写 次/秒'}]
            }
        ]
    });

    net.setOption({
        title:{
            text:'近期网络状况'
        },grid:{
          x:50,
            y:70
        },
        tooltip:{},
        legend:{
            data:['Total','Used','Free'],
            right: 'right'
        },
        xAxis: {
            type: 'time',
            data: [],
            splitLine: {
                show: false
            }
        },
        yAxis: {
            type: 'value',
            name:'M',
            boundaryGap: [0, '100%'],
            splitLine: {
                show: false
            }
        },series: [{
            name:'Total',
            type:'line',
            data: []
        },{
            name:'Used',
            type:'line',
            data: []
        },{
            name:'Free',
            type:'line',
            data: []
        }]
    });

    cpu.setOption({
        title:{
            text:'当前Cpu状态'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            right: 'right',
            data: ['User','IOWait','System','Other','Idle']
        },
        series : [
            {
                name: 'Cpu',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:335, name:'User'},
                    {value:310, name:'IOWait'},
                    {value:234, name:'System'},
                    {value:135, name:'Other'},
                    {value:1548, name:'Idle'}
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    })
});
