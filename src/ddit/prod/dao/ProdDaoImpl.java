package ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ddit.ibatis.config.sqlMapClientFactory;
import ddit.prod.vo.ProdVO;

public class ProdDaoImpl implements IProdDao {
	SqlMapClient smc;
	private static IProdDao dao;
	private ProdDaoImpl() {
		smc = sqlMapClientFactory.getSqlMapClient();
	}
	public static IProdDao getInstance() {
		if(dao==null) dao = new ProdDaoImpl();
		return dao;
	}
	
	
	
	@Override
	public List<ProdVO> selectProdNames(String lprod_gu) {
		List<ProdVO> prodList = null;
		
		try {
			prodList = (List<ProdVO>)smc.queryForList("prod.selectProdNames", lprod_gu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return prodList;
	}

	@Override
	public ProdVO selectProdDetail(String prod_id) {
		ProdVO prodVo = null;
		
		try {
			prodVo = (ProdVO)smc.queryForObject("prod.selectProdDetail", prod_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return prodVo;
	}

}
