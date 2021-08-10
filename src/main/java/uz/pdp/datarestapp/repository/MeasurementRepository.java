package uz.pdp.datarestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestapp.entity.Measurement;
import uz.pdp.datarestapp.projection.CustomMeasurement;

@RepositoryRestResource(path ="measurement",excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {


    boolean existsByName(String name);
}
