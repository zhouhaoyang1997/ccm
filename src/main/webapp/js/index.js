/**
 * Created by 18236 on 2017/8/17.
 */


function act(ip){
    $.ajax({
        type:'get',
        contentType:'json',
        url:'/server/vm?ip='+ip,
        success:function (data) {
            fill(data);
        }
    })
}

function toLocalString(nS){
    return new Date(parseInt(nS) * 1000).toLocaleString().replace(/:\d{1,2}$/,' ');
}
function toPercent(num){
    return twoFixed(num * 100) + "%";
}
function twoFixed(num){
    return num.toFixed(2);
}

function fill(data){
    var html = '<div class="am-g"><div class="am-u-sm-12"><form class="am-form"><table class="am-table am-table-striped am-table-hover table-main">'+
    '<thead><tr><th class="table-id">IP</th><th class="table-type">服务器Ip</th><th class="table-title">CPU利用率</th><th class="table-set">内存利用率</th>'+
    '<th class="table-author am-hide-sm-only">流量(入/出)</th> <th class="table-date am-hide-sm-only">开机时间</th></tr></thead><tbody>';
    for(x in data.vm){
        html+= '<tr><td><a href="/vmDetail?ip='+data.vm[x].ipId+'">'+data.vm[x].ipId+'</a></td><td>'+data.vm[x].serverIp+'</td><td><a href="#"><span class="progress">'+
            '<div class="progress-bar am-progress-bar-success" style="width:'+toPercent(data.vm[x].cpuUtilization)+'">'+
            toPercent(data.vm[x].cpuUtilization)+'</div></span>'+
            '</a></td><td><a href="#"><span class="progress">'+
            '<div class="progress-bar am-progress-bar-success" style="width:'+toPercent(data.vm[x].memoryUtilization)+'">'+
            toPercent(data.vm[x].memoryUtilization)+'</div></span>'+
            '</a></td><td class="am-hide-sm-only"><a href="#">' +
            twoFixed(data.vm[x].receive)+'/'+twoFixed(data.vm[x].sent)+'kbps</a></td>' +
            '<td class="am-hide-sm-only">'+toLocalString(data.vm[x].bootTime)+'</td></tr>';
    }
    html+='</tbody></table><hr></form></div></div>';
    document.getElementById("filling").innerHTML='<div class="row" style="margin-left:30px" ></div><div class="tpl-portlet">'+
        '<div class="tpl-portlet-title">'+
        '<div class="tpl-caption font-green ">'+
        '<span>'+data.cluster+' > '+data.server+'</span>'+
        '</div></div>'+html;
        '</div>';
}