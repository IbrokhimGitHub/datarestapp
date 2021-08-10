package uz.pdp.datarestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestapp.entity.Output;
import uz.pdp.datarestapp.projection.CustomOutput;

@RepositoryRestResource(path ="output",excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {
}
