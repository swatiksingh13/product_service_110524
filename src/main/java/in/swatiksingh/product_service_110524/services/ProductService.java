package in.swatiksingh.product_service_110524.services;

import in.swatiksingh.product_service_110524.dtos.FakeStoreDto;
import in.swatiksingh.product_service_110524.dtos.ProductResponseDto;
import in.swatiksingh.product_service_110524.exceptions.ProductNotFoundException;
import in.swatiksingh.product_service_110524.models.Product;

import java.util.List;

public interface ProductService {

    public Product getSingleProduct(Long productId) throws ProductNotFoundException;

    public List<Product> getAllProducts();

    public Product addProduct(
            String title,
            String description,
            String imageUrl,
            String category,
            double price);

    public Product deleteProduct(Long productId) throws ProductNotFoundException;

    public Product updateProduct(Long productId,
                                 String title,
                                 String description,
                                 String imageUrl,
                                 String category,
                                 double price) throws ProductNotFoundException;
    public Product replaceProduct(Long productId,
                                  String title,
                                  String description,
                                  String imageUrl,
                                  String category,
                                  double price) throws ProductNotFoundException;
}
