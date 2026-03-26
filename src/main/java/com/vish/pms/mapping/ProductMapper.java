package com.vish.pms.mapping;

import com.vish.pms.dto.ProductRequestDto;
import com.vish.pms.dto.ProductResponseDto;
import com.vish.pms.entity.Product;

public class ProductMapper {
    
    public static Product toEntity(ProductRequestDto productRequestDto){
        if(productRequestDto == null){
            return null;
        }

        return Product.builder()
                    .name(productRequestDto.name())
                    .brand(productRequestDto.brand())
                    .category(productRequestDto.category())
                    .description(productRequestDto.description())
                    .price(productRequestDto.price())
                    .quantity(productRequestDto.quantity())
                    .build();
         
    }

    public static ProductResponseDto toResponse(Product product){
        if(product == null) return null;

        return new ProductResponseDto(
            product.getId(),
            product.getName(),
            product.getDescription(),
            product.getBrand(),
            product.getCategory(),
            product.getPrice(),
            product.getQuantity(),
            product.getCreatedAt().toString()
        );
    }
}
