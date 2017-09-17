var memory = echarts.init(document.getElementById("memory"));
var ipId = $("#ipId").val();
$(function () {

    memory.setOption(
        {
            tooltip:{},
            grid: {
                bottom: 80
            },
            dataZoom: [
                {
                    id: 'dataZoomX',
                    type: 'slider',

                    xAxisIndex: [0],
                    filterMode: 'filter', // 设定为 'filter' 从而 X 的窗口变化会影响 Y 的范围。
                    start: 20,
                    end: 80
                }
            ],
            legend:{
                data:['Total','Used','Free']
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
        }
        ]}
    );


    //getData();
    setInterval(getData(), 300*1000);
});
function getData(){
    $.get('../memory/hour?ip='+ipId).done(function (data) {
        var total=[];
        var used=[];
        var free=[];
        //填入数据
        for(var i=0;i<data.length;i++){
            total.push(returnData(data[i].time,data[i].memoryTotal));
            used.push(returnData(data[i].time,data[i].memoryUsed));
            free.push(returnData(data[i].time,data[i].memoryFree));
        }
        memory.setOption({
            series: [{
                // 根据名字对应到相应的系列
                name: 'total',
                data: total
            },{
                name: 'Used',
                data: used
            },{
                name: 'Free',
                data: free
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