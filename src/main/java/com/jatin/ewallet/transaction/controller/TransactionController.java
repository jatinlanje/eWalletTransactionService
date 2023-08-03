package com.jatin.ewallet.transaction.controller;

import com.jatin.ewallet.transaction.service.TransactionService;
import com.jatin.ewallet.transaction.service.resource.TransactionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/transfer")
    public ResponseEntity<?> performTransfer(@RequestBody TransactionRequest transactionRequest){
        transactionService.createTransaction(transactionRequest.toTransaction());
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }
}
