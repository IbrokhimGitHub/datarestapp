package uz.pdp.datarestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestapp.entity.Currency;
import uz.pdp.datarestapp.entity.Measurement;
import uz.pdp.datarestapp.template.AbsInterface;

@Projection(types = Currency.class)
public interface CustomCurrency extends AbsInterface {


}
