package com.ssilvadev.transactionapi.controllers;

import com.ssilvadev.transactionapi.domain.dtos.TransactionDTO;
import com.ssilvadev.transactionapi.domain.entities.Transaction;
import com.ssilvadev.transactionapi.services.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService){
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<Transaction> save(@RequestBody TransactionDTO data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(transactionService
                .save(new TransactionDTO(data)));
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> findById(@PathVariable UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transaction> update(@PathVariable UUID id, @RequestBody TransactionDTO data){
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.update(id, data));
    }
}
