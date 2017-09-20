var ipid = $("#ipId").val();
var memory = echarts.init(document.getElementById("memory"));
var cpu = echarts.init(document.getElementById("cpu"));
var net = echarts.init(document.getElementById("net"));
memory.setOption({
    title:{
        text:'内存利用率'
    },
    series: [{
        type: 'liquidFill',
        radius: '70%',
        outline:{
            show:false
        }
    }]
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
        data:['Send','Recv'],
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
        name:'K',
        boundaryGap: [0, '100%'],
        splitLine: {
            show: false
        }
    },series: [{
        name:'Send',
        type:'line',
        data: []
    },{
        name:'Recv',
        type:'line',
        data: []
    }
    ]
});
cpu.setOption({
    title:{
        text:'当前Cpu状态'
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    series : [
        {
            name: 'Cpu',
            type: 'pie',
            radius : '55%',
            center: ['50%', '60%'],
            itemStyle: {
                emphasis: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
});
//小数转换
function twoFixed(num){
    return num.toFixed(2);
}

function returnData(date,value){
    var now = new Date(parseInt(date) * 1000);
    return {
        name:now.toString(),
        value:[[now.getFullYear(), now.getMonth() + 1, now.getDate()].join('/')+' '+[now.getHours(),now.getMinutes(),now.getSeconds()].join(':'),value]
    }
}
$(function () {


    $.get("/memory/current?ip="+ipid).done(function (data) {
        var current=[];
        current.push(data.utilization.toFixed(2));
        memory.setOption({
            series:[{
                data:current
            }]
        })
    });


    $.get("/net/current?ip="+ipid).done(function (data) {
        send=[];
        recv=[];
        //填入数据
        for(var i=0;i<data.length;i++){
            send.push(returnData(data[i].time,data[i].netIobytessent));
            recv.push(returnData(data[i].time,data[i].netIobytesrecv));
        }
        net.setOption({
            series: [{
                // 根据名字对应到相应的系列
                name: 'Send',
                data: send
            },{
                name: 'Recv',
                data: recv
            }]
        })
    });



    $.get("/cpu/current?ip="+ipid).done(function (data) {
        var current=[];
        current.push({value:data.cpuUser,name:'User'});
        current.push({value:data.cpuSystem,name:'System'});
        current.push({value:data.cpuIdle,name:'Idle'});
        current.push({value:data.cpuInterrupt,name:'Interrupt'});
        current.push({value:data.cpuDpc,name:'Other'});
        cpu.setOption({
            series:[{
                data:current
            }]
        })
    });


});
