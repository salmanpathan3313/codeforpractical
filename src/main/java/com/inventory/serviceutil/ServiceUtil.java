package com.inventory.serviceutil;

import com.inventory.model.dto.ItemsRequestDto;
import com.inventory.model.entity.Items;
import java.util.List;



public interface ServiceUtil {

    public List<ItemsRequestDto> convertItemListModel(List<Items> itemList);
    
    public ItemsRequestDto convertItemListModel(Items itemList);
    
}
