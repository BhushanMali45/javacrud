package com.bhushan.crud;

import java.util.List;
import java.util.Locale.Category;

public interface CatService {

    
 String CreateCategories(Catgory cat);
 List<Catgory> readCategories();
 boolean deleteCategories(long id);
    
}
