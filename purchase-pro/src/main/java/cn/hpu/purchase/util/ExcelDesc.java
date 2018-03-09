package cn.hpu.purchase.util;

import java.lang.annotation.*;

/**
 * @author Amos on 2017/6/28.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ExcelDesc {
    String value();
    String orderBy();
    boolean display() default true;
}
