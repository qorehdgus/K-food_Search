package com.campus.myapp.service;

import com.campus.myapp.vo.MemberVO;

public interface MemberService {
	//로그인
	public MemberVO login(MemberVO vo);
	
	//회원정보(폼)
	public MemberVO memberSelect(String userid);
		
	//회원정보수정(db)
	public int memberUpdate(MemberVO vo);

}
