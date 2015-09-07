package rt.mitacho.licensing.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import rt.mitacho.licensing.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User>implements UserDao {

	public void save(User user) {
		persist(user);
	}

	public User findById(int id) {
		return getByKey(id);
	}

	public User findByEMail(String eMail) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("email", eMail));
		return (User) crit.uniqueResult();
	}

}
