package cn.hpu.purchase.util;

/**
 * @author Mori on 2017/2/22.
 */
public interface ResponseMessage {

    String SUCCESS = "success";
    String SAVE_SUCCESS = "保存成功！";
    String PRODUCT_COPY_SUCCESS = "商品复制成功！";
    String PRODUCT_COPY_ERROR = "商品复制失败，请稍后再试！";
    String DELETE_SUCCESS = "删除成功！";
    String IMPORT_SUCCESS = "导入成功！";
    String ERROR = "系统繁忙，请稍后再试";
    String SAVE_RELATE_ERROR = "相关商品均已添加过。";
    String SAVE_PRODUCT_GROUP_ERROR = "所选商品均已添加过本套装。";
    String SAVE_PRODUCT_CONSONLISATION_ERROR = "所选商品均已添加过本组合。";
    String DB_ERROR = "Access to database failed.";
    String LOGIN_ERROR = "用户名或密码错误。";
    String LOGIN_SUCCESS = "success";
    String CODE_ERROR = "编码已存在,请重新输入。";
    String CODE_SUCCESS = "编码输入正确。";
    String REPEAT_SUBMIT = "请求已提交，请等待。";
    String REPEAT_PASSWORD_ERROR = "密码重置错误，请稍后再试。";
    String REPEAT_PASSWORD_SUCCESS = "密码重置成功。";
    String WAREHOUSE_NAME = "仓库名称已经存在。";
    String LOGISTIC_NAME = "物流服务名称已经存在。";
    String CUSTOMERCHANNEL_NAME = "会员来源名称已经存在。";
    String CUSTOMERCHANNEL_CODE = "会员来源标识码已经存在。";
    String CUSTOMERCHANNEL_USER = "可以使用。";
    String SUPPLIERTYPE_USER = "可以使用。";
    String SUPPLIERTYPE_NAME = "供应商类型名称已存在。";
    String SUPPLIERTYPE_CODE = "供应商类型编码已存在。";
    String SUPPLIER_PRODUCT_NAME = "供应商品名称已存在。";
    String SUPPLIER_PRODUCT_CODE = "供应商编码已存在。";
    String STORE_ERROR = "您已代理该商城。";
    String ITEM_OWNER_ERROR = "货主名称已经存在。";
    String NAME_DUPLICATE_ERROR = "名称已存在,请重新输入。";
    String NAME_DUPLICATE_SUCCESS = "名称输入正确。";
    String ATTRIBUTE_GROUP_DETAIL_ERROR = "该属性组合已存在，无需重复添加。";
    String SPEC_GROUP_DETAIL_ERROR = "该规格名称已存在，无需重复添加。";
    String PRODUCT_SUK_ERROR = "SKU已存在,请重新输入。";
    String PRODUCT_BARCODE_ERROR = "条形码已存在,请重新输入。";
    String PACKAGE_TYPE_CONVERSION_ERROR = "该包装类型已存在,请重新选择包装类型。";
    String PRODUCT_STORE_ERROR = "该代理控制已存在,请重新选择商城。";
    String PRODUCT_PRICE_ERROR = "当前商城本商品的该销售渠道已设置,请重新选择销售渠道。";
    String PRODUCT_SPEC_ERROR = "该规格参数已存在,请重新选择规格参数。";
    String ATTRIBUTE_VALUE_ERROR = "该属性组合已存在,请重新选择相关属性。";
    String CONSOLIDATION_NAME_ERROR = "该商品组合已存在,请重新输入。";
    String CONSOLIDATION_PRODUCT_ERROR = "该商品已添加过商品组合,请重新选择。";
    String CONSOLIDATION_CHILD_PRODUCT_ERROR = "该商品已添加过该组合子商品,请重新选择。";
    String INQUIRY_PRODUCT_ERROR = "该询价单的商品已经存在。";
    String SYSTEM_USER_LOGINID_ERROR = "该用户登录名称已经存在。";
    String SYSTEM_USER_ACCESS_RIGHT_ERROR = "请至少选择一个菜单。";
    String PRODUCT_ERROR = "该商品已经存在。";
    String DETACH_ORDER_QUANTITY_MORE_THAN_ZERO = "发货数量必须大于0。";
    String DETACH_ORDER_QUANTITY_LESS_THAN_QUANTITY_LEFT = "发货数量必须小于等于可拆数量。";
    String DETACH_ORDER_QUANTITY_LESS_THAN_QUANTITY_AVAILABLE = "发货数量必须小于等于仓库可用库存。";
    String ORDER_NO_AUDITED = "该订单未审核。";
    String ORDER_NO_SETTING_PRICE_COST = "该订单中有商品未设置成本价。";
    String ORDER_NO_PRODUCT = "该订单没有商品。";
    String NO_SETTING_PRICE_COST = "未设置商品成本价。";
    String NO_STORAGE = "库存不足。";
    String PRODUCT_EXISTS_ERROR = "选择的商品已经存在，请选择其他商品。";
    String CHARGE_TARIFF_DETAIL_WEIGHT_UPTO_EXISTS= "该重量上限已存在";
    String CHARGE_TARIFF_ZONE_EXISTS_ERROR = "选择的区域已经存在，请选择其他区域。";
    String CHARGE_TARIFF_ZONE_EXISTS_SUCCESS= "选择的区域有效";
    String CLOSE_SUCCESS= "关闭成功。";
    String ORDER_TROUBLE_STATUS_ERROR= "该问题订单已解决。";
    String TRANSFER_CHECK_OUT_CANCEL_ERROR= "该出库单对应的移库入库单已经入库，不能取消。";
    String TRANSFER_CHECK_OUT_CONFIRMATION_ERROR= "该出库单对应的移库入库单已经取消，不能出库。";
    String CUSTOMER_BALANCE_ADJUSTMENT= "输入的金额要小于该用户的余额(金币/经验)";
    String PRODUCT_PUBLISH_FAILD_DETAIL= "<p>发布失败: 请完善商品详情信息</p>";
    String PRODUCT_PUBLISH_FAILD_PHOTO= "<p>发布失败: 请完善商品图片信息</p>";
    String PRODUCT_PUBLISH_FAILD_STOCK= "<p>发布失败: 如果未勾选 “虚拟库存与可用库存保持一致”，虚拟库存不得为0</p>";
    String PRODUCT_PUBLISH_FAILD_PRICE= "<p>发布失败: 建议销售价必须小于或等于建议市场价</p>";
    String PRODUCT_PUBLISH_FAILD_WEIGHT= "<p>发布失败: 毛重净重均不可为0，且毛重必须大于净重</p>";
    String PRODUCT_UPDATE_FAILD_WEIGHT= "<p>修改失败: 毛重净重均大于0，且毛重必须大于净重</p>";
    String PRODUCT_UPDATE_FAILD_PRICE= "<p>修改失败: 建议销售价和建议市场价均大于零且建议销售价必须小于或等于建议市场价</p>";


