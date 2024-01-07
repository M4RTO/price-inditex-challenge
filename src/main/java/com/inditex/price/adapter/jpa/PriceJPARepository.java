package com.inditex.price.adapter.jpa;

import com.inditex.price.domain.Price;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;


public interface PriceJPARepository extends CrudRepository<Price, Long>{

    @Query("SELECT p FROM Price p WHERE :date between p.startDate and p.endDate and p.product.id=:productId and p.brand.id=:brandId")
    List<Price> findAllByBetweenDatesAndProductIdAndBrandId(LocalDateTime date, Long productId, Long brandId);
}

