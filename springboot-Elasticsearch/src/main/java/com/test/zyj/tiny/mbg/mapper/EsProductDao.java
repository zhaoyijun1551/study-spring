package com.test.zyj.tiny.mbg.mapper;

import com.test.zyj.tiny.nosql.elasticsearch.document.EsProduct;
import io.lettuce.core.dynamic.annotation.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 搜索系统中的商品管理自定义Dao
 */

@Mapper
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