    String REDPACKET_ERROR_SYSTEM_ERROR = "红包创建失败：系统内部错误";
    String REDPACKET_ERROR_NO_APPOINT_CUSTOMER_SEND = "红包创建错误：没有选择指定的发放用户";
    String REDPACKET_ERROR_BIND_CUSTOMER_ERROR = "红包创建错误：绑定发放用户失败";
    String REDPACKET_ERROR_NO_APPOINT_GROUP_RED_PACKET_CUSTOMER = "红包创建错误：没有选择指定群红包分享的用户";
    String REDPACKET_ERROR_NO_APPOINT_CATEGORY_SEND = "红包创建错误：没有选择指定的发放商品类型";
    String REDPACKET_ERROR_BIND_CATEGORY_ERROR = "红包创建错误：绑定发放商品类型失败";
    String REDPACKET_ERROR_NO_APPOINT_PRODUCT_SEND = "红包创建错误：没有选择指定发放红包的商品";
    String REDPACKET_ERROR_BIND_PRODUCT_ERROR = "红包创建错误：绑定发放商品失败";
    String REDPACKET_ERROR_NO_APPOINT_CATEGORY_USE = "红包创建错误：没有选择指定使用红包的商品类型";
    String REDPACKET_ERROR_BIND_CATEGORY_USE_ERROR = "红包创建错误：绑定可以使用红包的商品类型失败";
    String REDPACKET_ERROR_NO_APPOINT_PRODUCT_USE = "红包创建错误：没有选择指定使用红包的商品";
    String REDPACKET_ERROR_BIND_PRODUCT_USE_ERROR = "红包创建错误：绑定可以使用红包的商品失败";

    String REDPACKET_ERROR_EXPIRED = "红包发布失败：红包已过期";
    String CHECK_RP_BY_CATEGORY_ERROR = "红包创建错误，您所选的商品类别在该发放日期范围内有重复,或者所选的商品类别中包含不可使用红包的商品，具体错误如下：";
    String CHECK_RP_BY_PRODUCT_ERROR = "红包创建错误，您所选的商品在该发放日期范围内有重复";
    String CHECK_RP_BY_ORDER_AMOUNT_ERROR = "红包创建错误，您订单金额在该发放日期范围内已存在";
    String CHECK_RP_BY_RFS_ERROR = "红包创建错误，该发放日期范围内已存该类型的福利红包";

    String COMMISSION_NO_THIS_COMMISSION_ORDER = "佣金订单错误：此佣金分成订单不存在";
    String COMMISSION_DIVIDE_ERROR = "佣金订单错误：此佣金订单分成失败";
    String COMMISSION_DIVIDE_ALL_ERROR = "佣金订单错误：目前系统中没有可以分成的佣金订单";
    String COMMISSION_DIVIDE_ERROR_UPDATE_ERROR = "佣金订单错误：佣金订单状态更新失败";

    String COMMISSION_CONFIG_SETTING_ERROR = "佣金比例设置提示:该商品所属的一级分类还未保存佣金比例设置，请先去保存佣金比例设置";
    String COMMISSION_CONFIG_SETTING_SUCCESS = "佣金比例设置提示:已保存该商品类别的佣金比例设置，可以正常上架";

