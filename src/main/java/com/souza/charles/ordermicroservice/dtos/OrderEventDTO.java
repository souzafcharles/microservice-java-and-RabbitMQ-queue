package com.souza.charles.ordermicroservice.dtos;

import java.util.List;

public record OrderEventDTO(Long codigoPedido, Long codigoCliente, List<OrderItemDTO> itens) {
}