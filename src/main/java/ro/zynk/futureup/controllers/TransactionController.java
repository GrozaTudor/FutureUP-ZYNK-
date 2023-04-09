package ro.zynk.futureup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.zynk.futureup.controllers.responses.CoinResponse;
import ro.zynk.futureup.controllers.responses.TransactionResponse;
import ro.zynk.futureup.domain.dtos.Transaction;
import ro.zynk.futureup.services.TransactionService;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping(value = "/all_transactions")
    public List<TransactionResponse> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping (value = "/greater_than_amount")
    public List<TransactionResponse> getAllTransactionsGreaterThan (@RequestParam("amount") Double amount){
        return transactionService.getAllTransactionsGreaterThan(amount);
    }
}
