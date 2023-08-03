package com.jatin.ewallet.transaction.repository;

import com.jatin.ewallet.transaction.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {

    Optional<Transaction> findByTransactionId(String id);
}
