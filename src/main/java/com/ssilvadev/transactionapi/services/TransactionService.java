package com.ssilvadev.transactionapi.services;

import com.ssilvadev.transactionapi.domain.dtos.TransactionDTO;
import com.ssilvadev.transactionapi.domain.entities.Transaction;
import com.ssilvadev.transactionapi.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class TransactionService implements ITransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction save(TransactionDTO transactionDTO) {
        return null;
    }

    @Override
    public List<Transaction> findAll() {
        return List.of();
    }

    @Override
    public Transaction findById(UUID id) {
        return null;
    }

    @Override
    public Transaction update(UUID id, TransactionDTO transactionDTO) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
