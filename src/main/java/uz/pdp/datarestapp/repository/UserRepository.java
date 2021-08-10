package uz.pdp.datarestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestapp.entity.User;
import uz.pdp.datarestapp.projection.CustomUser;

@RepositoryRestResource(path ="user",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User,Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
}
