$(function (){
    var history=document.getElementById("insert");
    var id=getCookie("userId");
    console.log(id)
    var da={
        "id":id
    }
    commonAjaxPost(true,"/historysearch",da,showhistory)
})

function showhistory(result){
    var history=document.getElementById("insert");
    if(result.code="666"){
        var data=result.data
        var html="";
        if(data.length){
            html+="<table border=\"1\" style=\"margin:0 auto\">";
            html+="<tr class=\"s5\"> <th class=\"s5\">题目编号</th> <th class=\"s5\">提交时间</th>  <th class=\"s5\">做题结果</th> </tr>";
            for(var i=0;i<data.length;i++){
                var historyinfo=data[i];
                html+="<tr class=\"s5\">";
                html+="<td class=\"s5\">"+historyinfo.question_id+"</td>";
                html+="<td class=\"s5\">"+historyinfo.time+"</td>";
                if(historyinfo.result==1){
                    html+="<td class=\"s5\">"+"答案正确"+"</td>";
                }
                else{
                    html+="<td class=\"s5\">"+"答案错误"+"</td>";
                }
                html+="</tr>";
            }
        }
        history.innerHTML=html;
    }
    else{
        history.innerText="暂无历史记录";
    }
}

function back(){
    var id=getCookie("userId");
    setCookie("userId",id);
    window.location.href="clouddeck.html"
}