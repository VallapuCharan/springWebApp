package com.charan.springWebApp.service;

import com.charan.springWebApp.model.Product;
import com.charan.springWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(1,"Iphone", 1500),
//            new Product(2,"Samsung", 1000),
//            new Product(3,"Motorola", 800)));

    public List<Product> getProducts() {
        //return products;
        return repo.findAll();
    }

    public Product getProductByID(int prodID) {
//        return products.stream()
//                .filter(p -> p.getProdId() == prodID)
//                .findFirst().get();
        return repo.findById(prodID).orElse(new Product());
    }

    public void addProduct(Product product) {
//        products.add(product);
        repo.save(product);
    }

    public void updateProduct(Product product) {
//        int index = 0;
//        for(int i = 0; i < products.size(); i++) {
//            if(products.get(i).getProdId() == product.getProdId()) {
//                index = i;
//            }
//        }
//        products.set(index, product);
        repo.save(product);
    }

    public void deleteProduct(int prodID) {
//        int index = 0;
//        for(int i = 0; i < products.size(); i++) {
//            if(products.get(i).getProdId() == prodID) {
//                index = i;
//            }
//        }
//        products.remove(index);
        repo.deleteById(prodID);
    }
}
