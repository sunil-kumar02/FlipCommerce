package com.example.FlipCommerce.service;

import com.example.FlipCommerce.Exception.CustomerNotFoundException;
import com.example.FlipCommerce.Exception.InsufficientQuantityException;
import com.example.FlipCommerce.Exception.OutOfStockException;
import com.example.FlipCommerce.Exception.ProductNotFoundException;
import com.example.FlipCommerce.dto.RequestDto.ItemRequestDto;
import com.example.FlipCommerce.model.Item;

public interface ItemService {
    public Item createItem(ItemRequestDto itemRequestDto) throws ProductNotFoundException, CustomerNotFoundException, InsufficientQuantityException, OutOfStockException;
}
