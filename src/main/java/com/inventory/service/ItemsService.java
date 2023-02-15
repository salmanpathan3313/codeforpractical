package com.inventory.service;

import com.inventory.model.entity.Items;
import java.util.List;


public interface ItemsService {


    public boolean saveItems(Items items1);

    public Items findById(String id);

    public List<Items> getAllItemList();
    
}
