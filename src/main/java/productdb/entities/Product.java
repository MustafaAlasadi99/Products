package productdb.entities;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Product")
public class Product {
    @Id
    private String id;
    private Name name; //make sure object is not capitalized
    private Price price;
    private Items_in_stock items_in_stock;
    private Description description;
    private Image image;


    public Product (Name name, Price price, Items_in_stock items_in_stock, Description description, Image image ) {
        
        this.name=name;

        this.price=price;

        this.items_in_stock=items_in_stock;

        this.description=description;

        this.image=image;
        
    }

    public String getId () {
        return this.id;
    }



  

    public Name getName (){

        return this.name;
    }




 public Price getPrice (){

        return this.price;
    }


    public Items_in_stock getItems_in_stock (){

        return this.items_in_stock;
    }
 

    public Description getDescription (){

        return this.description;
    }


public Image getImage (){

        return this.image;
    }








  
 
}