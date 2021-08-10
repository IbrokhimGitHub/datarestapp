package uz.pdp.datarestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestapp.entity.Client;
import uz.pdp.datarestapp.projection.CustomClient;

@RepositoryRestResource(path ="ClientRepository",excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {
}
