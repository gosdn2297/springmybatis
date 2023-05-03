package com.spring.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.member.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO {
   private SqlSession sqlSession;
   
   
   //SqlSession 빈을 주입하기 위해 setter를 구현
   public void setSqlSession(SqlSession sqlSession) {
      this.sqlSession = sqlSession;
   }

   @Override
   public List<MemberVO> selectAllMembers() throws DataAccessException {
      List<MemberVO> memberList = sqlSession.selectList("mapper.member.selectAllMemberlist");
      return memberList;
   }

   @Override
   public void insertMember(MemberVO memVo) throws DataAccessException {
      sqlSession.insert("mapper.member.insertMember",memVo);
      
   }

   @Override
   public MemberVO findMember(String id) throws DataAccessException {
      MemberVO memVo = (MemberVO)sqlSession.selectOne("mapper.member.findMember", id);
      return memVo;
   }

   @Override
   public void updateMember(MemberVO memVo) throws DataAccessException {
      sqlSession.update("mapper.member.updateMember", memVo);
      
   }

   @Override
   public void deleteMember(String id) throws DataAccessException {
      sqlSession.delete("mapper.member.deleteMember", id);
      
   }
   

}