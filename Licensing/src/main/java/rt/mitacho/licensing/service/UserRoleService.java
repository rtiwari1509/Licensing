package rt.mitacho.licensing.service;

import java.util.List;

import rt.mitacho.licensing.model.UserRole;

public interface UserRoleService {

	List<UserRole> findAll();

	UserRole findByType(String type);

	UserRole findById(int id);
}
