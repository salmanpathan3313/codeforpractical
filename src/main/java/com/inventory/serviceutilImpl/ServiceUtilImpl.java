package com.inventory.serviceutilImpl;

import com.inventory.model.dto.ItemsRequestDto;
import com.inventory.model.entity.Items;
import com.inventory.serviceutil.ServiceUtil;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ServiceUtilImpl implements ServiceUtil{
    
    @Override
    public List<ItemsRequestDto> convertItemListModel(List<Items> itemList){
        
        List<ItemsRequestDto> itemsRequestDtoList = new ArrayList<>();
        List<Items> itemListDto =  itemList;
        for(Items items: itemListDto){
            itemsRequestDtoList.add(convertItemListModel(items));
        }
        
        return itemsRequestDtoList;
        
        
        
        
        
    
    }
    
    @Override
    private ItemsRequestDto convertItemListModel(Items items) {
      
        ItemsRequestDto itemsRequestDto = new ItemsRequestDto();
        
        itemsRequestDto.setId(items.getId());
        itemsRequestDto.setItemsName(items.getItemName());
        itemsRequestDto.setItemDescription(items.getItemDescription());
        
        return itemsRequestDto;
            
    }
    
}
