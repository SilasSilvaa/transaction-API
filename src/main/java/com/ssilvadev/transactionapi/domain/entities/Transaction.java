package com.ssilvadev.transactionapi.domain.entities;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "transactions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID transactionId;

    private BigDecimal total;
    private LocalDateTime created;
    private String cardNumber;
    private String cvv;
    private String owner;
    private String ein;
}
