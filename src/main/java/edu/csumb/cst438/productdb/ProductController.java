package edu.csumb.cst438.productdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import edu.csumb.cst438.productdb.entities.Product;

@RestController
public class ProductController {
    @Autowired
    IProductRepository ProductRepository;

    @CrossOrigin(origins = "https://team-7-project.herokuapp.com")
    @GetMapping ("/GetAllProducts")
    public List<Product> getAll () {
        List<Product> result = ProductRepository.findAll();
        return result;
    }

    @CrossOrigin(origins = "https://team-7-project.herokuapp.com")
    @GetMapping("/id/{id}")
    public Product getProductById (@PathVariable String id) {
        Product result = ProductRepository.findByRepoId(id);
        return result;
    }


    	
 
	
}