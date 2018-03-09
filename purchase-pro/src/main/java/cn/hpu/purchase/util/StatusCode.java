package cn.hpu.purchase.util;

/**
 * @author Mori on 2017/3/31.
 */
public interface StatusCode {
    /**
     * 成功
     */
    String SUCCESS = "200";
    /**
     * 服务器异常
     */
    String ERROR = "500";
    /**
     * 暂时代表没有数据
     */
    String UNFIND = "404";
    /**
     * 服务器拒绝
     */
    String REFUSE = "403";
    /**
     * 重复提交
     */
    String REPEAT = "808";

    /**
     * 自定义红包分享状态码,50010：表示分享红包已领取完成
     */
    String SHARE_ERROR = "50010";

    /**
     * 自定义订单分享红包状态码,500404：表示当前没有订单分享红包
     */
    String ORDER_SHARE_UNFIND = "500404";

    /**
     * 有订单分享红包
     */
    String ORDER_SHARE_YES= "20010";
}
