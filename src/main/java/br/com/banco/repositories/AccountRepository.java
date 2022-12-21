package br.com.banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.banco.models.AccountModel;

@Repository
public interface AccountRepository extends JpaRepository<AccountModel, Integer> {

}
