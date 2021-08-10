package uz.pdp.datarestapp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.datarestapp.entity.*;
import uz.pdp.datarestapp.template.AbsInterface;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput  {
    Integer getId();
    Timestamp getDate();
    Warehouse getWarehouse();
    Client getClient();
    Currency getCurrency();
    String factureNumber();
    String code();


}
