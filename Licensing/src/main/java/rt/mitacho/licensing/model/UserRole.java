package rt.mitacho.licensing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="USER_ROLE")
public class UserRole {
 
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id; 
 
    @Column(name="TYPE", length=15, unique=true, nullable=false)
    private String type = Role.USER.getRole();
     
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof UserRole))
            return false;
        UserRole other = (UserRole) obj;
        if (id != other.id)
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return "UserRole [id=" + id + ",  type=" + type  + "]";
    }
     
 
}