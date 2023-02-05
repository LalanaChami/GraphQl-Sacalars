package dev.lalanacha.graphqlscalars;

import dev.lalanacha.graphqlscalars.model.Product;
import dev.lalanacha.graphqlscalars.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class GraphqlScalarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlScalarsApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository repository) {
		return args -> {
			List<Product> prodcuts = List.of(new Product("Product 1", false , 23.34F, new BigDecimal(673.344), LocalDateTime.now()),
					new Product("Product 2", true , 283843.344783F, new BigDecimal(673.344), LocalDateTime.now()),
					new Product("Product 3", true , 4459593.4F, new BigDecimal(673.344), LocalDateTime.now()),
					new Product("Product 4", false , 7.84F, new BigDecimal(673.344), LocalDateTime.now()));

			repository.saveAll(prodcuts);
			System.out.println(repository);
			System.out.println(repository.findAll());
			repository.findAll().forEach(x -> System.out.println(x));
		};
	}


}
