package com.example.lesson03.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.lesson03.domian.Review;

@Mapper
public interface ReviewMapper {
	
	// input: id    output:Review
	public Review selectReview(int id);
	
	// input:Review        output: 성공한 행의 개수(int)
	public int insertReview(Review review);

	public int insertReviewAsField(
			// 하나의 map 된 것 => @Param
			@Param("storeId") int storeId111, 
			@Param("menu") String menu111, 
			@Param("userName") String userName111, 
			@Param("point") Double point111, 
			@Param("review") String review111);

	// input:id, review     output: 성공한 행의 개수
	public int updateReviewById(
			@Param("id") int id, 
			@Param("review") String review11111111);

	// input:id      output:성공한 행의 개수
	public int deleteReviewById(int id);
}

