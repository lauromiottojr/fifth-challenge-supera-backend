package br.com.banco.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.models.TransactionModel;
import br.com.banco.services.TransactionService;

@RestController
@RequestMapping(value = "/transactions")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@CrossOrigin(origins = "*")
	@GetMapping
	public List<TransactionModel> findTransactions() {
		return transactionService.findTransactions();
	}

	@CrossOrigin(origins = "*")
	@GetMapping(value = "/search")
	public List<TransactionModel> SearchTransactions(@RequestParam(value = "minDate", defaultValue = "") String minDate,
			@RequestParam(value = "maxDate", defaultValue = "") String maxDate,
			@RequestParam(value = "name", defaultValue = "") String name) {
		return transactionService.searchTransactions(minDate, maxDate, name);
	}

}
