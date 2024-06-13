package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;
import com.example.lesson02.mapper.UsedGoodsMapper;

@Service // spring bean
public class UsedGoodsBo {

	
	// 스프링 비니던 autowiereed를 통해서 가져온다
	@Autowired // Dpendency inject(Di): 의존성 주입
	private UsedGoodsMapper usedGoodsMapper;   // 객체의 이름은 소문자
	
	//  input: X (컨트롤러로 부터 들어온 요청)
	// 	output: (Repository한테 받은 것을) List<UsedGoods> (컨트롤러한테 줌)
	public List<UsedGoods> getUsedGoodsList() {
//		List<UsedGoods> usedGoodsList = usedGoodsMapper.selectUsedGoodsList();
//		return usedGoodsList;
		return usedGoodsMapper.selectUsedGoodsList();  // 컨트롤러한테 리턴
		}
}
