<%--
  @author IntelliJ IDEA.
  User: 张春阳
  Date: 2017/2/24
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<header class="navbar clearfix navbar-fixed-top" id="header">
    <div class="container">
        <div class="navbar-brand">
            <a href="#"><img src="<%=basePath%>/system/img/logo/logo.png" alt="Logo" class="img-responsive" height="30" width="120"></a>
            <div id="sidebar-collapse" class="sidebar-collapse btn">
                <i class="fa fa-bars"></i>
            </div>
        </div>
        <ul class="nav navbar-nav pull-left hidden-xs" id="navbar-left">
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown">
                    <i class="fa fa-leaf"></i>
                    <span class="name"> 换肤${sessionScope.SESSION_ADMIN}</span>
                    <i class="fa fa-angle-down"></i>
                </a>
                <ul class="dropdown-menu skins">
                    <li class="dropdown-title">
                        <span><i class="fa fa-leaf"></i> 主题皮肤</span>
                    </li>
                    <li><a data-skin="default">天使蓝(默认)</a></li>
                    <li><a data-skin="night">碧湖蓝</a></li>
                    <li><a data-skin="earth">玫瑰金</a></li>
                    <li><a data-skin="utopia">钻雕金</a></li>
                    <li><a data-skin="nature">草木绿</a></li>
                    <li><a data-skin="graphite">曜石黑</a></li>

                </ul>
            </li>
        </ul>
        <ul class="nav navbar-nav pull-right">
            <li class="dropdown user pull-right" id="header-user">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <%--<c:if test="${sessionScope.SESSION_ADMIN.profilePhoto != null}">--%>
                        <%--<img class="table-image" src="${sessionScope.SESSION_ADMIN.profilePhoto}">--%>
                    <%--</c:if>--%>
                    <%--<c:if test="${sessionScope.SESSION_ADMIN.profilePhoto == null}">--%>
                        <%--<img class="table-image" src="system/img/profile_default.png">--%>
                    <%--</c:if>--%>
                    <%--<span class="username">${sessionScope.SESSION_ADMIN.loginID} </span>--%>
                    <i class="fa fa-angle-down"></i>
                </a>
                <ul class="dropdown-menu">
                    <li><a  data-toggle="modal" data-target="#message"><i class="fa fa-user" ></i> 用户信息</a></li>
                    <li><a  data-toggle="modal" data-target="#password-div"><i class="fa fa-lock" ></i> 修改密码</a></li>
                    <li><a href="admin/logout"><i class="fa fa-power-off"></i> 注销登录</a></li>
                </ul>
            </li>
        </ul>
    </div>



</header>