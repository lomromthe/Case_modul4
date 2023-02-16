package com.example.case_module_4.controller.adminController;

import com.example.case_module_4.model.Product;
import com.example.case_module_4.model.query.SortSearchFilter;
import com.example.case_module_4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin_product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        productService.save(product);
        return product;
    }
    @PutMapping
    public void edit(@RequestBody Product product) {
        productService.save(product);
    }

    @GetMapping("/search/{text}")
    public List<Product> findByNameLike(@PathVariable String text) {
        return productService.findAllByNameLike(text);
    }

    @PostMapping("/upImg")
    public String upImg(@RequestParam MultipartFile fileImg) {
        String nameImg = fileImg.getOriginalFilename();
        try {
            FileCopyUtils.copy(fileImg.getBytes(), new File("E:\\Case_modul4_spring\\FE_CASE\\img/" + nameImg));
            return "/Case_modul4_spring/FE_CASE/img/" + nameImg;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/{id}")
    public Product showEdit(@PathVariable int id) {
        return productService.findById(id);
    }


    @DeleteMapping("/{id}")
    public Product delete(@PathVariable int id) {
        return productService.delete(id);
    }


}