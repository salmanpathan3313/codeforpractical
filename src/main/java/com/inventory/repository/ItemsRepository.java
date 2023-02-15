package com.inventory.repository;

import com.inventory.model.entity.Items;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository<Items, String>{
    
    @Transactional
    @Query(nativeQuery = true, value = "select * from item where id = ?1")
    public Items findByItemId(String id);

    @Transactional
    @Query(nativeQuery = true, value = "select * from item where status = 'Active'")
    public List<Items> getAllItemList();
    
}
