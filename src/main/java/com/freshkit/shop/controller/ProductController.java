package com.freshkit.shop.controller;
import com.freshkit.shop.dto.ProductDto;
import com.freshkit.shop.service.ProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@Controller

public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //shop-catalog
    @GetMapping("/shop-catalog2")
    public String catalog22222() {
//        return "signup";
        log.info("========================회원가입");
        return "shop-catalog2";
    }


    @GetMapping("/prd2")
    public List<ProductDto> getAllProducts(Model model) {
        log.info("Crawling data");
        List<ProductDto> products = productService.getProducts();
        model.addAttribute("products", products);
        return productService.getProducts();
    }
    @GetMapping("/prd3")
    public List<ProductDto> getAllProducts3(Model model) {
        log.info("Crawling data");
        List<ProductDto> products = productService.getProducts();
        model.addAttribute("products", products);
        return productService.getProducts();
    }

    @GetMapping("/prd")
    public List<ProductDto> getAllProductstest(Model model) {
        log.info("Crawling data");
        List<ProductDto> products = productService.getProducts();
        model.addAttribute("products", products);
        return productService.getProducts();
    }

//    @GetMapping("/prd")
//    public List<ProductDto> getAllProducts() {
//        log.info("========================크롤링");
//        return productService.getProducts();
//
//    }

}