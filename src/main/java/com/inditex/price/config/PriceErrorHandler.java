package com.inditex.price.config;

import com.inditex.price.config.exception.PricesNotFoundException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PriceErrorHandler {

    @ExceptionHandler(PricesNotFoundException.class)
    public ResponseEntity<ApiResponse> handle(Exception e) {

        ApiResponse apiResponse = ApiResponse.builder()
                .status(HttpStatus.NOT_FOUND.value())
                .reason(e.getMessage())
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ApiResponse {

        private int status;
        private String reason;

    }

}
