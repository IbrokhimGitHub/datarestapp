package uz.pdp.datarestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestapp.entity.Attachment;
import uz.pdp.datarestapp.entity.Category;
import uz.pdp.datarestapp.template.AbsInterface;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();
    String getName();
    Long getSize();
    String contentType();


}
