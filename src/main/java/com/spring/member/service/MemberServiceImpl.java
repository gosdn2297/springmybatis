package com.spring.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.member.dao.MemberDAO;
import com.spring.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;
	
	//memberDAO빈을 주입하기 위해 setter를 구현
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public List listMembers() throws DataAccessException {
		List memberList=memberDAO.selectAllMembers();
		return memberList;
	}

	@Override
	public void insertMember(MemberVO memVO) throws DataAccessException {
		memberDAO.insertMember(memVO);
	}

	@Override
	public MemberVO findMember(String id) throws DataAccessException {
		MemberVO memVO=(MemberVO)memberDAO.findMember(id);
		return memVO;
	}

	@Override
	public void updateMember(MemberVO memVO) throws DataAccessException {
		memberDAO.updateMember(memVO);

	}

	@Override
	public void removeMember(String id) throws DataAccessException {
		memberDAO.deleteMember(id);
	}
	
}
