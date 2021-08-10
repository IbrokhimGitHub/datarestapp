package uz.pdp.datarestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestapp.entity.Attachment;
import uz.pdp.datarestapp.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface CustomAttachmentContent {
    Integer getId();
    byte [] getBytes();
    Attachment getAttachment();



}
