//create by zyz
//the basic frame
//maybe some tips only can be resolved by utf8
var questionnum=0;
function theone(){//按钮1对应逻辑，以下同理
    //console.log(1);
    var da={
        "id":"1"
    }
    questionnum=1;
    commonAjaxPost(true,"/showquestion",da,updatequestion)

}

function thetwo(){
    var da={
        "id":"2"
    }
    questionnum=2;
    commonAjaxPost(true,"/showquestion",da,updatequestion)
}
function thethree(){
    var da={
        "id":"3"
    }
    questionnum=3;
    commonAjaxPost(true,"/showquestion",da,updatequestion)
}
function thefour(){
    var da={
        "id":"4"
    }
    questionnum=4;
    commonAjaxPost(true,"/showquestion",da,updatequestion)
}
function thefive(){
    var da={
        "id":"5"
    }
    questionnum=5;
    commonAjaxPost(true,"/showquestion",da,updatequestion)
}
function thesix(){
    var da={
        "id":"6"
    }
    questionnum=6;
    commonAjaxPost(true,"/showquestion",da,updatequestion)
}function theseven(){
    var da={
        "id":"7"
    }
    questionnum=7;
    commonAjaxPost(true,"/showquestion",da,updatequestion)
}

function updatequestion(result){
    if (result.code == '666') {
        var data=result.data;
        var title=document.getElementById('title');
        var detail=document.getElementById('detail');
        title.innerHTML=data.title;
        detail.innerHTML=data.detail;
    }else{
        $('#errorMsgBox').show()
        $('#errorMsgBox').text(result.message)
    }
}
//预设七道题，先写七个的逻辑

//环境载入
function loadenvironment(){
    var status=document.getElementById('status');
    if(questionnum==0){
        status.innerText="还没有选择题目！"
        return;
    }
    status.innerText="载入中。。。"
    var da={
        "id":questionnum
    }
    commonAjaxPost(true,"/loadenvironment",da,loadsuccess)
}

//成功载入环境回调
function loadsuccess(result){
    if(result.code=='666'){
        console.log("1");
        var status=document.getElementById('status');
        status.innerText="载入完成，请开始操作！";
    }
    else{
        $('#errorMsgBox').show()
        $('#errorMsgBox').text(result.message)
    }
}

function backto(){
    console.log(1)
    //var winx=self.parent.document.getElementById("mysql");
    //winx.close(0);
    parent.location.href="index.html";
}

//判题逻辑发送请求
function judgecommit(){
    var status=document.getElementById('status');
    if(questionnum==0){
        status.innerText="还没有选择题目！"
        return;
    }
    status.innerText="题目判断中。。。";
    if(questionnum==6||questionnum==7){
        var text=document.getElementById("answer");
        if(!text.value){
            status.innerText="请输入查询语句后提交。";
            alert("请输入查询语句后提交。");
            return;
        }
        var sqlselect=text.value;
        var da={
            "id":questionnum,
            "sqlselect":sqlselect
        }
    }
    else{
        console.log(2);
        var da={
            "id":questionnum
        }
    }
    commonAjaxPost(true,"/compareresult",da,resultback)
}

//判题结果回调函数
function resultback(result){
    var status=document.getElementById("status")
    var test=0;
    if(result.code=="666"){
        status.innerText="执行成功，答案正确！";
        test=1;
    }
    else if(result.code=="669"){
        status.innerText="答案错误。请继续操作或重新载入环境再试一次。";
        test=0;
    }
    var userid=getCookie("userId");
    var da={
        "user_id":userid,
        "question_id":questionnum,
        "result":test
    }
    commonAjaxPost(true,"/uploadhistory",da)
}

function history(){
    var id=getCookie("userId")
    console.log(id)
    setCookie("userId",id);
    parent.location.href="history.html"
}