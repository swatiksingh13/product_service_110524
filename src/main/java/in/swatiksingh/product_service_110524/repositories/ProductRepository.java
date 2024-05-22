package in.swatiksingh.product_service_110524.repositories;

import in.swatiksingh.product_service_110524.models.Product;
import in.swatiksingh.product_service_110524.repositories.projections.ProductProjection;
import in.swatiksingh.product_service_110524.repositories.projections.ProductWithIdAndTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>  {

    Product save(Product product);
    List<Product> findAll();
    Product findByIdIs(Long id);
    List<Product> findAllByCategory_title(String title);
   // List<Product> findAllByCategory_titleContaining(String title);

    //HQL-Hibernate Query Language

    @Query(" Select p from Product p where p.category.title = :categoryName")
    List<Product> getProductWithCategoryName(String categoryName);

    @Query("Select p.title as title  from Product p where p.category.title = :categoryName")
    List<String> someTitleMethod(String categoryName);

    @Query("Select p.id as id,p.title as title  from Product p where p.category.title = :categoryName")
    List<ProductWithIdAndTitle> someMethod1(String categoryName);

    @Query("Select p.id as id,p.title as title,p.price as price  from Product p where p.category.title = :categoryName")
    List<ProductProjection> someMethod2(String categoryName);

    // Native SQL query

    @Query(value = "Select * from product as p where p.id = :id" , nativeQuery = true)
    Product someNativeSql(Long id);

    @Query(value = "Select * from product as p where p.id = :id" , nativeQuery = true)
    ProductProjection someNativeSql1(Long id);

    @Query(value = "Select * from product as p where p.id = :id" , nativeQuery = true)
    ProductProjection someNativeSql2(Long id);

}
