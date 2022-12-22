package br.com.banco.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.banco.models.TransactionModel;
import br.com.banco.repositories.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;

	public List<TransactionModel> findTransactions() {
		return transactionRepository.findAll();
	}

	public List<TransactionModel> searchTransactions(String minDate, String maxDate, String name) {

		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

		LocalDate min = minDate.equals("") ? today.minusYears(2000) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

		if (name.equals("")) {
			return transactionRepository.searchTransactionsOutName(min, max);
		}

		return transactionRepository.searchTransactions(min, max, name);
	}

}
