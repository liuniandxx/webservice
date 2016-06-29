package webservice.service;

import java.util.List;

import webservice.pojo.User;

public interface UserService {
	List<User> getAllUsers();
	
	User getUser(Integer id);
}
