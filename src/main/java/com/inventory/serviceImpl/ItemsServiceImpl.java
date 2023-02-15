package com.inventory.serviceImpl;

import com.inventory.model.entity.Items;
import com.inventory.repository.ItemsRepository;
import com.inventory.service.ItemsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService{
    
    @Autowired ItemsRepository itemsRepository;

    @Override
    public boolean saveItems(Items items1) {
        
//        try {
            itemsRepository.save(items1);
            return true;
//        } catch (Exception e) {
//            throw new ResponseEntity(HttpStatus.BAD_REQUEST, "not add items");
//        }
    }
    
    @Override
    public Items findById(String id){
      return  itemsRepository.findByItemId(id);
    }
    
    @Override
    public List<Items> getAllItemList(){
        return itemsRepository.getAllItemList();
    }
    
}
