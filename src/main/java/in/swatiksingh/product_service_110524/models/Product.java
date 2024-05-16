package in.swatiksingh.product_service_110524.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@Entity
public class Product extends BaseModel {

//    private Long id;
    private String title;
    private String description;
    private double price;
    private String imageURL;
    @ManyToOne (cascade = {CascadeType.PERSIST})
    private Category category;

}