    String INVOICE_DETAIL_SAVE_ERROR = "生成账单错误:保存账单明细出错，请重新生成";
    String INVOICE_HEADER_SAVE_ERROR = "生成账单错误:保存账单出错，请重新生成";
    String PRODUCT_IS_CONSOLIDATION = "本商品是组合商品";
    String PRODUCT_IS_NOT_CONSOLIDATION = "本商品不是组合商品";

    String CLEARANCE_ERROR_BY_CREATE_INVOICE = "清账错误：差异处理，生成新账单出错.";
    String CLEARANCE_ERROR_BY_SAVE_CLEARANCE = "清账错误：保存清账单出错.";
    String CLEARANCE_ERROR_BY_SAVE_CLEARANCE_DETAIL = "清账错误：保存清账单明细出错.";
    String CLEARANCE_ERROR_BY_SAVE_CLEARANCE_INVOICE = "清账错误：更新账单信息出错，不存在该账单.";
    String CLEARANCE_ERROR_BY_SAVE_CLEARANCE_STORE = "清账错误：更新商城资金变动信息出错.";

    String PRE_STEP_VERIFY_MOBILE_ERROR = "上一步手机号验证错误。";
    String VERIFY_CODE_SUCCESS = "验证码输入正确。";
    String VERIFY_CODE_ERROR = "验证码输入错误。";
    String VERIFY_MOBILE_SUCCESS = "手机号可用。";
    String VERIFY_MOBILE_ALREADY_REGISTER = "该手机号已经被注册。";
    String VERIFY_CUSROMER_NOT_EXISTS = "该用户不存在。";

    String CANCEL_ORDER_SUCCESS = "订单已取消。";

    String CONFIRM_ORDER_SUCCESS = "订单已完成。";

    String NOT_LOGIN = "对不起您还没有有登录,不能关注。";

    String HAS_FAVORITED = "对不起不能重复关注。";
    public static final String SUPPLIER_ADMIN_ERROR = "供应商账号已存在,请重新输入。";

    String CUSTOMER_BALANCE_ERROR = "您输入的抵用金额不能超过当前余额。";
    String CUSTOMER_BALANCE_COIN_ERROR = "您输入的金币数不能超过最大使用数";
    String ORDER_PROMOTION_ERROR = "请选择正确的优惠活动。";
    String ORDER_RED_PACKET_ERROR = "请选择正确的红包。";
    String ORDER_PAY_AMOUNT_ONLINE = "请确认您的订单金额是否正确。";
    String ORDER_ITEM_AMOUNT = "请确认您的商品金额是否正确。";
    String ORDER_ADDRESS_ERROR = "请选择正确的收货地址。";
    String CUSTOMER_IDENTITY_ERROR = "请提交您的身份信息。";
    String CUSTOMER_IDENTITY_AUDITING = "当前身份信息验证中。";
    String CUSTOMER_IDENTITY_REJECTED = "当前身份信息未通过，请重新上传。";
    String CHARGE_TARIFF_ERROR = "该地区无法支持派送。";
    String DELIVERY_TYPE_ERROR = "商城无默认配送方式，请联系客服人员。";
    String ORDER_PRODUCT_PRICE_ERROR = "您输入的商品金额导致订单金额小于0，请重新输入。";
    String UPDATE_ORDER_DISCOUNT_AMOUNT_EXTRA_ERROR = "您输入的其他折扣金额导致订单金额小于0，请重新输入。";

    String SUPPLIER_AUDIT_MESSAGE =  "您的供应商信息正在审核，我们将尽快和您联系。"; //供应商审核信息
    String SUPPLIER_AUDIT_TITLE = "CHINOOK 供应商服务审核反馈";
    String SUPPLIER_AUDIT_PASS = "恭喜您已通过了供应商服务的审核，请尽快登陆供应商平台进行下一步认证。";
    String SUPPLIER_AUDIT_UNPASS = "很抱歉，您未能通过供应商服务的审核。<br/>未通过原因：";
    String SEND_EMAIL_ERROR = "邮件发送失败，邮箱不正确或者邮件服务器异常。";
    String SEND_EMAIL_SUCCESSED = "邮件发送成功";//成功补发供应商邮件
    String SEND_EMAIL_FAILED = "邮件发送失败，请稍后再试";//补发供应商邮件失败
    String SUPPLIER_LOGISTIC_AUDIT_PASS = "已通过审核。";
    String SUPPLIER_LOGISTIC_AUDIT_UNPASS = "审核不通过。";

    String LOGISTIC_UNENABLE = "物流服务暂不可用。";
    String LOGISTIC_CODE = "物流服务编码已存在";
    String NOT_TO_BUY = "该订单下所有商品都不能再次购买。";
    String TARIFF_CHARGE_INFO_NOT_COMPLETED = "请完成必填项信息";

    String DELIVERY_TYPE_SHIPPER_ERROR = "该配送方式和发货方授权关系已存在，请重新选择。";
    String QR_CODE_NOT_SAVE = "系统中没有录入该二维码。";

}
