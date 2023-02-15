package com.inventory.businessservice;

import com.inventory.model.dto.ItemsRequestDto;
import org.springframework.http.ResponseEntity;


public interface ItemsBusinessService {

    public ResponseEntity addItems(ItemsRequestDto itemsRequestDto);

    public ResponseEntity editItems(String id, ItemsRequestDto itemsRequestDto);

    public ResponseEntity deleteItems(String id);

    public ResponseEntity listItems();

    public ResponseEntity getOneItems(String id);
    
    
}
