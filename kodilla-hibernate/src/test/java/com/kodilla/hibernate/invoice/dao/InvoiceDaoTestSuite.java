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
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Chleb");
        Product product2 = new Product("Mleko");
        Product product3 = new Product("Jablka");

        productDao.save(product1);
        productDao.save(product2);

        Item item1 = new Item(new BigDecimal( 23), 5,new BigDecimal(115), product1);
        Item item2 = new Item(new BigDecimal( 15), 3,new BigDecimal(45), product2);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        Invoice invoice = new Invoice("invoice no 1");
        invoice.setItems(items);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);

        //Then
        int id = invoice.getId();
        Invoice readInvoice = invoiceDao.findOne(id);
        Assert.assertEquals(id, readInvoice.getId());
        Assert.assertEquals(2, readInvoice.getItems().size());

        //CleanUp
//        invoiceDao.delete(id);
    }
}