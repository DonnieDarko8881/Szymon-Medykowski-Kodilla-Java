package com.kodilla.hibernate.invoice.dao;

import static org.junit.Assert.*;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemDaoTest {
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testItemDaoSave() {
        //Given

        Item item = new Item(new BigDecimal(20), 2, new BigDecimal(40));


        //When
        itemDao.save(item);


        //Then
        int id = item.getId();
        Item readItem = itemDao.findOne(id);
        Assert.assertEquals(id, readItem.getId());

        //CleanUp
        itemDao.delete(id);
    }

}