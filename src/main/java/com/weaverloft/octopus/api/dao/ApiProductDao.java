package com.weaverloft.octopus.api.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ApiProductDao {

    /**
     * 상품정보
     * @param productSeq
     * @return
     */
    Map<String, Object> selectProductDetail(int productSeq);

    /**
     * 추천 상품 리스트
     * @param paramMap
     * @return
     */
    List<Map<String, Object>> selectRecommendedProductList(Map<String, Object> paramMap);

    /**
     * 조회수 업데이트
     * @param productSeq
     * @return
     */
    void setProductViews(int productSeq);

}
