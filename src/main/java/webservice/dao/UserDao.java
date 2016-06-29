package webservice.dao;

import java.util.List;

import webservice.pojo.User;

public interface UserDao {
	public List<User> getAllUsers();
	
	public User getUser(Integer id);
}
