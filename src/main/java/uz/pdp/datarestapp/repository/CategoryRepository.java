package uz.pdp.datarestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestapp.entity.Category;
import uz.pdp.datarestapp.projection.CustomCategory;

@RepositoryRestResource(path ="category",excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository <Category,Integer> {

}
