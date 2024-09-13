package com.bhushan.crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class CatController {
    
        List<Catgory> categories=new ArrayList<>();

       
//  CatService catService=new CatServiceImpl();

//  CatService catService;
        @GetMapping("/api/products")
        public List<Catgory> getMethodName() {
            // return catService.readCategories();
            return categories;
        }


        @PostMapping("/api/products")
        public String postMethodName(@RequestBody Catgory cat) {
            categories.add(cat);
            // catService.CreateCategories(cat);
            // catService.CreateCategories(cat);
            return "saved ";
        }


        @DeleteMapping("/api/products/{di}")
        public boolean deleteCategories(@PathVariable long id){
            // catService.deleteCategories(id);
            categories.remove(id);
            return true;
        }




        
        


        
        
        



}
