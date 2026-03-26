package com.vish.pms.specification;

import java.math.BigDecimal;

import org.springframework.data.jpa.domain.Specification;

import com.vish.pms.entity.Product;

public class ProductSpecification {

    public static Specification<Product> hasName(String name) {
        return (root, query, cb) -> {
            if (name == null)
                return cb.conjunction();
            return cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase() + "%");
        };
    }

    public static Specification<Product> priceGreaterThan(BigDecimal minPrice) {
        return (root, query, cb) -> {
            if (minPrice == null)
                return cb.conjunction();
            return cb.greaterThanOrEqualTo(root.get("price"), minPrice);
        };
    }

    public static Specification<Product> priceLessThan(BigDecimal maxPrice) {
        return (root, query, cb) -> {
            if (maxPrice == null)
                return cb.conjunction();
            return cb.lessThanOrEqualTo(root.get("price"), maxPrice);
        };
    }

}
