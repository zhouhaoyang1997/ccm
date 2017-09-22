var network = echarts.init(document.getElementById("cpu"));
var ipId = $("#ipId").val();
function getData(){
    $.get('../cpu/hour?ip='+ipId).done(function (data) {
        user=[];
        system=[];
        idle=[];
        interrupt=[];
        dpc=[];
        percent=[];
        //填入数据
        for(var i=0;i<data.length;i++){
            user.push(returnData(data[i].time,data[i].cpuUser));
            system.push(returnData(data[i].time,data[i].cpuSystem));
            idle.push(returnData(data[i].time,data[i].cpuIdle));
            interrupt.push(returnData(data[i].time,data[i].cpuInterrupt));
            dpc.push(returnData(data[i].time,data[i].cpuDpc));
            percent.push(returnData(data[i].time,data[i].cpuPercent));
        }
        network.setOption({
            series: [{
                // 根据名字对应到相应的系列
                name: 'user',
                data: user
            },{
                name: 'system',
                data: system
            },{
                name: 'idle',
                data: idle
            },{
                name: 'interrupt',
                data: interrupt
            },{
                name: 'dpc',
                data: dpc
            },{
                name: 'percent',
                data: percent
            }]
        })
    });
}
function returnData(date,value){
    var now = new Date(parseInt(date) * 1000);
    return {
        name:now.toString(),
        value:[[now.getFullYear(), now.getMonth() + 1, now.getDate()].join('/')+' '+[now.getHours(),now.getMinutes(),now.getSeconds()].join(':'),value]
    }
}
$(function () {

    network.hideLoading();
    network.setOption(
        {
            title: {
            }, tooltip: {},
            grid: {
                bottom: 80
            },
            dataZoom: [
                {
                    id: 'dataZoomX',
                    type: 'slider',
                    xAxisIndex: [0],
                    filterMode: 'filter',
                    start: 95,
                    end: 100
                }
            ],
            legend:{
                data:['user','system','idle','interrupt','dpc']
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
            name:'user',
            type:'line',
            data: []
        },{
            name:'system',
            type:'line',
            data: []
        },{
            name:'idle',
            type:'line',
            data: []
        },{
            name:'interrupt',
            type:'line',
            data: []
        },{
            name:'dpc',
            type:'line',
            data: []
        },{
            name:'percent',
            type:'line',
            data: []
        }
        ]}
    );
   var user=[];
    var system=[];
    var idle=[];
    var interrupt=[];
    var dpc=[];
    var percent=[];

    //getData();
    setInterval(getData(), 300*1000);
});