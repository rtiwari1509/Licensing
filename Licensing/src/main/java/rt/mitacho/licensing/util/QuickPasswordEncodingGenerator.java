package rt.mitacho.licensing.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class QuickPasswordEncodingGenerator {
	 
    /**
     * @param args
     */
    public static void main(String[] args) {
            String password = "abc125";
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encode= passwordEncoder.encode(password);
            System.out.println("ENCODE :- "+encode);
            System.out.println("DECODE :- "+passwordEncoder.matches(password, "$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm"));
            
    }
 
}