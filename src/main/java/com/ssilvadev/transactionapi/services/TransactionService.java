package com.ssilvadev.transactionapi.services;

import com.ssilvadev.transactionapi.domain.dtos.TransactionDTO;
import com.ssilvadev.transactionapi.domain.entities.Transaction;
import com.ssilvadev.transactionapi.repositories.TransactionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction save(TransactionDTO transactionDTO) {
        Transaction transaction = new Transaction();
        BeanUtils.copyProperties(transactionDTO, transaction);

        return transactionRepository.save(transaction);
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
