package ro.zynk.futureup.controllers.responses;

import ro.zynk.futureup.domain.dtos.Coin;
import ro.zynk.futureup.domain.dtos.Transaction;

import java.util.Date;

public class TransactionResponse extends BaseResponse{
    private Long id;
    private Date transactionDate;
    private Coin coin;
    private Double amount;
    private Double totalValue;

    public TransactionResponse(Transaction transaction) {
        this.id = transaction.getId();
        this.transactionDate = transaction.getTransactionDate();
        this.coin = transaction.getCoin();
        this.amount = transaction.getAmount();
        this.totalValue = transaction.getTotalValue();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
}
