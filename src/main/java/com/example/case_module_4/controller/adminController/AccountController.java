package com.example.case_module_4.controller.adminController;

import com.example.case_module_4.model.Account;
import com.example.case_module_4.model.Product;
import com.example.case_module_4.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin_account")
public class AccountController {
    @Autowired
    AccountService accountService;
    @GetMapping
    List<Account> getAll(){
        return accountService.getAll();
    }

//    @GetMapping("/findAccountByUsername")
//    public Account getAccountByUsername(@RequestBody String userName) {
//        return accountService.findAccountByUsername(userName);
//    }
//
//    @GetMapping("/{id}")
//    public Account findById(@PathVariable Long id) {
//        return accountService.findAccountById(id);
//    }
@DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable int id){
        accountService.deleteById(id);
}
}
