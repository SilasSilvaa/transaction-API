package com.ssilvadev.transactionapi.services;

import com.ssilvadev.transactionapi.domain.dtos.TransactionDTO;
import com.ssilvadev.transactionapi.domain.entities.Transaction;

import java.util.List;
import java.util.UUID;

public interface ITransactionService {
    Transaction save(TransactionDTO transactionDTO);
    List<Transaction> findAll();
    Transaction findById(UUID id);
    Transaction update(UUID id, TransactionDTO transactionDTO);
}
