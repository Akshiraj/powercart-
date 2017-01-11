package com.niit.DAO;
import java.util.List;

import com.niit.model.User;

public interface userDAO {
	

	

		/*public List<User> list();
		
		public User get(String id);
		
		public User validate (String id,String password);*/
		
		public void save(User user);
		
		public void update(User user);
		
		

	}



