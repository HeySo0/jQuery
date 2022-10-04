package ddit.prod.service;

import java.util.List;

import ddit.prod.vo.ProdVO;

public interface IProdService {
	public List<ProdVO> selectProdNames(String lprod_gu);
	
	public ProdVO selectProdDetail(String prod_id);
}
