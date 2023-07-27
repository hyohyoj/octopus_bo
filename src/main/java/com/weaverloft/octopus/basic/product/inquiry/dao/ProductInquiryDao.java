package com.weaverloft.octopus.basic.product.inquiry.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author note-gram-015
 * @version 0.0.1
 * @brief 간략
 * @details 상세
 * @date 2023-05-16
 */
@Mapper
public interface ProductInquiryDao {

    int insertProductInquiry(Map<String, Object> paramMap);
    int updateProductInquiry(Map<String, Object> paramMap);
    int deleteProductInquiry(Map<String, Object> paramMap);
    List<Map<String, Object>> selectInquiryList(Map<String, Object> paramMap);
    int selectCountInquiry(Map<String, Object> paramMap);
    List<Map<String, Object>> selectInquiryDetail(int inquirySeq);
}
