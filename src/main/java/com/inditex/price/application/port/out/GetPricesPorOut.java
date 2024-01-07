package com.inditex.price.application.port.out;

import com.inditex.price.domain.Price;

import java.time.LocalDateTime;
import java.util.List;


public interface GetPricesPorOut {

    List<Price> findAllByBetweenDatesAndProductIdAndBrandId(Long brandId, LocalDateTime date, Long productId);

}
