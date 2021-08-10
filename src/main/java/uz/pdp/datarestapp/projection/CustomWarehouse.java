package uz.pdp.datarestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestapp.entity.Currency;
import uz.pdp.datarestapp.entity.Warehouse;
import uz.pdp.datarestapp.template.AbsInterface;

@Projection(types = Warehouse.class)
public interface CustomWarehouse extends AbsInterface {


}
