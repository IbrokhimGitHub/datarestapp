package uz.pdp.datarestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestapp.entity.Address;
import uz.pdp.datarestapp.entity.Supplier;
import uz.pdp.datarestapp.template.AbsEntity;
import uz.pdp.datarestapp.template.AbsInterface;

@Projection(types = Supplier.class)
public interface CustomSupplier extends AbsInterface {

    String getPhoneNumber();
}
