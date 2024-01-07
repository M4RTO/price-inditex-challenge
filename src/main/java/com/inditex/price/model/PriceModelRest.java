package com.inditex.price.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.inditex.price.domain.Brand;
import com.inditex.price.domain.Price;
import com.inditex.price.domain.PriceList;
import com.inditex.price.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PriceModelRest {

    private Long id;
    private BrandModelRest brand;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private PriceListModelRest priceList;
    private ProductModelRest product;
    private Integer priority;
    private BigDecimal price;
    private String currency;


    public static PriceModelRest toPriceRest(Price price) {
        return PriceModelRest.builder()
                .id(price.getId())
                .priceList(convertPriceList(price.getPriceList()))
                .currency(price.getCurrency())
                .brand(convertBrand(price.getBrand()))
                .priority(price.getPriority())
                .startDate(price.getStartDate())
                .endDate(price.getEndDate())
                .product(convertProduct(price.getProduct()))
                .price(price.getPrice())
                .build();
    }

    private static ProductModelRest convertProduct(Product product) {
        return ProductModelRest.builder()
                .id(product.getId())
                .description(product.getDescription())
                .build();
    }

    private static BrandModelRest convertBrand(Brand brand) {
        return BrandModelRest.builder()
                .id(brand.getId())
                .description(brand.getDescription())
                .build();
    }

    private static PriceListModelRest convertPriceList(PriceList priceList) {
        return PriceListModelRest.builder()
                .id(priceList.getId())
                .description(priceList.getDescription())
                .build();
    }

}
