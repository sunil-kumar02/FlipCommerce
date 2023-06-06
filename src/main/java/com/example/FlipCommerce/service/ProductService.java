package com.example.FlipCommerce.service;

import com.example.FlipCommerce.Enum.Category;
import com.example.FlipCommerce.Exception.SellerNotFoundException;
import com.example.FlipCommerce.dto.RequestDto.ProductRequestDto;
import com.example.FlipCommerce.dto.ResponseDto.ProductResponseDto;

import java.util.List;

public interface ProductService {
    public ProductResponseDto addProduct(ProductRequestDto productRequestDto) throws SellerNotFoundException;

     List<ProductResponseDto> getAllProductsByCategoryAndPrice(Category category, int price);
}
