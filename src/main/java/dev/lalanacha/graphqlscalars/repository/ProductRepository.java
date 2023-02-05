package dev.lalanacha.graphqlscalars.repository;

import dev.lalanacha.graphqlscalars.model.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductRepository extends ListCrudRepository<Product, Integer> {

}
