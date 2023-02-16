package com.example.case_module_4.service;

import com.example.case_module_4.model.Product;
import com.example.case_module_4.model.query.SortSearchFilter;
import com.example.case_module_4.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public List<Product> getAll() {
        return (List<Product>) productRepo.findAll();
    }
    public List<Product> findAllByNameLike(String name) {
        return productRepo.findAllByNameProductContaining(name);
    }
    public void save(Product product) {
         productRepo.save(product);
    }

    public Product findById(int id) {
        return productRepo.findById(id).get();
    }

    public Product delete(int id) {
        Product product = findById(id);
        productRepo.deleteById(id);
        return product;
    }
}
