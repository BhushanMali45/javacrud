package com.bhushan.crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import org.apache.el.stream.Optional;

public class CatServiceImpl  implements CatService{
List<Catgory> categories=new ArrayList<>();


    @Override
    public String CreateCategories(Catgory cat) {
          categories.add(cat);
          return "saved";
    }

    @Override
    public List<Catgory> readCategories() {
        return categories;
    }




 
    @Override
    public boolean deleteCategories(long id) {
        categories.remove(id);
        return true;
    }
    
    
    

   


}