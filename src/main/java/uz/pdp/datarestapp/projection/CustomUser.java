package uz.pdp.datarestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestapp.entity.Client;
import uz.pdp.datarestapp.entity.User;
import uz.pdp.datarestapp.entity.Warehouse;
import uz.pdp.datarestapp.template.AbsInterface;

import java.util.Set;

@Projection(types = User.class)
public interface CustomUser  {

    String getFirstName();
    String getLastName();
    String getPhoneNumber();
    String getCode();
    String getPassword();
    boolean isActive();
    Set<Warehouse> getWarehouses();
    Integer getId();
}
