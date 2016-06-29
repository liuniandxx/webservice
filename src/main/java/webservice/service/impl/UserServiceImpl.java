package webservice.service.impl;

import java.util.List;

import webservice.dao.UserDao;
import webservice.pojo.User;
import webservice.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
