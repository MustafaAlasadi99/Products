package edu.csumb.cst438.productdb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.csumb.cst438.productdb.entities.Description;
import edu.csumb.cst438.productdb.entities.Image;
import edu.csumb.cst438.productdb.entities.Items_in_stock;
import edu.csumb.cst438.productdb.entities.Name;
import edu.csumb.cst438.productdb.entities.Price;
import edu.csumb.cst438.productdb.entities.Product;






@Component
public class ProductDbSeeder implements CommandLineRunner{
    @Autowired
    IProductRepository productRepo;

    @Override
    public void run(String... args) throws Exception {
        
       
        Product product1 = new Product(new Name("DJI Phantom 3 Standard Quadcopter Drone with 2.7K HD Video Camera"), new Price(399.0) ,  new Items_in_stock(100) , new Description("Meet the Phantom 3 Standard: the most accessible intelligent flying camera ever built. Easy to fly and engineered to let everyone take to the sky, now you have the power of flight."), new Image ("https://images-na.ssl-images-amazon.com/images/I/71Ao-WrjMDL._SL1500_.jpg") )    ;
        Product product2 = new Product(new Name("admin2"), new Price(399.0) ,  new Items_in_stock(100) , new Description(" "), new Image ("") )    ;
        

        //delete db data
        productRepo.deleteAll();
        //add db seeds
        List<Product> products = Arrays.asList(product1, product2);
        productRepo.saveAll(products);

        
        
        
        
        
      
    }

}