package uz.pdp.datarestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestapp.entity.Supplier;
import uz.pdp.datarestapp.projection.CustomSupplier;

@RepositoryRestResource(path ="supplier",excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

    boolean existsByName(String name);
}
