package ddit.buyer.service;

import java.util.List;

import ddit.buyer.dao.BuyerDaoImpl;
import ddit.buyer.dao.IBuyerDao;
import ddit.buyer.vo.BuyerVO;

public class BuyerServiceImpl implements IBuyerService {
	private static IBuyerService service;
	private IBuyerDao dao;
	
	private BuyerServiceImpl() {
		dao = BuyerDaoImpl.getInstance();
	}
	
	public static IBuyerService getInstance() {
		if(service==null) service = new BuyerServiceImpl();
		return service;
	}
	
	
	
	@Override
	public List<BuyerVO> getBuyerNames() {
		return dao.getBuyerNames();
	}

	@Override
	public BuyerVO getBuyerDetail(String id) {
		return dao.getBuyerDetail(id);
	}

}
