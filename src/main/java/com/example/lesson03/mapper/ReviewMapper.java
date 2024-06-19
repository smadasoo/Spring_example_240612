package com.example.lesson03.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.lesson03.domain.Review;

@Mapper
public interface ReviewMapper {

	// input:id   output:Review or null
	public Review selectReviewById(int id);
	
	public int insertReview(Review review);
	
	// @Param 하나의 맵으로 xml에 전송
	public int insertReviewAsField(
			@Param("storeId") int storeId11111, 
			@Param("menu") String menu234234, 
			@Param("userName") String userName234234, 
			@Param("point") Double point234324, 
			@Param("review") String review234234);
	
	public int updateReviewById(
			@Param("id") int id, 
			@Param("review") String review);
	
	public int deleteReviewById(int id);
}
