package ddit.member.service;

import java.util.List;

import ddit.member.vo.MemberVO;
import ddit.member.vo.ZipVO;

public interface IMemberService {
	
	// 중복검사
	public String searchId(String userId);
	
	// 저장하기-회원가입하기
	public String insertMember(MemberVO memVo);
	
	// 우편번호 검색
	public List<ZipVO> selectZipcode(String dong);
}
