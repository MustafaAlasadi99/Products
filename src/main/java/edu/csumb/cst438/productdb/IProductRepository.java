package edu.csumb.cst438.productdb;

import java.util.List;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import edu.csumb.cst438.productdb.entities.Product;

@Repository
public interface IProductRepository extends MongoRepository<Product, String> {
    @Query (value = "{'id':?0}")  
    Product findByRepoId(String name);

    

}