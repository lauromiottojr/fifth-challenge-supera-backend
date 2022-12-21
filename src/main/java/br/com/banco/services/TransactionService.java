package br.com.banco.services;

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

		// LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

		// LocalDate min = minDate.equals("") ? today.minusYears(1) :
		// LocalDate.parse(minDate);
		// LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

		// return saleRepository.findSales(min, max, pageable);
		return transactionRepository.findAll();
	}

}
