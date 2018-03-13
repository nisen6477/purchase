<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>采购单列表 - Chinook</title>
    <%@include file="../public/head.jsp"%>
</head>
<body>
<jsp:include page="../public/top.jsp"></jsp:include>
<input id="currentPage" type="hidden" value="1"/>
<script src="system/js/select.js" type="text/javascript"></script>
<section id="page">
    <jsp:include page="../public/left.jsp"></jsp:include>
    <script type="text/javascript">
        selectMenu(50,47);
    </script>
    <div id="main-content">
        <div class="container">
            <div class="row">
                <div id="content" class="col-lg-12">
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="page-header">
                                <ul class="breadcrumb">
                                    <li>
                                        <i class="fa fa-home"></i>
                                        <a href="pu/purchase/home">首页</a>
                                    </li>
                                    <li>
                                        采购单列表
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-12">
                            <div class="box border primary">
                                <div class="box-title">
                                    <h4>
                                        <i class="fa fa-table"></i>
                                        采购单列表
                                    </h4>
                                </div>
                                <div style="padding: 10px;">
                                    <div class="padding-bottom-20">
                                        <a href="pu/purchase/detail">
                                            <button class="btn btn-primary" type="button"
                                                    data-action="expand-all">
                                                <i class="fa fa-plus-circle"></i> 新建采购单
                                            </button>
                                        </a>
                                        <button class="btn btn-default" type="button" data-action="expand-all" onclick="print();">
                                            <i class="fa fa-sign-out"></i> 导出Excel
                                        </button>
                                        <div class="form-inline query-title-control" style="padding: 10px;">
                                            <div class="form-group">
                                                <div>采购开始日期:</div>
                                                <input type="text" class="form-control width-120" id="StartDate"
                                                       name="StartDate" placeholder="开始日期">
                                            </div>
                                            <div class="form-group">
                                                <div>采购结束日期:</div>
                                                <input type="text" class="form-control width-120" id="EndDate"
                                                       name="EndDate" placeholder="结束日期">
                                            </div>
                                            <div class="form-group">
                                                <div>采购单编码:</div>
                                                <input type="text" id="purchase_code" class="form-control width-160" placeholder="请输入采购单编码">
                                            </div>
                                            <div class="form-group">
                                                <div>供应商:</div>
                                                <select id="supplierID" class="width-160">
                                                </select>
                                            </div>
                                            <div class="form-group">
                                                <div>采购状态:</div>
                                                <select id="purchase_status_id" class="width-160">
                                                </select>
                                            </div>
                                            <div class="form-group">
                                                <div>采购类型:</div>
                                                <select id="purchase_type" class="width-160">
                                                </select>
                                            </div>
                                            <div class="form-group">
                                                <button type="button" id="search" class="btn btn-success form-control form-filter-button">查询
                                                </button>
                                            </div>
                                        </div>
                                        <div class="box border primary">
                                            <table class="table table-striped" id="t1">
                                                <thead>
                                                    <tr>
                                                        <th class="table-col-center col-auto-hide">采购日期</th>
                                                        <th class="table-col-center col-auto-hide">预计收货日期</th>
                                                        <th class="table-col-center">采购单编码</th>
                                                        <th class="table-col-center">询价单编码</th>
                                                        <th class="table-col-left col-auto-hide">公司简称</th>
                                                        <th class="table-col-center col-auto-hide">采购员</th>
                                                        <th class="table-col-right col-auto-hide">商品总数</th>
                                                        <th class="table-col-right col-auto-hide">总金额</th>
                                                        <th class="table-col-center col-auto-hide">货币类型</th>
                                                        <th class="table-col-center">采购单状态</th>
                                                        <th class="table-col-center col-auto-hide">采购类型</th>
                                                        <th class="table-col-center">操作</th>
                                                    </tr>
                                                </thead>
                                                <tbody id="tbody">
                                                    <%--
                                                    <tr>
                                                    <td class="table-col-center">201702282245017032</td>
                                                    <td class="table-col-center">
                                                        <a href="pu/inquiry/1">
                                                            201702282245017032
                                                        </a>
                                                    </td>
                                                    <td class="table-col-center">皮皮虾</td>
                                                    <td class="table-col-center">mori</td>
                                                    <td class="table-col-center">23</td>
                                                    <td class="table-col-center">￥23650</td>
                                                    <td class="table-col-center">采购中</td>
                                                    <td class="table-col-center">2017/03/21</td>
                                                    <td class="table-col-center">2017/03/28</td>
                                                    <td class="table-col-center">
                                                        <span>
                                                            <a href="pu/purchase/1" title="编辑详情"><i class='fa fa-edit'></i></a>
                                                            <a href="pu/purchase/purchase_return/1" title="退货操作"><i class="fa fa-ban"></i></a>
                                                            <a href="pu/purchase/check_in/1" title="入库操作"><i class="fa fa-sign-in"></i></a>
                                                            <a href="pu/purchase/view/1" title="查看"><i class="fa fa-eye"></i></a>
                                                            <a  title="删除"><i class='fa fa-trash'></i></a>
                                                        </span>
                                                    </td>
                                                </tr>--%>
                                                </tbody>
                                            </table>
                                        </div>
                                        <div style="text-align:center;" id="pagination">
                                            <ul class="pagination">
                                                <li><a href="#">&laquo;</a></li>
                                                <li><a href="#">1</a></li>
                                                <li><a href="#">2</a></li>
                                                <li><a href="#">3</a></li>
                                                <li><a href="#">4</a></li>
                                                <li><a href="#">5</a></li>
                                                <li><a href="#">&raquo;</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<script>
    $(function () {
        getList("currentPage","search");
        getSupplierForSpinner("supplierID","",true,true);
        getPurchaseStatusForSpinner("purchase_status_id","",true,true);
        getPurchaseTypeForSpinner("purchase_type","",true,true);

        // $("#StartDate").datetimepicker({
        //     pickTime: false,
        //     todayBtn: true,
        //     autoclose: true,
        //     minView: '2',
        //     forceParse: false,
        //     format: "yyyy-mm-dd"
        // });
        //
        // $("#EndDate").datetimepicker({
        //     pickTime: false,
        //     todayBtn: true,
        //     autoclose: true,
        //     minView: '2',
        //     forceParse: false,
        //     format: "yyyy-mm-dd"
        // });
    });

    function print() {
        var StartDate = $("#StartDate").val();
        var EndDate = $("#EndDate").val();
        var purchaseCode = $("#purchase_code").val();
        var supplierID = $("#supplierID").val();
        var purchaseStatusID = $("#purchase_status_id").val();
        var purchaseType = $("#purchase_type").val();
        location.href = basePath + "pu/purchase/excel/purchase_list?StartDate="+StartDate+"&EndDate="+EndDate+"&EndDate="+EndDate+"" +
                "&purchaseCode="+purchaseCode+"" + "&supplierID="+supplierID+"" + "&purchaseStatusID="+purchaseStatusID+"" + "&purchaseType="+purchaseType;
    }
    
    function toPage(page) {
        //获取查询条件
        var StartDate = $("#StartDate").val();
        var EndDate = $("#EndDate").val();
        var purchaseCode = $("#purchase_code").val();
        var supplierID = $("#supplierID").val();
        var purchaseStatusID = $("#purchase_status_id").val();
        var purchaseType = $("#purchase_type").val();
        $.ajax({
            url: 'pu/purchase/get_purchase_Page',
            type: 'post',
            data: {
                "page": page,
                "StartDate":StartDate,
                "EndDate":EndDate,
                "purchaseCode":purchaseCode,
                "supplierID":supplierID,
                "purchaseStatusID":purchaseStatusID,
                "purchaseType":purchaseType
            },
            async: false,
            dataType: 'json',
            success: function (data) {
                loadTable(data,"t1","tbody");
                $.each(data.pageData, function (i, item) {
                    var date =ifNull(item.expectArriveDate,"");
                    if (date != ""){
                        date = new Date(date).format("yyyy-MM-dd");
                    }
                    var divContent = divContent +
                        "<tr>" +
                            "<td class='table-col-center col-auto-hide'>" + moment(item.purchaseDate).format("YYYY-MM-DD") + "</td>" +
                            "<td class='table-col-center col-auto-hide'>" + date + "</td>"+
                            "<td class='table-col-center'>" + item.purchaseCode + "</td>" +
                            "<td class='table-col-center'><a href=pu/inquiry/detail/"+ item.inquiryId +">" + ifNull(item.inquiryCode,'') + "</a></td>"+
                            "<td class='table-col-left col-auto-hide'>" + item.shortName + "</td>"+
                            "<td class='table-col-center col-auto-hide'>" + item.firstName + "</td>"+
                            "<td class='table-col-right col-auto-hide'>" + ifNull(item.totalQuantity,0) + "</td>"+
                            "<td class='table-col-right col-auto-hide'>" + ifNull(item.totalAmount,0) + "</td>"+
                            "<td class='table-col-center col-auto-hide'>" + item.currencyCode + "</td>"+
                            "<td class='table-col-center'>" + item.statusName + "</td>"+
                            "<td class='table-col-center col-auto-hide'>" + item.purchaseTypeName + "</td>"+

                            "<td class='table-col-center'>" +
                                "<span>" +
                                    "<a  title='查看' href=pu/purchase/view/" + item.purchase_id + "><i class=\"fa fa-eye\"></i></a>&nbsp;" +
                                    "<a title=\"打印\" href='javascript:void(0);' onclick='printPDF(" + item.purchase_id + ");' ><i class='fa fa-file-pdf-o'></i></a> ";
                                    if(ifNull(item.status_id,0) == 67) {
                                        divContent +=  "<a  title='修改采购单' href=pu/purchase/detail/" + item.purchase_id + "><i class=\"fa fa-edit\"></i></a>&nbsp;";
                                        divContent +=  "<a  title='入库操作' href=pu/purchase/check_in/" + item.purchase_id + "><i class=\"fa fa-sign-in\"></i></a>&nbsp;";
                                    }
                                    if(ifNull(item.status_id,0) == 69 ||ifNull(item.status_id,0) == 69 ||ifNull(item.status_id,0) == 71 ||ifNull(item.status_id,0) == 72) {
                                        divContent +=  "<a  title='入库操作' href=pu/purchase/check_in/" + item.purchase_id + "><i class=\"fa fa-sign-in\"></i></a>&nbsp;";
                                    }
                                    if(ifNull(item.status_id,0) == 67) {
                                        divContent +=  "<a title='删除采购单' onclick='deletePurchase(" + item.purchase_id + ");' href=\"javascript:void(0);\" ><i class=\"fa fa-trash\"></i></a>" ;
                                    }
                    divContent += "</span>" +
                            "</td>" +
                        "</tr>"
                    $("#tbody").append(divContent);
                });
                //更新分页字符串
                $("#pagination").html(data.pageInfo.pageStr);
            }
        });
    }
    function printPDF(purchaseID) {
        window.open(basePath + 'pu/purchase/printPDF/' + purchaseID);
    }
    var deletePurchase = function (purchaseID) {
        bootbox.confirm("确定要删除该采购单吗？", function (result) {
            if(result) {
                $.ajax({
                    url : basePath + "pu/purchase/delete/head/"+purchaseID,
                    type:"post",
                    data:{
                        _method : "delete"
                    },
                    beforeSend:function()
                    {
                        openLoading();
                    },
                    success:function (data) {
                        closeLoading();
                        bootbox.dialog({
                            message: data.message,
                            buttons: {
                                OK: {
                                    label: "确定",
                                    className: "btn-primary",
                                    callback: function () {
                                        location.reload();
                                    }
                                }
                            }
                        });
                    }
                });
            }
        });
    }
</script>
</body>
</html>



