package uz.pdp.datarestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestapp.entity.Address;
import uz.pdp.datarestapp.entity.Client;
import uz.pdp.datarestapp.template.AbsInterface;

@Projection(types = Client.class)
public interface CustomClient extends AbsInterface {

    String getPhoneNumber();
}
