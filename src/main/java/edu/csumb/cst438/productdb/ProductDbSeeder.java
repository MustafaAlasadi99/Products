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
        Product product2 = new Product(new Name("DJI Mavic Air Quadcopter with Remote Controller - Onyx Black"), new Price(779.0) ,  new Items_in_stock(100) , new Description("Mavic Air was built to go wherever adventure takes you. Inheriting the best of the Mavic series, this ultraportable and foldable drone features high-end flight performance and functionality for limitless exploration"), new Image ("https://images-na.ssl-images-amazon.com/images/I/51We5oIVy-L._SL1000_.jpg") )    ;
        Product product3 = new Product(new Name("DJI Spark with Remote Control Combo (White)"), new Price(399.0) ,  new Items_in_stock(100) , new Description("Though agile in the air, drones can be bulky and cumbersome when on land. Not so with the DJI Spark which won't hold you back no matter what the adventure. This compact quadcopter features an integrated camera with motorized stabilization to capture 12MP photos, 1080p Full HD videos, and even aerial selfies."), new Image ("https://images-na.ssl-images-amazon.com/images/I/613jin2%2BCyL._SL1000_.jpg") )    ;
        Product product4 = new Product(new Name("Holy Stone GPS FPV RC Drone HS100 Camera Live Video GPS Return Home Quadcopter"), new Price(250.0) ,  new Items_in_stock(100) , new Description("Holy Stone HS100 Navigator is an intelligent RC quadcopter, equipped with an advanced GPS system. The high definition camera allows you to take quality aerial footage. Equipped with the new 'follow me' feature, this drone will stay above you automatically, keeping the camera centered on you at all times and capturing your every move. With a newly created intelligent battery, you will get flight times up to 15 minutes, giving you a more extensive flight experience!"), new Image ("https://images-na.ssl-images-amazon.com/images/I/71YD5dvU-mL._SL1500_.jpg") )    ;
        //delete db data
        productRepo.deleteAll();
        //add db seeds
        List<Product> products = Arrays.asList(product1, product2, product3, product4);
        productRepo.saveAll(products);

        
        
        
        
        
      
    }

}