package ras.sam.app.inf;

import org.springframework.data.jpa.repository.JpaRepository;
import ras.sam.app.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
