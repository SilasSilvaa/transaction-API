package com.ssilvadev.transactionapi.repositories;

import com.ssilvadev.transactionapi.domain.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
