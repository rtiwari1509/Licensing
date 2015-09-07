package rt.mitacho.licensing.dao;

import rt.mitacho.licensing.model.User;

public interface UserDao {
	 
	void save(User user);
    
	User findById(int id);
     
    User findByEMail(String eMail);
     
}
