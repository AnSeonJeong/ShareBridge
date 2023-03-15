package com.sharebridge.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sharebridge.dao.RenterRequestDao;
import com.sharebridge.dto.RequestDto;
import com.sharebridge.param.MypageParam;

@Repository
public class RenterRequestImpl implements RenterRequestDao {
	@Autowired
	SqlSession session;
	
	String ns = "RenterRequest.";
	
	@Override
	public List<RequestDto> getRequestListByMemberId(MypageParam mp) {
		return session.selectList(ns + "selectAllByMemberId", mp);
	}
}