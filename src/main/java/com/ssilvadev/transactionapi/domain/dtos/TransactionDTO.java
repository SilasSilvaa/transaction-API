package com.ssilvadev.transactionapi.domain.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionDTO(
        BigDecimal total,
        LocalDateTime created,
        String cardNumber,
        String cvv,
        String owner,
        String ein) {
    public TransactionDTO(TransactionDTO data) {
        this(data.total(), data.created(), data.cardNumber(), data.cvv(), data.owner(), data.ein());
    }
}

