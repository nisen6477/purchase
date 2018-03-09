package cn.hpu.purchase.util;

/**
 * @author Mori on 2017/2/22.
 *         保存sessionkey
 */
public interface SessionKey {
    /**
     * 项目版本号
     */
    String PROJECT_VERSION = "PROJECT_VERSION";
    /**
     * 手机商城用户
     */
    String SESSION_M_CUSTOMER = "SESSION_M_CUSTOMER";
    String SESSION_M_LOGISTIC_CUSTOMER = "SESSION_M_LOGISTIC_CUSTOMER";
    String SESSION_M_PICKUP_PERSON = "SESSION_M_PICKUP_PERSON";
    /**
     * 当前手机商城用户(分销商)
     */
    String SESSION_M_DISTRIBUTER_ON = "SESSION_M_DISTRIBUTER_ON";
    String SESSION_M_LOGISTIC_DISTRIBUTER_ON = "SESSION_M_LOGISTIC_DISTRIBUTER_ON";
    /**
     * 服务商城登录验证码上次发送时间
     */
    String SESSION_M_LOGISTIC_LOGIN_CODE_DATE = "SESSION_M_LOGISTIC_LOGIN_CODE_DATE";
    /**
     * 提货系统登录验证码上次发送时间
     */
    String SESSION_M_PICKUP_LOGIN_CODE_DATE = "SESSION_M_PICKUP_LOGIN_CODE_DATE";
    /**
     * 手机商城登录验证码上次发送时间
     */
    String SESSION_M_LOGIN_CODE_DATE = "SESSION_M_LOGIN_CODE_DATE";
    /**
     * 手机商城账户绑定验证码上次发送时间
     */
    String SESSION_M_CUSTOMER_COMBINE_CODE_DATE = "SESSION_M_CUSTOMER_COMBINE_CODE_DATE";
//    String SESSION_M_FORGET_PASSWORD_CODE_DATE = "SESSION_M_FORGET_PASSWORD_CODE_DATE";//手机商城找回密码验证码上次发送时间
//    String SESSION_M_REGISTER_MOBILE = "SESSION_M_REGISTER_MOBILE";//手机商城注册手机号
//    String SESSION_M_REGISTER_MOBILE_VERIFY = "SESSION_M_REGISTER_MOBILE_VERIFY";//手机商城注册手机号验证状态
//    String SESSION_M_FORGET_MOBILE_VERIFY = "SESSION_M_FORGET_MOBILE_VERIFY";//手机商城忘记密码手机号验证状态
//    String SESSION_M_FORGET_MOBILE = "SESSION_M_FORGET_MOBILE";//手机商城忘记密码手机号
    /**
     * SESSION_M_PARENT_ID
     */
    String SESSION_M_LOGISTIC_CUSTOMER_PARENT_ID = "SESSION_M_LOGISTIC_CUSTOMER_PARENT_ID";
    /**
     * SESSION_M_PARENT_ID
     */
    String SESSION_M_PICKUP_PERSON_PARENT_ID = "SESSION_M_PICKUP_PERSON_PARENT_ID";
    /**
     * SESSION_M_PARENT_ID
     */
    String SESSION_M_CUSTOMER_PARENT_ID = "SESSION_M_CUSTOMER_PARENT_ID";

    /**
     * 后台登录的管理员账号
     */
    String SESSION_ADMIN = "SESSION_ADMIN";
    /**
     * 左侧菜单
     */
    String SESSION_SYSTEM_MENU = "SESSION_SYSTEM_MENU";
    /**
     * 登录用户可以访问的系统
     */
    String SESSION_SYSTEM_USER_SYSTEM = "SESSION_SYSTEM_USER_SYSTEM";
    /**
     * 当前所访问的系统
     */
    String CURRENT_SYSTEM = "CURRENT_SYSTEM";
    /**
     * 当前所访问的系统
     */
    String CURRENT_SYSTEM_ID = "CURRENT_SYSTEM_ID";
    /**
     * 当前所访问的系统
     */
    String CURRENT_SYSTEM_NAME = "CURRENT_SYSTEM_NAME";

    /**
     * 手机商城公共信息session
     */
    String SESSION_M_STORE = "SESSION_M_STORE";

    String SESSION_M_LOGISTIC_STORE = "SESSION_M_LOGISTIC_STORE";
    String SESSION_M_PICKUP_STORE = "SESSION_M_PICKUP_STORE";

    /**
     * 供应商登录的管理员账号
     */
    String SESSION_SUPPLIER_ADMIN = "SESSION_SUPPLIER_ADMIN";

}
