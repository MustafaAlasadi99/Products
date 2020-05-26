package productdb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import productdb.entities.Description;
import productdb.entities.Image;
import productdb.entities.Items_in_stock;
import productdb.entities.Name;
import productdb.entities.Price;
import productdb.entities.Product;
import productdb.entities.Highlights;






@Component
public class ProductDbSeeder implements CommandLineRunner{
    @Autowired
    IProductRepository productRepo;

    @Override
    public void run(String... args) throws Exception {
        
       
        Product product1 = new Product(new Name("DJI Phantom 3 Standard Quadcopter Drone with 2.7K HD Video Camera"), new Price(399.0) ,  new Items_in_stock(100) , new Description("Meet the Phantom 3 Standard: the most accessible intelligent flying camera ever built. Easy to fly and engineered to let everyone take to the sky, now you have the power of flight."), new Image ("https://images-na.ssl-images-amazon.com/images/I/71Ao-WrjMDL._SL1500_.jpg"), new Highlights("first","second") )    ;
        Product product2 = new Product(new Name("DJI Mavic Air Quadcopter with Remote Controller - Onyx Black"), new Price(779.0) ,  new Items_in_stock(100) , new Description("Mavic Air was built to go wherever adventure takes you. Inheriting the best of the Mavic series, this ultraportable and foldable drone features high-end flight performance and functionality for limitless exploration"), new Image ("https://images-na.ssl-images-amazon.com/images/I/51We5oIVy-L._SL1000_.jpg"), new Highlights("ad") )    ;
        //Product product3 = new Product(new Name("DJI Spark with Remote Control Combo (White)"), new Price(399.0) ,  new Items_in_stock(100) , new Description("Though agile in the air, drones can be bulky and cumbersome when on land. Not so with the DJI Spark which won't hold you back no matter what the adventure. This compact quadcopter features an integrated camera with motorized stabilization to capture 12MP photos, 1080p Full HD videos, and even aerial selfies."), new Image ("https://images-na.ssl-images-amazon.com/images/I/613jin2%2BCyL._SL1000_.jpg") )    ;
        //Product product4 = new Product(new Name("Holy Stone GPS FPV RC Drone HS100 Camera Live Video GPS Return Home Quadcopter"), new Price(250.0) ,  new Items_in_stock(100) , new Description("Holy Stone HS100 Navigator is an intelligent RC quadcopter, equipped with an advanced GPS system. The high definition camera allows you to take quality aerial footage. Equipped with the new 'follow me' feature, this drone will stay above you automatically, keeping the camera centered on you at all times and capturing your every move. With a newly created intelligent battery, you will get flight times up to 15 minutes, giving you a more extensive flight experience!"), new Image ("https://images-na.ssl-images-amazon.com/images/I/71YD5dvU-mL._SL1500_.jpg") )    ;
        //Product product5=  new Product(new Name("Yuneec Typhoon H Pro"), new Price(1200.0), new Items_in_stock(100), new Description("The Typhoon H with Intel RealSense Technology is capable of detecting obstacles and intelligently navigating around them, gives you the freedom to explore new creative options. RealSense integrates with Follow Me mode to avoid objects while filming in any direction. The Intel RealSense R200 camera with Intel Atom powered module builds a 3D model of the world, allowing you to focus on the subject without worrying about flying into obstacles."), new Image("https://images-na.ssl-images-amazon.com/images/I/81BzyhJKsML._SL1500_.jpg")  );
        //Product product6=  new Product(new Name("DJI Mavic PRO Platinum Drone "), new Price(1000.0), new Items_in_stock(100), new Description("A new and enhanced endurance, coupled with quieter flight makes the Mavic Pro Platinum DJI’s best portable drone yet. The DJI Mavic Pro folds down as small as a bottle of water, making it small enough to bring with you everywhere.New OcuSync transmission system offers up to 4.3 miles (7km) of transmission range."), new Image("https://images-na.ssl-images-amazon.com/images/I/61h9aBE1U9L._SL1000_.jpg")  );
        //Product product7=  new Product(new Name("DJI Phantom 4 Quadcopter Aircraft"), new Price(900.0), new Items_in_stock(100), new Description("DJI Phantom 4 The DJI Phantom 4 is the smartest flying camera DJI has ever created. Able to fly intelligently with a tap, automatically create seamless tracking shots, fly intelligently over or around obstacles and much more."), new Image("https://images-na.ssl-images-amazon.com/images/I/71k%2BRgYbL%2BL._SL1200_.jpg")  );
        //Product product8=  new Product(new Name("GDU - O2 Quadcopter Drone with HD Camera"), new Price(700.0), new Items_in_stock(100), new Description("O2 is designed for everyone, combining extreme portability, high resolution image capturing, advanced sensors and on board computing capability, and ease of use, to be the go-to option for your everyday drone."), new Image("https://images-na.ssl-images-amazon.com/images/I/51%2B%2BXowP4ZL._SL1200_.jpg")  );

        //delete db data
        productRepo.deleteAll();
        //add db seeds
        List<Product> products = Arrays.asList(product1, product2);
        //, product3, product4, product5, product6, product7, product8);
        productRepo.saveAll(products);

        
        
        
        
        
      
    }

}