<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>采购管理系统 - Chinook</title>

    <%@include file="../public/head.jsp"%>
</head>
<body>
<jsp:include page="../public/top.jsp"></jsp:include>
<input id="currentPage" type="hidden" value="${pd.page}"/>
<section id="page">
    <%--<jsp:include page="../public/left.jsp"></jsp:include>--%>
    <div id="main-content">
        <div class="container">
            <div class="row">
                <div id="content" class="col-lg-12">
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="page-header">
                                <ul class="breadcrumb col-sm-2">
                                    <li>
                                        <i class="fa fa-home"></i>
                                        <a href="pu/purchase/home">首页</a>
                                    </li>
                                </ul>
                                <div>
                                    <span class="pull-right" style="padding: 3px 0;">
                                        <div class="btn-group">
                                            <a class="btn btn-default" id="SelectToday" onclick="SelectDate('SelectToday',0)">今天</a>
                                            <a class="btn btn-default" id="SelectSevenDays" onclick="SelectDate('SelectSevenDays',7)">过去7天</a>
                                            <a class="btn btn-success" id="SelectOneMonth" onclick="SelectDate('SelectOneMonth',30)">过去一个月</a>
                                        </div>
                                    </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-3">
                            <div class="dashbox panel panel-default">
                                <div class="panel-body">
                                    <div class="panel-left red">
                                        <i class="fa fa-rmb fa-3x"></i>
                                    </div>
                                    <div class="panel-right">
                                        <div class="number" id="totalAmount"></div>
                                        <div class="title">采购总金额</div>
                                        <span class="label label-danger" id="totalAmountRate">

										</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="dashbox panel panel-default">
                                <div class="panel-body">
                                    <div class="panel-left blue">
                                        <i class="fa fa-product-hunt fa-3x"></i>
                                    </div>
                                    <div class="panel-right">
                                        <div class="number" id="purchaseTotalQuantity">121</div>
                                        <div class="title">采购商品总数</div>
                                        <span class="label label-success" id="purchaseTotalQuantityRate">
													5% <i class="fa fa-arrow-up"></i>
												</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="dashbox panel panel-default">
                                <div class="panel-body">
                                    <div class="panel-left green">
                                        <i class="fa fa-file-text fa-3x"></i>
                                    </div>
                                    <div class="panel-right">
                                        <div class="number" id="totalQuantity">23</div>
                                        <div class="title">采购单数量</div>
                                        <span class="label label-warning" id="totalQuantityRate">
													17% <i class="fa fa-arrow-up"></i>
												</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="dashbox panel panel-default">
                                <div class="panel-body">
                                    <div class="panel-left orange">
                                        <i class="fa fa-file-text fa-3x"></i>
                                    </div>
                                    <div class="panel-right">
                                        <div class="number" id="storageQuantity">40</div>
                                        <div class="title">入库单数量</div>
                                        <span class="label label-warning" id="storageQuantityRate">
													76% <i class="fa fa-arrow-up"></i>
												</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-12">
                            <div class="box border primary">
                                <div class="box-title">
                                    <h4><i class="fa fa-area-chart"></i>
                                        <span class="hidden-inline-mobile">采购商品金额</span>
                                    </h4>
                                </div>
                                <div class="box-body">
                                    <div class="tabbable header-tabs">
                                        <div class="tab-content">
                                            <div class="tab-pane fade in active" id="box_tab1"
                                                 style="padding-top: 20px;">
                                                <div id="chart-dash" class="chart"></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-12">
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="box border primary">
                                        <div class="box-title">
                                            <h4><i class="fa fa-sort-numeric-asc"></i> <span
                                                    class="hidden-inline-mobile">采购商品数量排行 Top10</span></h4>
                                        </div>
                                        <div class="box-body">
                                            <div class="box border primary">
                                                <table class="table table-striped" id="t1">
                                                    <thead>
                                                    <tr>
                                                        <th class="table-col-center">SKU</th>
                                                        <th class="table-col-left">名称</th>
                                                        <th class="table-col-right">总数</th>
                                                    </tr>
                                                    </thead>
                                                    <tbody id="salesList">

                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-6">
                                    <div class="box border primary">
                                        <div class="box-title">
                                            <h4><i class="fa fa-sort-numeric-asc"></i> <span
                                                    class="hidden-inline-mobile">采购商品金额排行 Top10</span></h4>
                                        </div>
                                        <div class="box-body">
                                            <div class="box border primary">
                                                <table class="table table-striped" id="t2">
                                                    <thead>
                                                    <tr>
                                                        <th class="table-col-center">SKU</th>
                                                        <th class="table-col-left">名称</th>
                                                        <th class="table-col-right">总金额</th>
                                                    </tr>
                                                    </thead>
                                                    <tbody id="amountList">

                                                    </tbody>
                                                </table>
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
    </div>
