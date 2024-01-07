package com.inditex.price.adapter.jpa;

import com.inditex.price.domain.Price;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;


@DisplayName("Test jpa adapter prices")
@DataJpaTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PricesAdapterTest {

    @Autowired
    private PriceJPARepository repository;

    private static PricesAdapter adapter;

    @BeforeAll
    public void setUp() {

        adapter = new PricesAdapter(repository);
    }



    @Test
    @DisplayName("Test find all with params ")
    public void tesFindAllWithParams() {
        LocalDateTime dateTime = LocalDateTime.of(2020, Month.JUNE, 16, 21, 0, 0);
        List<Price> priceList = adapter.findAllByBetweenDatesAndProductIdAndBrandId(1L, dateTime, 35455L);
        Assertions.assertEquals(LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59), priceList.get(0).getEndDate());
        Assertions.assertEquals(LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59), priceList.get(1).getEndDate());

    }
}
