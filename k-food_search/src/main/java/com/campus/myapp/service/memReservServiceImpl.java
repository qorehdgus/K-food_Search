package com.campus.myapp.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.campus.myapp.dao.memReservDAO;
import com.campus.myapp.vo.memReservVO;



@Service
@Primary
public class memReservServiceImpl implements memReservService {
	//마이페이지-멤버예약관련ServiceImpl-작성자: 최원준
	@Inject
	memReservDAO dao;

	@Override
	public List<memReservVO> memReservList(memReservVO vo) {
		return dao.memReservList(vo);
	}

	@Override
	public int memReservCancel(memReservVO vo) {
		return dao.memReservCancel(vo);
	}

	@Override
	public int memReservDel(memReservVO vo) {
		return dao.memReservDel(vo);
	}
	
	
}
