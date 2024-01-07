package com.inditex.price.application.usecase;

import com.inditex.price.config.exception.PricesNotFoundException;
import com.inditex.price.domain.Price;
import com.inditex.price.domain.PriorityComparator;
import com.inditex.price.application.port.in.GetPricesPortIn;
import com.inditex.price.application.port.out.GetPricesPorOut;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;
@Component
@Slf4j
public class GetPricesUseCase implements GetPricesPortIn {

    private final GetPricesPorOut getPricesPorOut;

    private static final String FORMAT_DATE = "yyyy-MM-ddHH:mm";

    @Autowired
    public GetPricesUseCase(GetPricesPorOut getPricesPorOut) {
        this.getPricesPorOut = getPricesPorOut;
    }
    @Override
    public Price execute(Long brandId, String date, Long productId) {
        LocalDateTime dateTime = parseLocalDateTime(date);
        List<Price> priceList = getPricesByParams(brandId, productId, dateTime);
        PriorityQueue<Price> queue = new PriorityQueue<>(new PriorityComparator());

        priceList.forEach(queue::offer);

        Price first = queue
                .stream()
                .findFirst()
                .orElseThrow(() -> new PricesNotFoundException("Not Found Price with these params"));

        return first;
    }

    private List<Price> getPricesByParams(Long brandId, Long productId, LocalDateTime dateTime) {
        return Optional.of(getPricesPorOut.findAllByBetweenDatesAndProductIdAndBrandId(brandId, dateTime, productId))
                .orElseThrow(() -> new PricesNotFoundException("Not Found Price with these params"));
    }

    private static LocalDateTime parseLocalDateTime(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_DATE);
        return LocalDateTime.parse(date, formatter);
    }
}
