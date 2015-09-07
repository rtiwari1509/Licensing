package rt.mitacho.licensing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rt.mitacho.licensing.dao.UserRoleDao;
import rt.mitacho.licensing.model.UserRole;

@Service("userRoleService")
@Transactional
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	UserRoleDao dao;

	public List<UserRole> findAll() {
		return dao.findAll();
	}

	public UserRole findByType(String type) {
		return dao.findByType(type);
	}

	public UserRole findById(int id) {
		return dao.findById(id);
	}
}