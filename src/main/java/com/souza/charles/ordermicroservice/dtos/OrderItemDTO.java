package com.souza.charles.ordermicroservice.dtos;

import java.math.BigDecimal;

public record OrderItemDTO(String product, Integer quantidade, BigDecimal preco) {
}
