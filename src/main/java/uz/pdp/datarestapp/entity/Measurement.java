package uz.pdp.datarestapp.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.datarestapp.template.AbsEntity;

import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Measurement extends AbsEntity {

}
