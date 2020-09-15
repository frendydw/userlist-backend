package com.users.api.service;

import java.util.List;
import com.users.api.model.User;

public interface UserService {
	
	List<User> get();
	
	User get(int id);
	
	void save(User user);
	
	void delete(int id); 
}

