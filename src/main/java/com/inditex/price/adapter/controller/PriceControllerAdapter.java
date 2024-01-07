package com.inditex.price.adapter.controller;

import com.inditex.price.domain.Price;
import com.inditex.price.application.port.in.GetPricesPortIn;
import com.inditex.price.model.PriceModelRest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/prices")
@Slf4j
public class PriceControllerAdapter {

    private final GetPricesPortIn getPricesPortIn;

    public PriceControllerAdapter(GetPricesPortIn getPricesPortIn) {
        this.getPricesPortIn = getPricesPortIn;
    }

    @GetMapping("/{brandId}")
    public ResponseEntity<PriceModelRest> getPrices(
            @PathVariable Long brandId,
            @RequestParam String date,
            @RequestParam Long productId
    ) {
        log.info("Get prices with this brandId {} ,date {} and productId {}", brandId, date, productId );
        Price price = getPricesPortIn.execute(brandId, date, productId);
        PriceModelRest priceModelRest = PriceModelRest.toPriceRest(price);
        log.info("Get response: {}", priceModelRest);
        return new ResponseEntity<>(priceModelRest, HttpStatus.OK);


    }
}
