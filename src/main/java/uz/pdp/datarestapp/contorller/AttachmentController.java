package uz.pdp.datarestapp.contorller;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.datarestapp.entity.Attachment;
import uz.pdp.datarestapp.entity.AttachmentContent;
import uz.pdp.datarestapp.repository.AttachmentContentRepository;
import uz.pdp.datarestapp.repository.AttachmentRepository;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("attachment")

public class AttachmentController {
    @Autowired
    AttachmentRepository attachmentRepository;
    @Autowired
    AttachmentContentRepository attachmentContentRepository;

    @SneakyThrows
    public String add(MultipartHttpServletRequest request){
        String forReturn=null;
        Iterator<String> fileNames = request.getFileNames();

        do {
            List<MultipartFile> files = request.getFiles(fileNames.next());
            for (MultipartFile file : files) {
                if (file!=null){
                    String originalFilename = file.getOriginalFilename();
                    long size = file.getSize();
                    String contentType = file.getContentType();
                    Attachment attachment = new Attachment();
                    attachment.setContentType(contentType);
                    attachment.setName(originalFilename);
                    attachment.setSize(size);
                    Attachment savedAttachment = attachmentRepository.save(attachment);

                    AttachmentContent attachmentContent = new AttachmentContent();
                    attachmentContent.setAttachment(savedAttachment);
                    attachmentContent.setBytes(file.getBytes());
                    attachmentContentRepository.save(attachmentContent);
                    forReturn+="file saved with id = "+savedAttachment.getId()+"\n";
                }
            }

        }while (fileNames.hasNext());
        if (forReturn!=null)
            return forReturn;
        return "file isn't find";


    }
}
