package uz.pdp.datarestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestapp.entity.Warehouse;
import uz.pdp.datarestapp.projection.CustomWarehouse;

@RepositoryRestResource(path ="warehouse",excerptProjection = CustomWarehouse.class)
public interface WarehouseRepository extends JpaRepository <Warehouse,Integer> {
    boolean existsByName(String name);
}
