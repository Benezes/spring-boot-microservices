package com.mnz.product.dto.request;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record ProductRequest(String name, String description, BigDecimal price) {
}
