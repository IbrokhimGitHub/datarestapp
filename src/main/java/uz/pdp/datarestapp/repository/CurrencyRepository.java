package uz.pdp.datarestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestapp.entity.Currency;
import uz.pdp.datarestapp.projection.CustomCurrency;

@RepositoryRestResource(path ="currency",excerptProjection = CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
    boolean existsByName(String name);


}
