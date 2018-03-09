<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>系统后台 | 登录</title>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="system/img/logo/chinook.ico" type="image/x-icon">
    <link rel="shortcut icon" href="system/img/logo/chinook.ico" type="image/x-icon">
    <!-- STYLESHEETS -->
    <!--[if lt IE 9]>
    <script src="<%=basePath%>/js/flot/excanvas.min.js"></script>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script><![endif]-->
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/system/css/cloud-admin.css">

    <link href="<%=basePath%>/system/css/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- UNIFORM -->
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/system/js/uniform/css/uniform.default.min.css"/>
    <script src="<%=basePath%>/system/js/jquery-1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/system/js/uniform/jquery.uniform.min.js"></script>
    <script type="text/javascript" src="system/js/jquery.tips.js"></script>
</head>
<body class="login">

<!-- PAGE -->
<section id="page">
    <!-- HEADER -->
    <header>
        <!-- NAV-BAR -->
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div id="logo">
                        <a href="index.html"> <img
                                src="<%=basePath%>/system/img/logo/logo-alt.png" alt="Chinook"/>
                        </a>
                    </div>
                </div>
            </div>
        </div>
        <!--/NAV-BAR -->
    </header>
    <!--/HEADER -->
    <!-- LOGIN -->
    <section id="login" class="visible">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="login-box-plain">
                        <h2 class="bigintro">系统登录</h2>
                        <div id="error">
                        </div>
                        <div class="divide-40"></div>
                        <form id="loginform" method="post">
                            <div class="form-group">
                                <label for="UserName">帐 号</label> <i class="fa fa-envelope"></i>
                                <input class="form-control" id="username" name="username" type="text"/>
                            </div>
                            <div class="form-group">
                                <label for="Password">密 码</label> <i class="fa fa-lock"></i>
                                <input class="form-control" id="password" name="password" type="password"/>
                            </div>
                            <div class="form-actions">
                                <label class="checkbox"><input type="checkbox" class="uniform" value=""> 记住密码</label>
                                <button type="button" onclick="loginSubmit()" class="btn btn-danger"
                                        onkeypress="getKey()">立即登录
                                </button>
                                <input type="hidden" id="txtName" onkeypress="EnterPress(event)"
                                       onkeydown="EnterPress()"/>

                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>
</section>
<script>
    jQuery(document).ready(function () {
        $(".uniform").uniform();
    });
    function loginSubmit() {

        var username = $("#username").val();
        var password = $("#password").val();
        if (username.length == 0) {
            $("#username").tips({msg: "请输入用户名。"});
            return;
        }
        if (password.length == 0) {
            $("#password").tips({msg: "请输入密码。"});
            return;
        }
        $.ajax({
            url: "admin/check_login",
            type: "post",
            data: {"username": username, "password": password},
            dataType: "json",
            success: function (data) {
                if (data.message == "success") {
                    //跳转到系统首页
                    window.location.href = "${pageContext.request.contextPath}/home/index";
                } else {
                    $("#username").focus();
                    $("#username").tips({msg: "用户名或密码错误。"});
                }
            },
        });
    }
    $('body').bind('keypress', function (event) {
        if (event.keyCode == "13") {
            loginSubmit();
        }
    });

</script>
</body>
</html>


