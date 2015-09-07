package rt.mitacho.licensing.dao;

import java.util.List;

import rt.mitacho.licensing.model.UserRole;

public interface UserRoleDao {

	List<UserRole> findAll();
    
    UserRole findByType(String type);
     
    UserRole findById(int id);
}
