package com.example.case_module_4.service;

import com.example.case_module_4.model.Account;
import com.example.case_module_4.model.Product;
import com.example.case_module_4.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountService {
    @Autowired
    AccountRepo accountRepo;
    public List<Account> getAll(){
        return (List<Account>) accountRepo.findAll();
    }
    public Account save(Account account) {return accountRepo.save(account);}
    public Account findById(int id){return accountRepo.findById(id).get();}
    public void deleteById(int id) {
        accountRepo.deleteById(id);
    }
}
