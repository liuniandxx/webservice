package webservice.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import webservice.dao.UserDao;
import webservice.pojo.User;

public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDao{
	
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().queryForList("getAllUsers", null);
	}

	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return (User) getSqlMapClientTemplate().queryForObject("getUser", id);
	}
}
