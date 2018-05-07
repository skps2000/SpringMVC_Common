package com.spring.common.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("mainDao")
public class MainDao {
	
	@Autowired
	SqlSession sql;
	
	public HashMap selOne(HashMap pMap){
		return sql.selectOne("mainMapper.selOne", pMap);
	}
}
