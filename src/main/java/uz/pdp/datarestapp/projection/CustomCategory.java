package uz.pdp.datarestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestapp.entity.Category;
import uz.pdp.datarestapp.entity.Measurement;
import uz.pdp.datarestapp.template.AbsInterface;

@Projection(types = Category.class)
public interface CustomCategory extends AbsInterface {
    Category getParentCategory();


}
