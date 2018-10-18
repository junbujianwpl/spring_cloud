package com.study.controller.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
        userDao.save(user);

	}

}
