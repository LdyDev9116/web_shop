package com.freshkit.shop.service;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.freshkit.shop.dto.ProductDto;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private final ResourceLoader resourceLoader;
    private List<ProductDto> products;

    public ProductService(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @PostConstruct
    public void init() {
        try {
            Resource resource = resourceLoader.getResource("classpath:data.json");
            ObjectMapper mapper = new ObjectMapper();
            // JSON 파일에서 정의되지 않은 속성을 무시하도록 설정
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            ProductDto[] productsArray = mapper.readValue(resource.getInputStream(), ProductDto[].class);
            products = Arrays.asList(productsArray);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load products data", e);
        }
    }

    public List<ProductDto> getProducts() {
        return products;
    }
}