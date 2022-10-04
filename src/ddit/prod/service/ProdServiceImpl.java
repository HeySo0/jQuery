package ddit.prod.service;

import java.util.List;

import ddit.prod.dao.IProdDao;
import ddit.prod.dao.ProdDaoImpl;
import ddit.prod.vo.ProdVO;

public class ProdServiceImpl implements IProdService {
	private static IProdService service;
	private IProdDao dao;
	private ProdServiceImpl() {
		dao = ProdDaoImpl.getInstance();
	}
	public static IProdService getInstance() {
		if(service==null) service = new ProdServiceImpl();
		return service;
	}
	
	@Override
	public List<ProdVO> selectProdNames(String lprod_gu) {
		return dao.selectProdNames(lprod_gu);
	}

	@Override
	public ProdVO selectProdDetail(String prod_id) {
		return dao.selectProdDetail(prod_id);
	}

}
