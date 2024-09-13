package com.bhushan.crud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class PController {
    

            List<Product> products=new ArrayList<>();

            @GetMapping("products")
            public List<Product> getMethodName() {
                return products;
            }


            @PostMapping("products")
            public String postMethodName(@RequestBody Product pd) {
                products.add(pd);
                return "saved";
            }
            
            

}
