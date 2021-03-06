package rt.mitacho.licensing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rt.mitacho.licensing.dao.UserDao;
import rt.mitacho.licensing.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public void save(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		dao.save(user);
	}

	public User findById(int id) {
		return dao.findById(id);
	}

	public User findByEMail(String eMail) {
		return dao.findByEMail(eMail);
	}
}
