package br.com.banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.banco.models.TransactionModel;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionModel, Integer> {

}
