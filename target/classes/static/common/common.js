var httpRequestUrl = "http://localhost:9090";

function header() {
    var urlPath = UrlSearch();
    var header = "";
    header += '<div class="header headerFixed">\n' +
        '        <div class="my-container clearfix">\n' +
        '            <div id="ctl01_divreturn" class="logo pull-left">\n';
    if (urlPath != "myProject.html" && urlPath != "myQuestionnaires.html") {
        header += '<a href="javascript:history.go(-1)" class="hover" id="hrefPGoBack"><em class="icon returnicon"></em>返回</a>';
    }
    header += '</div>\n' +
        '            <div class="user-wrapper pull-right" id="userbutton">\n' +
        '                <dl class="my-question pull-left">\n' +
        '                    <dt class="box user-info">\n' +
        '                        <a class="user-name" href="myQuestionnaires.html"><i class="icon questions-icon"><em></em></i><span>我的项目</span></a>\n' +
        '                    </dt>\n' +
        '                    <dd class="line"></dd>\n' +
        '                </dl>\n' +
        '                <dl class="user-info pull-left">\n' +
        '                    <dt class="icon user-icon"><em></em></dt>\n' +
        '                    <dd class="spinner-list">\n' +
        '                        <a href="javascript:void(0)" class="user-name">' +
        '                           <span id="ctl01_lblUserName"style="text-align:center">admin</span>' +
        '                        </a>&nbsp;&nbsp;|&nbsp;&nbsp;<a class="user-name" href="userManage.html" id="gotoUserManage">用户管理</a>\n' +
        '                    </dd>\n' +
        '                </dl>\n' +
        '                <dl id="ctl01_hrefWjxout" class="user-info pull-left IE-8">\n' +
        '                    <a class="user-name" href="javascript:void(0)" onclick=\'logOut()\'>\n' +
        '                        <dt class="icon out-icon"></dt>\n' +
        '                        <dd class="spinner-list" style="line-height: 3.2!important;">\n' +
        '                            <span>退出</span>\n' +
        '                        </dd>\n' +
        '                    </a>\n' +
        '                </dl>\n' +
        '            </div>\n' +
        '        </div>\n' +
        '    </div>';
    $(".header").html(header);
}

/**
 * 封装公共ajax,post的传输方式，必传参数
 * @param async    是否同步异步
 * @param url       请求地址
 * @param data      传输数据
 * @param success     成功之后的回调函数
 */
function commonAjaxPost(async, url, data, success, err) {
    $.ajax({
        "async": async,
        "url": httpRequestUrl + url,
        "type": "POST",
        "data": JSON.stringify(data),
        "dataType": "json",
        "contentType": "application/json",
        success: success || function (data) {
            // //console.log(data)
        },
        error: err || function (jqXHR, textStatus, errorThrown) {
            // alert(jqXHR);
            //  //console.log(jqXHR);
        },
    });
}

/**
 * 获取地址栏参数
 */
function UrlSearch() {
    var str = location.href; //取得整个地址栏
    var num = str.indexOf("/pages/");
    str = str.substr(num + 7); //取得当前页
    return str;
}

/**
 * 刷新cookie
 */
var cookiesPath = '/';
var cookiesTime = 3 / 24;

function refreshCookie() {
    var cookieData = $.cookie();
    $.each(cookieData, function (_key, _value) {
        $.cookie(_key, _value, {path: cookiesPath, expires: cookiesTime});
    });
}/**
 * 刷新cookie
 */
var cookiesPath = '/';
var cookiesTime = 3 / 24;

function refreshCookieCopy() {
    var cookieData = _$.cookie();
    _$.each(cookieData, function (_key, _value) {
        _$.cookie(_key, _value, {path: cookiesPath, expires: cookiesTime});
    });
}

/**
 * 设置cookie
 * @param key
 * @param value
 */
function setCookie(key, value) {
    refreshCookie();
    $.cookie(key, value, {path: cookiesPath, expires: cookiesTime});
}
/**
 * 设置_cookie
 * @param key
 * @param value
 */
function setCookieCopy(key, value) {
    refreshCookieCopy();
    _$.cookie(key, value, {path: cookiesPath, expires: cookiesTime});
}

/**
 * 设置cookie by time
 * @param key
 * @param value
 */
function setCookieByTime(key, value, time) {
    // refreshCookie();
    $.cookie(key, value, {path: cookiesPath, expires: time});
}

/**
 * 获取cookie
 * @param key
 */
function getCookie(key) {

    return $.cookie(key);
}

/**
 * 删除cookie
 * @param key
 */
function deleteCookie(key) {
    $.removeCookie(key, {path: cookiesPath});
}

/**
 * 清除cookie
 */
function clearCookie() {
    var cookieData = $.cookie();
    $.each(cookieData, function (key, value) {
        deleteCookie(key);
    });
}

/**
 * 清除单个cookie
 */


//清除cookie
function clearCookieSingle(name) {
    setCookie(name, "", -1);
}