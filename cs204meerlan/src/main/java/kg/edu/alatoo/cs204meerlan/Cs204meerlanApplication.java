package kg.edu.alatoo.cs204meerlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Cs204meerlanApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cs204meerlanApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Hello Meerlan! </h1>";
	}

}

