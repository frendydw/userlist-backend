package com.users.api.dao;

import java.util.List;
import com.users.api.model.User;

public interface UserDAO {
	
	List<User> get();
	
	User get(int id);
	
	void save(User user);
	
	void delete(int id); 
}

