package br.com.banco.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transferencia")
public class TransactionModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer transactionId;

	@Column(name = "data_transferencia")
	private LocalDate transactionDate;

	@Column(name = "valor")
	private Double transactionAmount;

	@Column(name = "tipo")
	private String transactionType;

	@Column(name = "nome_operador_transacao")
	private String transactionToName;

	@Column(name = "conta_id")
	private AccountModel transactionAccount;

	public TransactionModel() {

	}

	public TransactionModel(Integer transactionId, LocalDate transactionDate, Double transactionAmount,
			String transactionType, String transactionToName, AccountModel transactionAccount) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.transactionType = transactionType;
		this.transactionToName = transactionToName;
		this.transactionAccount = transactionAccount;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionToName() {
		return transactionToName;
	}

	public void setTransactionToName(String transactionToName) {
		this.transactionToName = transactionToName;
	}

	public AccountModel getTransactionAccount() {
		return transactionAccount;
	}

	public void setTransactionAccount(AccountModel transactionAccount) {
		this.transactionAccount = transactionAccount;
	}

}
