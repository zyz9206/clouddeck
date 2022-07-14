var username = document.getElementById("username");
var password = document.getElementById("password");

function response(){
    setCookie("userid","1");
    setCookie("username","root");
    alert("get!")
    window.location.href="clouddeck.html"
}

function login(){
    if(!username.value){
        alert("请先输入用户名");
        username.focus();
        return;
    }
    if(!password.value){
        alert("请输入密码");
        password.focus();
        return;
    }

    var UserNameText = username.value;
    var PasswordTest = password.value;

    var da = {
        "username":UserNameText,
        "password":PasswordTest
    };
    commonAjaxPost(true,"/userlogin",da,loginSuccess)
}
//成功回调函数
function loginSuccess(result){
    console.log(4);
    if (result.code == '666') {
        console.log(5);
        setCookie('isLogin','1');
        setCookie('userId',result.data.id);
        setCookie('userName',result.data.username);
        window.location.href = "clouddeck.html"
    }else if(result.code='669'){
        alert("用户名或密码错误");
    }else{
        //layer.msg("此用户不存在",{icon:2});
        $('#errorMsgBox').show()
        $('#errorMsgBox').text(result.message)
    }
}