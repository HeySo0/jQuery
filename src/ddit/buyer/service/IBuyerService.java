package ddit.buyer.service;

import java.util.List;

import ddit.buyer.vo.BuyerVO;

public interface IBuyerService {
	// 이름(buyer_name)목록 가져오기
	public List<BuyerVO> getBuyerNames();
	
	// buyer_id를 기준으로 상세보기 가져오기
	public BuyerVO getBuyerDetail(String id);
	
}
