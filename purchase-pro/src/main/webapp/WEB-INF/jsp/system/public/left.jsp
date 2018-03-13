<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 首次参数传入菜单 -->
<div id="sidebar" class="sidebar">
    <div class="sidebar-menu nav-collapse">
        <ul>
            <c:forEach items="${leftMenu}" var="menu">
            <li class="has-sub">
                <a data-id="${menu.systemMenuId}" href="javascript:;">
                    <i class="${menu.iconUrl}"></i>
                    <span class="menu-text">${menu.menuName }</span>
                    <span class="arrow"></span>
                </a>
                <ul class="sub">
                    <c:forEach var="sub" items="${menu.childMenus}">
                        <li class="">
                            <a  data-id="${sub.systemMenuId}" data-url="${sub.navigateUrl}" href="${sub.navigateUrl}">
                                <span class="sub-menu-text">${sub.menuName}</span>
                            </a>
                        </li>
                    </c:forEach>
                </ul>
            </li>
                </c:forEach>
        </ul>
    </div>
</div>