</section>
<script>
    $(function () {
        // getPurchaseRankTopTen();
        // getPurchaseChartAndOtherMsg();
    });

    function getPurchaseRankTopTen() {
        $.ajax({
            url : "pu/purchase/get_purchase_rank_top_ten",
            type : "post",
            dataType : "json",
            beforeSend : function () {
                openLoading();
            },
            success : function (data) {
                var $salesList = $("#salesList");
                $salesList.empty();
                if(data.quantity.length == 0){
                    showTable("t1",false);
                }
                $.each(data.quantity, function (i, item) {
                    var tr = "<tr><td class=\"table-col-center\">"+ item.sku +"</td>" +
                            "<td class=\"table-col-left\">"+ item.product_name +"</td>" +
                            "<td class=\"table-col-right\">"+ item.quantity +"</td></tr>";
                    $salesList.append(tr);
                });

                var $amountList = $("#amountList");
                $amountList.empty();
                if(data.amount.length == 0) {
                    showTable("t2", false);
                }
                $.each(data.amount, function (i, item) {
                    var tr = "<tr><td class=\"table-col-center\">"+ item.sku +"</td>" +
                            "<td class=\"table-col-left\">"+ item.product_name +"</td>" +
                            "<td class=\"table-col-right\">"+ item.amount.toFixed(2) +"</td></tr>";
                    $amountList.append(tr);
                });

                closeLoading();
            }
        });
    }

    function SelectDate(id,days) {
        $("#SelectToday").attr('class',"btn btn-default");
        $("#SelectSevenDays").attr('class',"btn btn-default");
        $("#SelectOneMonth").attr('class',"btn btn-default");
        $("#" + id).attr('class',"btn btn-success");

        // getPurchaseChartAndOtherMsg(days);
    }

    function getPurchaseChartAndOtherMsg(days) {
        $.ajax({
            url : "pu/purchase/get_purchase_chart_and_other_msg",
            type : "post",
            dataType : "json",
            data : {
                "days" : days
            },
            success : function (data) {
                $("#totalAmountRate").empty();
                $("#totalAmount").text(data.purchaseAmount.toFixed(2));
                if(data.purchaseAmountRate >= 0){
                    $("#totalAmountRate").append(data.purchaseAmountRate+'%'+"<i class=\"fa fa-arrow-up\"></i>");
                }else{
                    $("#totalAmountRate").append(data.purchaseAmountRate+'%'+"<i class=\"fa fa-arrow-down\"></i>");
                }

                $("#purchaseTotalQuantityRate").empty();
                $("#purchaseTotalQuantity").text(parseFloat(data.purchaseTotalQuantity));
                if(data.purchaseTotalQuantityRate >= 0){
                    $("#purchaseTotalQuantityRate").append(data.purchaseTotalQuantityRate+'%'+"<i class=\"fa fa-arrow-up\"></i>");
                }else{
                    $("#purchaseTotalQuantityRate").append(data.purchaseTotalQuantityRate+'%'+"<i class=\"fa fa-arrow-down\"></i>");
                }

                $("#totalQuantityRate").empty();
                $("#totalQuantity").text(parseFloat(data.totalQuantity));
                if(data.totalQuantityRate >= 0){
                    $("#totalQuantityRate").append(data.totalQuantityRate+'%'+"<i class=\"fa fa-arrow-up\"></i>");
                }else{
                    $("#totalQuantityRate").append(data.totalQuantityRate+'%'+"<i class=\"fa fa-arrow-down\"></i>");
                }

                $("#storageQuantityRate").empty();
                $("#storageQuantity").text(parseFloat(data.storageQuantity));
                if(data.storageQuantityRate >= 0){
                    $("#storageQuantityRate").append(data.storageQuantityRate+'%'+"<i class=\"fa fa-arrow-up\"></i>");
                }else{
                    $("#storageQuantityRate").append(data.storageQuantityRate+'%'+"<i class=\"fa fa-arrow-down\"></i>");
                }

                var data1 = new Array();
                $.each(data.data1, function (i, item) {
                    data1[i]=new Array();
                    data1[i][0]= new Date(item.time);
                    data1[i][1]= item.amount;
                });
                chartMonth(data1);
            }
        });
    }

    function chartMonth(data) {

        $.plot($("#chart-dash"), [
            {
            data: data,
            label: "采购金额",
            lines: {
                show: true,
                lineWidth: 1,
                fill: true,
                fillColor: {
                    colors: [{
                        opacity: 0.05
                    }, {
                        opacity: 0.5
                    }
                    ]
                }
            },
            points: {
                show: true,
                lineWidth: 0.5,
                fill: true
            },
            shadowSize: 0
        }], {
            grid: {
                hoverable: true,
                clickable: true,
                tickColor: "#f7f7f7",
                borderWidth: 0,
                labelMargin: 10,
                margin: {
                    top: 0,
                    left: 5,
                    bottom: 0,
                    right: 0
                }
            },
            legend: {
                show: true
            },
            colors: ["rgba(109,173,189,1)"],

            xaxis: {
                ticks: 7,
                mode:"time",
                timeformat:"%m-%d",
                tickColor: "#fff"
            },
            yaxis: {
                ticks: 4,
                tickDecimals: 0
            },
        });

        function showTooltip(x, y, contents) {
            $('<div id="tooltip">' + contents + '</div>').css({
                position: 'absolute',
                display: 'none',
                top: y + 5,
                left: x + 15,
                border: '1px solid #333',
                padding: '4px',
                color: '#fff',
                'border-radius': '3px',
                'background-color': '#333',
                opacity: 0.80
            }).appendTo("body").fadeIn(200);
        }

        var previousPoint = null;
        $("#chart-dash").bind("plothover", function (event, pos, item) {
            $("#x").text(pos.x.toFixed(0));
            $("#y").text(pos.y.toFixed(0));
            if (item) {
                if (previousPoint != item.dataIndex) {
                    previousPoint = item.dataIndex;
                    $("#tooltip").remove();
                    var x = item.datapoint[0].toFixed(0),
                            y = item.datapoint[1].toFixed(0);
                    showTooltip(item.pageX, item.pageY,new Date(parseInt(x)).format("MM-dd") +"："+
                            item.series.label + "为" + y);
                }
            } else {
                $("#tooltip").remove();
                previousPoint = null;
            }
        });
    }
</script>
<!-- FLOT CHARTS -->
<script src="<%=basePath%>system/js/flot/jquery.flot.min.js"></script>
<script src="<%=basePath%>system/js/flot/jquery.flot.time.min.js"></script>
<script src="<%=basePath%>system/js/flot/jquery.flot.selection.min.js"></script>
<script src="<%=basePath%>system/js/flot/jquery.flot.resize.min.js"></script>
<script src="<%=basePath%>system/js/flot/jquery.flot.pie.min.js"></script>
<script src="<%=basePath%>system/js/flot/jquery.flot.stack.min.js"></script>
<script src="<%=basePath%>system/js/flot/jquery.flot.crosshair.min.js"></script>
</body>
</html>
