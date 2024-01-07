package com.inditex.price.adapter.jpa;

import com.inditex.price.domain.Price;
import com.inditex.price.application.port.out.GetPricesPorOut;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
@Repository
@Slf4j
public class PricesAdapter implements GetPricesPorOut {

    private final PriceJPARepository repository;

    @Autowired
    public PricesAdapter(PriceJPARepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Price> findAllByBetweenDatesAndProductIdAndBrandId(Long brandId, LocalDateTime date, Long productId) {
        return repository.findAllByBetweenDatesAndProductIdAndBrandId(date,productId,brandId);
    }
}
