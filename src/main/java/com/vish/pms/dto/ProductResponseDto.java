package com.vish.pms.dto;

import java.math.BigDecimal;
import java.util.UUID;


public record ProductResponseDto (

    UUID id,

    String name, 

    String description,
    
    String brand,

    String category,
    
    BigDecimal price,
    
    Integer quantity,

    String createdAt    
    
) {}