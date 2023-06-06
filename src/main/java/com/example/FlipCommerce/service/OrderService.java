package com.example.FlipCommerce.service;

import com.example.FlipCommerce.Exception.CustomerNotFoundException;
import com.example.FlipCommerce.Exception.InsufficientQuantityException;
import com.example.FlipCommerce.Exception.InvalidCardException;
import com.example.FlipCommerce.Exception.ProductNotFoundException;
import com.example.FlipCommerce.dto.RequestDto.OrderRequestDto;
import com.example.FlipCommerce.dto.ResponseDto.OrderResponseDto;
import com.example.FlipCommerce.model.Card;
import com.example.FlipCommerce.model.Cart;
import com.example.FlipCommerce.model.OrderEntity;

public interface OrderService {
    public OrderResponseDto placeOrder(OrderRequestDto orderRequestDto) throws CustomerNotFoundException, ProductNotFoundException, InsufficientQuantityException, InvalidCardException;

    OrderEntity placeOrder(Cart cart, Card card) throws InsufficientQuantityException;
}


