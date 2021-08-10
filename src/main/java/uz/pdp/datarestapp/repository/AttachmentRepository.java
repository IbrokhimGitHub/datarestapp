package uz.pdp.datarestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.datarestapp.entity.Attachment;
import uz.pdp.datarestapp.projection.CustomAttachment;

@RepositoryRestResource(path ="attachment",excerptProjection = CustomAttachment.class)
        public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
