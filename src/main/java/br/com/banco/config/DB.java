package br.com.banco.config;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import br.com.banco.models.AccountModel;
import br.com.banco.models.TransactionModel;
import br.com.banco.repositories.AccountRepository;
import br.com.banco.repositories.TransactionRepository;

@Configuration
public class DB {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private TransactionRepository transactionRepository;

	@Bean
	@Primary
	public void instantiateTestDatabase() throws ParseException {

		AccountModel acc1 = new AccountModel(1, "Fulano");
		AccountModel acc2 = new AccountModel(2, "Sicrano");

		accountRepository.saveAll(Arrays.asList(acc1, acc2));

		TransactionModel t1 = new TransactionModel(1, LocalDate.parse("2019-01-01"), 30895.46, "DEPOSITO", null, acc1);
		TransactionModel t2 = new TransactionModel(2, LocalDate.parse("2019-02-03"), 12.24, "DEPOSITO", null, acc2);
		TransactionModel t3 = new TransactionModel(3, LocalDate.parse("2019-05-04"), -500.50, "SAQUE", null, acc1);
		TransactionModel t4 = new TransactionModel(4, LocalDate.parse("2019-08-07"), -530.50, "SAQUE", null, acc2);
		TransactionModel t5 = new TransactionModel(5, LocalDate.parse("2020-06-08"), 3241.23, "TRANSFERENCIA",
				"Beltrano", acc1);
		TransactionModel t6 = new TransactionModel(6, LocalDate.parse("2021-04-01"), 25173.09, "TRANSFERENCIA",
				"Ronnyscley", acc2);

		transactionRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6));
	}

}
