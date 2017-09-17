var network = echarts.init(document.getElementById("network"));
var ipId = $("#ipId").val();
function getData(){
    $.get('../network/hour?ip='+ipId).done(function (data) {
        send=[];
        recv=[];
        //填入数据
        for(var i=0;i<data.length;i++){
            send.push(returnData(data[i].time,data[i].netIobytessent));
            recv.push(returnData(data[i].time,data[i].netIobytesrecv));
        }
        network.setOption({
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
}
function returnData(date,value){
    var now = new Date(parseInt(date) * 1000);
    return {
        name:now.toString(),
        value:[[now.getFullYear(), now.getMonth() + 1, now.getDate()].join('/')+' '+[now.getHours(),now.getMinutes(),now.getSeconds()].join(':'),value/1024]
    }
}
$(function () {


    network.setOption(
        {
            title: {
                text: 'Network'
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
                    start: 30,
                    end: 70
                }
            ],
            legend:{
                data:['Send','Recv']
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
        ]}
    );
    var send=[];
    var recv=[];


    //getData();
    setInterval(getData(), 300*1000);
});