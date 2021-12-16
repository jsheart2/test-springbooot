package minibanking.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	private Integer customerId;
	private String accountNo;
	private BigDecimal balance;
	private List<Overbooking> Overbooking;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id", unique = true, nullable = false)
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
    @Column(name = "account_no")
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
    @Column(name="balance")
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	@OneToMany(mappedBy = "toAccount", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List<Overbooking> getOverBooking() {
		return Overbooking;
	}
	public void setOverBooking(List<Overbooking> Overbooking) {
		this.Overbooking = Overbooking;
	}
	
}
