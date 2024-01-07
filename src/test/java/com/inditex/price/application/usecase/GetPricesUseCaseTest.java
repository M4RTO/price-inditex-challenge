package com.inditex.price.application.usecase;

import com.inditex.price.PriceMockFactory;
import com.inditex.price.application.port.out.GetPricesPorOut;
import com.inditex.price.domain.Price;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@DisplayName("Price useCase")
@ExtendWith(MockitoExtension.class)
public class GetPricesUseCaseTest {


    @Mock
    GetPricesPorOut getPricesPorOut;


    @InjectMocks
    GetPricesUseCase getPricesUseCase;


    /**
     * Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1 (ZARA)
     */
    @Test
    void getPriceByTenAmAndSpecificProductIdAndBrandId() {
        final var expected = PriceMockFactory.getPriceExpectedBy10();

        when(getPricesPorOut.findAllByBetweenDatesAndProductIdAndBrandId(any(),any(),any()))
                .thenReturn(PriceMockFactory.getPriceListEntityByTimeTenAm());

        Price all = getPricesUseCase.execute(1L,"2020-06-1410:00",35455L);

        Assertions.assertEquals(expected, all);
    }

    /**
     * petición a las 16:00 del día 14 del producto 35455 para la brand 1 (ZARA)
     */
    @Test
    void getPriceBySixteenPMAndSpecificProductIdAndBrandId() {
        final var expected = PriceMockFactory.getPriceExpectedBySixTeenPMWithParams();

        when(getPricesPorOut.findAllByBetweenDatesAndProductIdAndBrandId(any(),any(),any()))
                .thenReturn(PriceMockFactory.getPriceListEntityByTimeSixteenWithParams());

        Price all = getPricesUseCase.execute(1L,"2020-06-1416:00",35455L);

        Assertions.assertEquals(expected, all);
    }

    /**
     * petición a las 21:00 del día 14 del producto 35455 para la brand 1 (ZARA)
     */
    @Test
    void getPriceByTwentyOnePMAndSpecificProductIdAndBrandId() {
        final var expected = PriceMockFactory.getPriceExpectedByTwentyOnePMWithParams();

        when(getPricesPorOut.findAllByBetweenDatesAndProductIdAndBrandId(any(),any(),any()))
                .thenReturn(PriceMockFactory.getPriceListEntityByTimeTwentyOneWithParams());

        Price all = getPricesUseCase.execute(1L,"2020-06-1421:00",35455L);

        Assertions.assertEquals(expected, all);
    }

    /**
     * petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
     */
    @Test
    void getPriceByTenAmPMDFifteenDayAndSpecificProductIdAndBrandId() {
        final var expected = PriceMockFactory.getPriceExpectedByTenAmPMDFifteenDayWithParams();

        when(getPricesPorOut.findAllByBetweenDatesAndProductIdAndBrandId(any(),any(),any()))
                .thenReturn(PriceMockFactory.getPriceListEntityByTenAmPMDFifteenDayWithParams());

        Price all = getPricesUseCase.execute(1L,"2020-06-1510:00",35455L);

        Assertions.assertEquals(expected, all);
    }

    /**
     * petición a las 21:00 del día 16 del producto 35455 para la brand 1 (ZARA)
     */
    @Test
    void getPriceByTwentyOnePMDSixteenDayAndSpecificProductIdAndBrandId() {
        final var expected = PriceMockFactory.getPriceExpectedByTwentyOnePMDSixteenDayWithParams();

        when(getPricesPorOut.findAllByBetweenDatesAndProductIdAndBrandId(any(),any(),any()))
                .thenReturn(PriceMockFactory.getPriceListEntityByTwentyOnePMSixteenDayWithParams());

            Price all = getPricesUseCase.execute(1L,"2020-06-1621:00",35455L);

        Assertions.assertEquals(expected, all);
    }
}
