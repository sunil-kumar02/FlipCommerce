package com.example.FlipCommerce.service.Impl;

import com.example.FlipCommerce.dto.RequestDto.SellerRequestDto;
import com.example.FlipCommerce.dto.ResponseDto.SellerResponseDto;
import com.example.FlipCommerce.model.Seller;
import com.example.FlipCommerce.repository.SellerRepository;
import com.example.FlipCommerce.service.SellerService;
import com.example.FlipCommerce.transformer.SellerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {
    @Autowired
    SellerRepository sellerRepository;
    public SellerResponseDto addSeller(SellerRequestDto sellerRequestDto){
        //dto to entity
        Seller seller = SellerTransformer.sellerRequestDtoToSeller(sellerRequestDto);
         Seller savedSeller = sellerRepository.save(seller);

         //prepare response dto
        return SellerTransformer.SellerToSellerResponseDto(savedSeller);
    }
}
