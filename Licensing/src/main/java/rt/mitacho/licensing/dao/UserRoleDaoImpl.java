package rt.mitacho.licensing.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import rt.mitacho.licensing.model.UserRole;

@Repository("userRoleDao")
public class UserRoleDaoImpl extends AbstractDao<Integer, UserRole>implements UserRoleDao {

	@SuppressWarnings("unchecked")
	public List<UserRole> findAll() {
		Criteria crit = createEntityCriteria();
		crit.addOrder(Order.asc("type"));
		return (List<UserRole>) crit.list();
	}

	public UserRole findByType(String type) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("type", type));
		return (UserRole) crit.uniqueResult();
	}

	public UserRole findById(int id) {
		return getByKey(id);
	}

}
