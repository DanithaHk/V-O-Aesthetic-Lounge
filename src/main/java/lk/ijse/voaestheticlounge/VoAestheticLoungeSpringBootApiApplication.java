package lk.ijse.voaestheticlounge;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VoAestheticLoungeSpringBootApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoAestheticLoungeSpringBootApiApplication.class, args);
    }
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();

    }
}
