package com.example.case_module_4.repository;

import com.example.case_module_4.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends PagingAndSortingRepository<Account,Integer> {
}
