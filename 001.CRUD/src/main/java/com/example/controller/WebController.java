package com.example.controller;

import com.example.model.Customer;
import com.example.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {

    //@Autowired
    CustomerRepository repository;

    @RequestMapping("/save")
    public String process(){

        repository.save(new Customer("hi","hi"));

        return "Done";
    }


    @RequestMapping("/findall")
    public String findAll(){

        String result = "";

        for(Customer cust : repository.findAll()){
            result += cust + "</br>";
        }

        return result;
    }

    @RequestMapping("/findbyid")
    public String findById(@RequestParam("id") long id){
        String result = "";
        result = repository.findById(id).toString();
        return result;
    }

    @RequestMapping("/findbylastname")
    public String fetchDataByLastName(@RequestParam("lastname") String lastName){
        String result = "";

        for(Customer cust: repository.findByLastName(lastName)){
            result += cust + "</br>";
        }

        return result;
    }
}