package com.inditex.price.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Brand brand;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @ManyToOne
    private PriceList priceList;

    @ManyToOne
    private Product product;

    private Integer priority;

    private BigDecimal price;

    private String currency;

}
