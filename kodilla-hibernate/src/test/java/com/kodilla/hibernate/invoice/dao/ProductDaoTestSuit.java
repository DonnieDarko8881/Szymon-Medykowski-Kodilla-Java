package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDaoTestSuit {
    @Autowired
    private ProductDao productDao;




    @Test
    public void testProductDaoSave() {
        //Given
        Product product = new Product("Laptop");


        //When
        productDao.save(product);


        //Then
        int id = product.getId();
        Product readProduct = productDao.findOne(id);
        Assert.assertEquals(id, readProduct.getId());

        //CleanUp
        productDao.delete(id);
    }

    @Test
    public void ProductDaoSaveWithItems(){

      Product laptop = new Product("Laptop");
        Item item = new Item(new BigDecimal(20), 2, new BigDecimal(40));
        Item item1 = new Item(new BigDecimal(30), 1, new BigDecimal(40));

        laptop.getItem().add(item);
        laptop.getItem().add(item1);

        item.setProduct(laptop);
        item1.setProduct(laptop);

        productDao.save(laptop);

        //When
        productDao.save(laptop);
        int id = laptop.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        productDao.delete(id);

    }
}
