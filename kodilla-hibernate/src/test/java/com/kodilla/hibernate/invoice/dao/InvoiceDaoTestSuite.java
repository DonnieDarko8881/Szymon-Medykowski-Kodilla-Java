package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
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
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private  ProductDao productDao;

    @Autowired ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave(){
        Item item = new Item(new BigDecimal(20), 2, new BigDecimal(40));
        Item item1 = new Item(new BigDecimal(30), 1, new BigDecimal(40));
        Item item2 = new Item(new BigDecimal(30), 1, new BigDecimal(40));

        Invoice invoice = new Invoice("1357");

        Product product1 = new Product("computer");
        Product product2 = new Product("Mouse");
        Product product3 = new Product("KeyBoard");

      //  product1.getItem().add(item);
      //  product2.getItem().add(item1);
       // product3.getItem().add(item2);

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);


       // item.setProduct(product1);
      //  item1.setProduct(product2);
      //  item2.setProduct(product3);


        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

//        productDao.save(product1);
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp

    }

}
