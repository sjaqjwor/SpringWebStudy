package net.madvirus.spring4.chap2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository{
	
	private Map<String,User> userMap = new HashMap<>();

	public User findById(String id){
		return userMap.get(id);
	}


	public void setUsers(List<User> users){
		for(User u : users){
			userMap.put(u.getId(),u);
		}
	}
}
