package uz.pdp.datarestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestapp.entity.Input;
import uz.pdp.datarestapp.projection.CustomInput;

@RepositoryRestResource(path ="input",excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input,Integer> {

}
