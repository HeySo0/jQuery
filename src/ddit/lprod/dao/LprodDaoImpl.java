package ddit.lprod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ddit.ibatis.config.sqlMapClientFactory;
import ddit.lprod.vo.LprodVO;

public class LprodDaoImpl implements ILprodDao {
	SqlMapClient smc;
	private static ILprodDao dao;
	private LprodDaoImpl() {
		smc = sqlMapClientFactory.getSqlMapClient();
	}
	public static ILprodDao getInstance() {
		if(dao==null)dao = new LprodDaoImpl();
		return dao;
	}

	@Override
	public List<LprodVO> lprodList() {
		List<LprodVO> lprodList = null;
		
		try {
			lprodList = smc.queryForList("lprod.lprodList");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lprodList;
	}

}
