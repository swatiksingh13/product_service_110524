package in.swatiksingh.product_service_110524.services;

import in.swatiksingh.product_service_110524.dtos.ProductResponseDto;
import in.swatiksingh.product_service_110524.models.Product;

public interface ProductService {

    public ProductResponseDto getSingleProduct(int productId);

    public ProductResponseDto addProduct(
            String title,
            String description,
            String imageUrl,
            String category,
            double price);
}
