package com.example.FlipCommerce.repository;

import com.example.FlipCommerce.Exception.CustomerNotFoundException;
import com.example.FlipCommerce.Exception.EmptyCartException;
import com.example.FlipCommerce.Exception.InsufficientQuantityException;
import com.example.FlipCommerce.Exception.InvalidCardException;
import com.example.FlipCommerce.dto.RequestDto.CheckoutCartRequestDto;
import com.example.FlipCommerce.dto.RequestDto.ItemRequestDto;
import com.example.FlipCommerce.dto.ResponseDto.CartResponseDto;
import com.example.FlipCommerce.dto.ResponseDto.OrderResponseDto;
import com.example.FlipCommerce.model.Cart;
import com.example.FlipCommerce.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {


    }
