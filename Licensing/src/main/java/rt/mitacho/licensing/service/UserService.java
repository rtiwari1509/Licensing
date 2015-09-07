package rt.mitacho.licensing.service;

import rt.mitacho.licensing.model.User;

public interface UserService {
	 
	void save(User user);
	
    User findById(int id);
     
    User findByEMail(String eMail);
     
}
