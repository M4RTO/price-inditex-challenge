package com.inditex.price.application.port.in;

import com.inditex.price.domain.Price;

public interface GetPricesPortIn {

    Price execute(Long brandId, String date, Long productId);
}
