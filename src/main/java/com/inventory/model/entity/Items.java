package com.inventory.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="item")
@Data
@ToString
public class Items {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    
    @Column(name = "item_name")
    private String itemName;
    
    @Column(name = "item_description")
    private String itemDescription;
    
    @Column(name = "status")
    private String status;
    
    public String getId()   
    {  
        return id;  
    }  
    public void setId(String id)   
    {  
        this.id = id;  
    }  
    
    public String getItemName()   
    {  
        return itemName;  
    }  
    public void setItemName(String itemName)   
    {  
        this.itemName = itemName;  
    }  
    
     public String getItemDescription()   
    {  
        return itemDescription;  
    }  
    public void setItemDescription(String itemDescription)   
    {  
        this.itemDescription = itemDescription;  
    }  
    
     public String getStatus()   
    {  
        return status;  
    }  
    public void setStatus(String status)   
    {  
        this.status = status;  
    }  
}
