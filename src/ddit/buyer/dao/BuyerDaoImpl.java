package ddit.buyer.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ddit.buyer.vo.BuyerVO;
import ddit.ibatis.config.sqlMapClientFactory;

/*
	SqlMapClient가 필요
	자신의 객체를 생성해서 return하는 메서드 필요
 */

public class BuyerDaoImpl implements IBuyerDao {
	private SqlMapClient smc;
	private static IBuyerDao dao;
	
	private BuyerDaoImpl() {
		smc = sqlMapClientFactory.getSqlMapClient();
	}
	
	public static IBuyerDao getInstance() {
		if(dao==null) dao = new BuyerDaoImpl();
		return dao;
	}
	
	
	@Override
	public List<BuyerVO> getBuyerNames() {
		List<BuyerVO> buyerList = null;
		
		try {
			buyerList = smc.queryForList("buyer.getBuyerNames");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return buyerList;
	}

	@Override
	public BuyerVO getBuyerDetail(String id) {
		BuyerVO buyerVo = null;
		
		try {
			buyerVo = (BuyerVO)smc.queryForObject("buyer.getBuyerDetail", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return buyerVo;
	}

}
