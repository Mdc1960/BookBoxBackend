package fr.tours.etu.boiteletre;

import fr.tours.etu.boiteletre.Repository.UserRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookBoxApplication {

    public static void main(String[] args) {
		SpringApplication.run(BookBoxApplication.class, args);
	}

}
