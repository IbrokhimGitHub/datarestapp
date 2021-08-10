package uz.pdp.datarestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestapp.entity.Address;
import uz.pdp.datarestapp.entity.Measurement;
import uz.pdp.datarestapp.template.AbsInterface;

@Projection(types = Measurement.class)
public interface CustomMeasurement extends AbsInterface {


}
