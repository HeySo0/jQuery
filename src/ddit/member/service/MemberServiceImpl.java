package ddit.member.service;

import java.util.List;

import ddit.member.vo.MemberVO;
import ddit.member.vo.ZipVO;
import ddit.membrer.dao.IMemberDao;
import ddit.membrer.dao.MemberDaoImpl;

public class MemberServiceImpl implements IMemberService {
	private IMemberDao dao;
	private  static IMemberService service;
	private MemberServiceImpl() {
		dao = MemberDaoImpl.getInstance();
	}
	public static IMemberService getInstance() {
		if(service==null)service = new MemberServiceImpl();
		return service;
	}

	@Override
	public String searchId(String userId) {
		return dao.searchId(userId);
	}

	@Override
	public String insertMember(MemberVO memVo) {
		return dao.insertMember(memVo);
	}

	@Override
	public List<ZipVO> selectZipcode(String dong) {
		return dao.selectZipcode(dong);
	}

}
