package uz.pdp.datarestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestapp.entity.Product;
import uz.pdp.datarestapp.projection.CustomProduct;

@RepositoryRestResource(path ="product",excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
    boolean existsByNameAndCategoryId(String name, Integer category_id);
}
