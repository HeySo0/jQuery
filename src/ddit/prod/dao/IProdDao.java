package ddit.prod.dao;

import java.util.List;

import ddit.prod.vo.ProdVO;

public interface IProdDao {
	
	public List<ProdVO> selectProdNames(String lprod_gu);
	
	public ProdVO selectProdDetail(String prod_id);

}
