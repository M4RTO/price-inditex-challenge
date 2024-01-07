package com.inditex.price;

import com.inditex.price.domain.Brand;
import com.inditex.price.domain.Price;
import com.inditex.price.domain.PriceList;
import com.inditex.price.domain.Product;
import com.inditex.price.model.BrandModelRest;
import com.inditex.price.model.PriceListModelRest;
import com.inditex.price.model.PriceModelRest;
import com.inditex.price.model.ProductModelRest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class PriceMockFactory {

    public static PriceModelRest getPriceResponse() {
        return PriceModelRest.builder()
                .id(1L)
                .brand(BrandModelRest.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2021, Month.JANUARY, 1, 10, 0, 0, 0))
                .endDate(LocalDateTime.of(2021, Month.JANUARY, 1, 10, 0, 0, 0))
                .priceList(PriceListModelRest.builder().id(1L).description("Tarifa 1").build())
                .price(BigDecimal.valueOf(14.50))
                .product(ProductModelRest.builder().id(35455L).description("Trench impermeable").build())
                .currency("EUR")
                .priority(1)
                .build();
    }

    public static Price getPriceExpectedBy10() {
        return Price.builder()
                .id(1L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 14, 23, 59, 59))
                .priceList(PriceList.builder().id(1L).description("Tarifa 1").build())
                .product(Product.builder().id(35455L).description("Trench impermeable").build())
                .price(BigDecimal.valueOf(35.50))
                .currency("EUR")
                .priority(0)
                .build();
    }

    public static List<Price> getPriceListEntityByTimeTenAm() {
        return List.of(Price.builder()
                .id(1L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 14, 23, 59, 59))
                .priceList(PriceList.builder().id(1L).description("Tarifa 1").build())
                .price(BigDecimal.valueOf(35.50))
                .product(Product.builder().id(35455L).description("Trench impermeable").build())
                .currency("EUR")
                .priority(0)
                .build());
    }

    public static Price getPriceExpectedBySixTeenPMWithParams() {
        return Price.builder()
                .id(2L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 15, 0))
                .endDate(LocalDateTime.of(2020, Month.JUNE, 14, 18, 30))
                .priceList(PriceList.builder().id(2L).description("Tarifa 2").build())
                .product(Product.builder().id(35455L).description("Trench impermeable").build())
                .price(BigDecimal.valueOf(25.45))
                .currency("EUR")
                .priority(1)
                .build();
    }

    public static List<Price> getPriceListEntityByTimeSixteenWithParams() {
        return List.of(
                Price.builder()
                        .id(2L)
                        .brand(Brand.builder().id(1L).description("ZARA").build())
                        .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 15, 0))
                        .endDate(LocalDateTime.of(2020, Month.JUNE, 14, 18, 30))
                        .priceList(PriceList.builder().id(2L).description("Tarifa 2").build())
                        .product(Product.builder().id(35455L).description("Trench impermeable").build())
                        .price(BigDecimal.valueOf(25.45))
                        .currency("EUR")
                        .priority(1)
                        .build(),
                Price.builder()
                        .id(1L)
                        .brand(Brand.builder().id(1L).description("ZARA").build())
                        .startDate(LocalDateTime.of(2020, Month.JUNE, 6, 0, 0))
                        .endDate(LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59,59))
                        .priceList(PriceList.builder().id(1L).description("Tarifa 1").build())
                        .product(Product.builder().id(35455L).description("Trench impermeable").build())
                        .price(BigDecimal.valueOf(35.50))
                        .currency("EUR")
                        .priority(0)
                        .build()

        );
    }

    public static Price getPriceExpectedByTwentyOnePMWithParams() {
        return Price.builder()
                .id(1L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 14, 23, 59, 59))
                .priceList(PriceList.builder().id(1L).description("Tarifa 1").build())
                .product(Product.builder().id(35455L).description("Trench impermeable").build())
                .price(BigDecimal.valueOf(35.50))
                .currency("EUR")
                .priority(0)
                .build();
    }

    public static List<Price> getPriceListEntityByTimeTwentyOneWithParams() {
        return List.of(Price.builder()
                .id(1L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 14, 23, 59, 59))
                .priceList(PriceList.builder().id(1L).description("Tarifa 1").build())
                .price(BigDecimal.valueOf(35.50))
                .product(Product.builder().id(35455L).description("Trench impermeable").build())
                .currency("EUR")
                .priority(0)
                .build());
    }

    public static Price getPriceExpectedByTenAmPMDFifteenDayWithParams() {
        return Price.builder()
                .id(3L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 15, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 15, 11, 0, 0))
                .priceList(PriceList.builder().id(3L).description("Tarifa 3").build())
                .product(Product.builder().id(35455L).description("Trench impermeable").build())
                .price(BigDecimal.valueOf(30.50))
                .currency("EUR")
                .priority(1)
                .build();
    }

    public static List<Price> getPriceListEntityByTenAmPMDFifteenDayWithParams() {
        return List.of(Price.builder()
                .id(1L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 14, 23, 59, 59))
                .priceList(PriceList.builder().id(1L).description("Tarifa 1").build())
                .price(BigDecimal.valueOf(35.50))
                .product(Product.builder().id(35455L).description("Trench impermeable").build())
                .currency("EUR")
                .priority(0)
                .build(),
        Price.builder()
                .id(3L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 15, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 15, 11, 0, 0))
                .priceList(PriceList.builder().id(3L).description("Tarifa 3").build())
                .product(Product.builder().id(35455L).description("Trench impermeable").build())
                .price(BigDecimal.valueOf(30.50))
                .currency("EUR")
                .priority(1)
                .build());
    }

    public static Price getPriceExpectedByTwentyOnePMDSixteenDayWithParams() {
        return Price.builder()
                .id(4L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2020, Month.JUNE, 15, 16, 0, 0))
                .endDate(LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59))
                .priceList(PriceList.builder().id(4L).description("Tarifa 4").build())
                .product(Product.builder().id(35455L).description("Trench impermeable").build())
                .price(BigDecimal.valueOf(38.95))
                .currency("EUR")
                .priority(1)
                .build();
    }

    public static List<Price> getPriceListEntityByTwentyOnePMSixteenDayWithParams() {
        return List.of(Price.builder()
                        .id(1L)
                        .brand(Brand.builder().id(1L).description("ZARA").build())
                        .startDate(LocalDateTime.of(2020, Month.JUNE, 14, 0, 0, 0))
                        .endDate(LocalDateTime.of(2020, Month.DECEMBER, 14, 23, 59, 59))
                        .priceList(PriceList.builder().id(1L).description("Tarifa 1").build())
                        .price(BigDecimal.valueOf(35.50))
                        .product(Product.builder().id(35455L).description("Trench impermeable").build())
                        .currency("EUR")
                        .priority(0)
                        .build(),
                Price.builder()
                        .id(4L)
                        .brand(Brand.builder().id(1L).description("ZARA").build())
                        .startDate(LocalDateTime.of(2020, Month.JUNE, 15, 16, 0, 0))
                        .endDate(LocalDateTime.of(2020, Month.DECEMBER, 31, 23, 59, 59))
                        .priceList(PriceList.builder().id(4L).description("Tarifa 4").build())
                        .product(Product.builder().id(35455L).description("Trench impermeable").build())
                        .price(BigDecimal.valueOf(38.95))
                        .currency("EUR")
                        .priority(1)
                        .build());
    }

    public static Price getPrice() {
        return Price.builder()
                .id(1L)
                .brand(Brand.builder().id(1L).description("ZARA").build())
                .startDate(LocalDateTime.of(2021, Month.JANUARY, 1, 10, 0, 0))
                .endDate(LocalDateTime.of(2021, Month.JANUARY, 1, 10, 0, 0))
                .priceList(PriceList.builder().id(1L).description("Tarifa 1").build())
                .price(BigDecimal.valueOf(14.5))
                .product(Product.builder().id(35455L).description("Trench impermeable").build())
                .currency("EUR")
                .priority(1)
                .build();
    }
}
