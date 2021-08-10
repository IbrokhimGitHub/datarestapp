package uz.pdp.datarestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestapp.entity.Attachment;
import uz.pdp.datarestapp.entity.Category;
import uz.pdp.datarestapp.entity.Measurement;
import uz.pdp.datarestapp.entity.Product;
import uz.pdp.datarestapp.template.AbsInterface;

@Projection(types = Product.class)
public interface CustomProduct extends AbsInterface {
    Attachment getPhoto();
    String code();
    Measurement getMeasurement();
    Category getCategory();



}
