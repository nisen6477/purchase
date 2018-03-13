package cn.hpu.purchase.mapper.product;

import java.util.List;
import cn.hpu.purchase.po.product.Product;

public interface ProductMapper {

    int insert(Product record) throws Exception;

    Product selectByPrimaryKey(Integer productId) throws Exception;

    List<Product> selectAll() throws Exception;

    int updateByPrimaryKey(Product record) throws Exception;
}