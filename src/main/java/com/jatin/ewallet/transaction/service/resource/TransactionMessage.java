package com.jatin.ewallet.transaction.service.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionMessage {

    private Long senderId;
    private Long receiverId;
    private Double amount;
    private String status;
    private String transactionId;


}
