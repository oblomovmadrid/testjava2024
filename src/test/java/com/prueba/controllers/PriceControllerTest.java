package com.prueba.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.prueba.repositories.PriceRepository;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PriceControllerTest {

	@Autowired
    private PriceRepository priceService;


    
    @Test
    public void getPriceTest1() throws Exception {
        Timestamp startDate = Timestamp.valueOf("2020-06-14 10:00:00");
        assertThat(priceService.findByStartDateAndEndDateAndProductIdAndBrandId(startDate, startDate, 35455, 1).toString()).isEqualTo("Optional[Price [id=1, brandId=1, startDate=2020-06-14 00:00:00.0, endDate=2020-12-31 23:59:59.0, priceList=1, productId=35455, priority=0, price=35.5, curr=EUR]]");
    }
    
    @Test
    public void getPriceTest2() throws Exception {
        Timestamp startDate = Timestamp.valueOf("2020-06-14 16:00:00");
        assertThat(priceService.findByStartDateAndEndDateAndProductIdAndBrandId(startDate, startDate, 35455, 1).toString()).isEqualTo("Optional[Price [id=2, brandId=1, startDate=2020-06-14 15:00:00.0, endDate=2020-06-14 18:30:00.0, priceList=2, productId=35455, priority=1, price=25.45, curr=EUR]]");
    }
    
    @Test
    public void getPriceTest3() throws Exception {
        Timestamp startDate = Timestamp.valueOf("2020-06-14 21:00:00");
        assertThat(priceService.findByStartDateAndEndDateAndProductIdAndBrandId(startDate, startDate, 35455, 1).toString()).isEqualTo("Optional[Price [id=1, brandId=1, startDate=2020-06-14 00:00:00.0, endDate=2020-12-31 23:59:59.0, priceList=1, productId=35455, priority=0, price=35.5, curr=EUR]]");
    }
    
    @Test
    public void getPriceTest4() throws Exception {
        Timestamp startDate = Timestamp.valueOf("2020-06-15 10:00:00");
        assertThat(priceService.findByStartDateAndEndDateAndProductIdAndBrandId(startDate, startDate, 35455, 1).toString()).isEqualTo("Optional[Price [id=3, brandId=1, startDate=2020-06-15 00:00:00.0, endDate=2020-06-15 11:00:00.0, priceList=3, productId=35455, priority=1, price=30.5, curr=EUR]]");
    }
    
    @Test
    public void getPriceTest5() throws Exception {
        Timestamp startDate = Timestamp.valueOf("2020-06-16 21:00:00");
        assertThat(priceService.findByStartDateAndEndDateAndProductIdAndBrandId(startDate, startDate, 35455, 1).toString()).isEqualTo("Optional[Price [id=4, brandId=1, startDate=2020-06-15 16:00:00.0, endDate=2020-12-31 23:59:59.0, priceList=4, productId=35455, priority=1, price=38.95, curr=EUR]]");
    }
}
