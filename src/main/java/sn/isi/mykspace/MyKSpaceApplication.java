package sn.isi.mykspace;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sn.isi.mykspace.service.UtilisateurService;

@SpringBootApplication
public class MyKSpaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyKSpaceApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UtilisateurService utilisateurService) {
        return args -> {

        };
    }
}
