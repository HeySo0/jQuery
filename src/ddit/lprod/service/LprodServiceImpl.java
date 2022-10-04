package ddit.lprod.service;

import java.util.List;

import ddit.lprod.dao.ILprodDao;
import ddit.lprod.dao.LprodDaoImpl;
import ddit.lprod.vo.LprodVO;

public class LprodServiceImpl implements ILprodService {
	private ILprodDao dao;
	private static ILprodService service;
	private LprodServiceImpl() {
		dao = LprodDaoImpl.getInstance();
	}
	public static ILprodService getInstance() {
		if(service==null)service = new LprodServiceImpl();
		return service;
	}

	@Override
	public List<LprodVO> lprodList() {
		return dao.lprodList();
	}


}
