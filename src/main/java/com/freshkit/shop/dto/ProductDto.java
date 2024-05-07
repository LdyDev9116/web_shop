package com.freshkit.shop.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDto {
        private String name;
        private String storeName;
        private String category;
        private String brand;
        private double price;
        private String thumbnailUrl;
        private String contentUrl;
        private boolean isSoldOut;
        private String detail;
        // 생성자, 게터, 세터 생략


}
