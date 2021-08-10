package uz.pdp.datarestapp.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.datarestapp.template.AbsEntity;

import javax.persistence.Entity;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Warehouse extends AbsEntity {
}
