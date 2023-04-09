package ro.zynk.futureup.domain.dtos;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transactions",  uniqueConstraints = {@UniqueConstraint(columnNames = {"coin_id"})})
public class Transaction extends BaseEntity {

    @Column
    private Date transactionDate;

    @ManyToOne
    @JoinColumn(name = "coin_id")
    private Coin coin;

    @Column
    private Double amount;

    @Column
    private Double totalValue;

    public Transaction() {
    }

    public Transaction(Coin coin, Double amount, Double totalValue) {
        this.transactionDate = new Date();
        this.coin = coin;
        this.amount = amount;
        this.totalValue = totalValue;
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
