package com.ssilvadev.transactionapi.services;

import com.ssilvadev.transactionapi.domain.dtos.TransactionDTO;
import com.ssilvadev.transactionapi.domain.entities.Transaction;
import com.ssilvadev.transactionapi.repositories.TransactionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TransactionService implements ITransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction save(TransactionDTO transactionDTO) {
        Transaction transaction = new Transaction();

        BeanUtils.copyProperties(transactionDTO, transaction);

        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction findById(UUID id) {
        Optional<Transaction> transaction = transactionRepository.findById(id);

        if(transaction.isEmpty()){
            throw new RuntimeException("Transaction not found");
        }

        return transaction.get();
    }

    @Override
    public Transaction update(UUID id, TransactionDTO transactionDTO) {
        Optional<Transaction> transaction =  transactionRepository.findById(id);

        if(transaction.isEmpty()){
            throw new RuntimeException("Transaction not found");
        }

        BeanUtils.copyProperties(transactionDTO, transaction.get());

        return transactionRepository.save(transaction.get());
    }

}
