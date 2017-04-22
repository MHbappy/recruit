package com.job.service;

import com.job.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
