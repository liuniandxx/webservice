package webservice.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import webservice.pojo.User;
import webservice.service.UserService;

public class UserAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<User> listUser;
	
	private UserService userService;

	@Override
	public String execute() throws Exception {
		listUser = userService.getAllUsers();
		return "success";
	}
	
	
	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
