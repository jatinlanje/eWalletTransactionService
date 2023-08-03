package com.jatin.ewallet.transaction.service;

import com.jatin.ewallet.transaction.domain.Transaction;
import com.jatin.ewallet.transaction.service.resource.TransactionMessage;

public interface TransactionService {

    void createTransaction(Transaction transaction);

    void updateTransaction(TransactionMessage message);
}
