package frameworkdemo.summerboot.controller;

import frameworkdemo.summerboot.pojo.account;
import frameworkdemo.summerboot.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class accountcontroller {

    @Autowired
    private accountService accountservice;

    @RequestMapping(value = "account/{id}",method = RequestMethod.GET)
    public account findInfo(@PathVariable int id){
        return accountservice.findInfoById(id);
    }

}
