package com.billing.invoice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMVCHello {
	@RequestMapping("/hello")  
    public String test() {  
        System.out.println("test"); 
        return "hello"; 
    }
}
