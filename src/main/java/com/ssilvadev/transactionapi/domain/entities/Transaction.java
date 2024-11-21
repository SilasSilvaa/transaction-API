package com.ssilvadev.transactionapi.domain.entities;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID transactionId;
}
