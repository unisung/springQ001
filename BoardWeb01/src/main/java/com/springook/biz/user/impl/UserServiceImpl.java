package com.springook.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springook.biz.user.UserService;
import com.springook.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;
    
	@Override
	public void insertUser(UserVO vo) {
	    userDAO.insertUser(vo);
	}

	@Override
	public UserVO getUser(UserVO vo) {
	  return userDAO.getUser(vo);
	}

	@Override
	public void deleteUser(UserVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(UserVO vo) {
		// TODO Auto-generated method stub

	}

}
