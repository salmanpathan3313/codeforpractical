package com.inventory.admin.controller;

import com.inventory.businessservice.ItemsBusinessService;
import com.inventory.model.dto.ItemsRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemsController {
    
    @Autowired ItemsBusinessService itemsBusinessService;
    
    @PostMapping("/add")
    public ResponseEntity addItems(
            @RequestBody(required = true) ItemsRequestDto itemsRequestDto
    ){
        System.out.println(" Enter Add Items");
        
        itemsBusinessService.addItems(itemsRequestDto);
        
        return new ResponseEntity(HttpStatus.OK.value(),HttpStatus.OK);
    }
    
    
    @PostMapping("/edit/{id}")
    public ResponseEntity editItems(
            @RequestBody(required = true) ItemsRequestDto itemsRequestDto,
            @PathVariable("id") String id
    ){
        System.out.println(" Enter Edit Items");
        
        itemsBusinessService.editItems(id,itemsRequestDto);
        
        return new ResponseEntity(HttpStatus.OK.value(),HttpStatus.OK);
    }
    
     @GetMapping("/delete/{id}")
    public ResponseEntity deleteItems(
            @PathVariable("id") String id
    ){
        System.out.println(" Enter Delete Items");
        
        itemsBusinessService.deleteItems(id);
        
        return new ResponseEntity(HttpStatus.OK.value(),HttpStatus.OK);
    }
    
    
     @GetMapping("/list")
    public ResponseEntity deleteItems(
    ){
        System.out.println(" Enter List Items");
        
        itemsBusinessService.listItems();
        
        return new ResponseEntity(HttpStatus.OK.value(),HttpStatus.OK);
    }
    
     @GetMapping("/getone/{id}")
    public ResponseEntity getOneItems(
        @PathVariable("id") String id
    ){
        System.out.println(" Enter Get One Items");
        
        itemsBusinessService.getOneItems(id);
        
        return new ResponseEntity(HttpStatus.OK.value(),HttpStatus.OK);
    }
    
    
    
}
