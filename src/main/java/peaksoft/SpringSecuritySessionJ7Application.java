package peaksoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecuritySessionJ7Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecuritySessionJ7Application.class, args);

//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String encode = "java";
//        String password = passwordEncoder.encode(encode);
//        System.out.println(password);
    }

}
