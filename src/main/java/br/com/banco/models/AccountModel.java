package br.com.banco.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conta")
public class AccountModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_conta")
	private Integer accountId;

	@Column(name = "nome_responsavel")
	private String accountHolder;

	public AccountModel() {

	}

	public AccountModel(Integer accountId, String accountHolder) {
		super();
		this.accountId = accountId;
		this.accountHolder = accountHolder;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

}
