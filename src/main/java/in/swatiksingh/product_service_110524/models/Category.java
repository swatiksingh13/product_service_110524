package in.swatiksingh.product_service_110524.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel {

    private String title;
    @OneToMany(mappedBy = "category")
    // @Fetch(value = FetchMode.JOIN )     //eager join
    // @Fetch(value = FetchMode.SELECT)    //N+1
    // @Fetch(value = FetchMode.SUBSELECT) //subquery
    private List<Product> products;
}