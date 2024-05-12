package in.swatiksingh.product_service_110524.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product {

    private int id;
    private String title;
    private String description;
    private double price;
    private String imageURL;
    private Category category;

}
