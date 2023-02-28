package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Student student(){
        Student s=new Student();
        s.setCode("JW");
        s.setFirstName("Thaw Thaw");
        s.setLastName("Thinzar");
        return s;
    }
}
