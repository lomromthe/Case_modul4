package com.example.case_module_4.repository;

import com.example.case_module_4.model.Product;
import com.example.case_module_4.model.query.SortSearchFilter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends PagingAndSortingRepository<Product,Integer> {
//    @Query(nativeQuery = true, value = "SELECT * from product where name like concat('%',:nameproduct,'%');")
//    List<Product> findByNameLike(@Param("nameproduct") String name);
    List<Product> findAllByNameProductContaining(String name);




}
