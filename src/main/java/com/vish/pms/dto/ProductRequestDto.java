package com.vish.pms.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ProductRequestDto (

    @NotBlank(message = "Name is required")
    String name, 

    @Size(max = 500)
    @NotBlank(message = "Description is required")
    String description,
    
    @NotBlank(message = "Brand is required")
    String brand,

    @NotBlank(message = "Category is required")
    String category,
    
    @NotNull
    @DecimalMin(value = "0.0", inclusive = true, message = "Price must be 0 or greater")
    BigDecimal price,
    
    @NotNull
    @Min(0)
    Integer quantity
    
) {}