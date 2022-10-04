package ddit.membrer.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ddit.ibatis.config.sqlMapClientFactory;
import ddit.member.vo.MemberVO;
import ddit.member.vo.ZipVO;

public class MemberDaoImpl implements IMemberDao {
	private SqlMapClient client;
	private static IMemberDao dao;
	private MemberDaoImpl() {
		client = sqlMapClientFactory.getSqlMapClient();
	}
	public static IMemberDao getInstance() {
		if(dao==null)dao = new MemberDaoImpl();
		return dao;
	}
	

	@Override
	public String searchId(String userId) {
		String result = null;
		try {
			result = (String)client.queryForObject("member.searchId", userId);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String insertMember(MemberVO memVo) {
		String result= null;
		try {
			result = (String)client.insert("member.insertMember", memVo);
		} catch (SQLException e) {
			result = null;
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<ZipVO> selectZipcode(String dong) {
		List<ZipVO> zipList = null;
		
		try {
			zipList = (List<ZipVO>)client.queryForList("member.selectZipcode", dong);
		} catch (SQLException e) {
			zipList = null;
			e.printStackTrace();
		}
		
		return zipList;
	}

}
