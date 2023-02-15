package com.inventory.businessserviceImpl;

import com.inventory.businessservice.ItemsBusinessService;
import com.inventory.model.dto.ItemsRequestDto;
import com.inventory.model.entity.Items;
import com.inventory.service.ItemsService;
import com.inventory.serviceutil.ServiceUtil;
import java.util.List;
import org.aspectj.apache.bcel.classfile.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ItemsBusinessServiceImpl implements ItemsBusinessService{
    
    @Autowired ItemsService itemsService;
    
    @Autowired ServiceUtil serviceUtil;

    @Override
    public ResponseEntity addItems(ItemsRequestDto itemsRequestDto) {
        
        Items items1 = new Items();
        
        items1.setItemName(itemsRequestDto.getItemsName());
        items1.setItemDescription(itemsRequestDto.getItemDescription());
        
        itemsService.saveItems(items1);
        
        return ResponseEntity.status(HttpStatus.CREATED).body("data add successfully");
   
        
    }
    
    @Override
    public ResponseEntity editItems(String id, ItemsRequestDto itemsRequestDto){
        
        Items item = itemsService.findById(id);
        
        if(item != null && !item.equals("")){
            
            Items updateItems = item;
        
            updateItems.setItemName(itemsRequestDto.getItemsName());
            updateItems.setItemDescription(itemsRequestDto.getItemDescription());
            

            itemsService.saveItems(updateItems);

        }
        
        
            return ResponseEntity.status(HttpStatus.CREATED).body("data update successfully");
        
    }
    
    
    @Override
    public ResponseEntity deleteItems(String id){
        Items item = itemsService.findById(id);
        
        if(item != null && !item.equals("")){
            item.setStatus("Deleted");
            itemsService.saveItems(item);
        
        }
        
         return ResponseEntity.status(HttpStatus.CREATED).body("data Deleted successfully");
    }
    
    @Override
    public ResponseEntity listItems(){
        List<Items> itemList =  itemsService.getAllItemList();
        List<ItemsRequestDto> itemListModel = serviceUtil.convertItemListModel(itemList);
        
        return new ResponseEntity(true, HttpStatus.OK.value(), HttpStatus.OK, itemListModel);
 
    }
    
    @Override
    public ResponseEntity getOneItems(String id){
        
         Items item = itemsService.findById(id);
         
         Items itemList =  item;
         if(item != null){
            ItemsRequestDto itemListModel = serviceUtil.convertItemListModel(itemList);
         }
          return new ResponseEntity(true, HttpStatus.OK.value(), HttpStatus.OK, itemListModel);
//        hrd@zyapaar.com.
    }

  
}
