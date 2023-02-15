package com.inventory.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ItemsRequestDto {
    
    private String id;
    
   
    private String itemsName;
    
    private String itemDescription;

    public ItemsRequestDto(String id, String itemsName, String itemDescription) {
        this.id = id;
        this.itemsName = itemsName;
        this.itemDescription = itemDescription;
    }
    
    
}
