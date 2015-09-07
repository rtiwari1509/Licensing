package rt.mitacho.licensing.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import rt.mitacho.licensing.model.UserRole;
import rt.mitacho.licensing.service.UserRoleService;
 

 
@Component
public class RoleToUserRoleConverter implements Converter<Object, UserRole>{
 
    @Autowired
    UserRoleService userRoleService;
 
    /*
     * Gets UserProfile by Id
     * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
     */
    public UserRole convert(Object element) {
        Integer id = Integer.parseInt((String)element);
        UserRole role= userRoleService.findById(id);
        System.out.println("Profile : "+role);
        return role;
    }
     
    /*
     * Gets UserProfile by type
     * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
     */
    /*
    public UserProfile convert(Object element) {
        String type = (String)element;
        UserProfile profile= userProfileService.findByType(type);
        System.out.println("Profile ... : "+profile);
        return profile;
    }
    */
 
}