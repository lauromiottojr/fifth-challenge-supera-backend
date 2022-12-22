package br.com.banco.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.banco.models.TransactionModel;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionModel, Integer> {

	@Query("SELECT obj FROM TransactionModel obj WHERE obj.transactionDate BETWEEN :min AND :max AND obj.transactionToName = :name")
	List<TransactionModel> searchTransactions(LocalDate min, LocalDate max, String name);

	@Query("SELECT obj FROM TransactionModel obj WHERE obj.transactionDate BETWEEN :min AND :max")
	List<TransactionModel> searchTransactionsOutName(LocalDate min, LocalDate max);

	// @Query("SELECT SUM(transactionAmount) FROM TransactionModel")
	// Double totalAmount();

}
