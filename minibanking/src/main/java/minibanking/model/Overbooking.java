package minibanking.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;

@Entity
@Table(name = "overbooking")
public class Overbooking {
	private Integer transactionId;
	private Date transactionDate;
	private BigDecimal amount;
	private Account fromAccount;
	private Account toAccount;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", unique = true, nullable = false)
	public Integer getTransactionId() {
		return transactionId;
	}
	
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	
    @Column(name = "transaction_date")
	public Date getTransactionDate() {
		return transactionDate;
	}
    
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	@ManyToOne
    @JoinColumn(name = "to_account")
	@JsonIgnore
	public Account getToAccount() {
		return toAccount;
	}
    
	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "account_no")
	public Account getFromAccount() {
		return fromAccount;
	}
	
	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}
	
    @Column(name = "amount")
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
}
