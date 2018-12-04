import java.util.Date;
import java.util.Objects;

public class Transaction {

	private Date creationDate;

	private double amount;

	private String fromAccount;

	private String toAccount;

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
//
//	@Override
//	public boolean equals(Object o) {
//		if (this == o) {
//			return true;
//		}
//		if (o == null || getClass() != o.getClass()) {
//			return false;
//		}
//		Transaction that = (Transaction) o;
//		return Double.compare(that.amount, amount) == 0 && Objects.equals(creationDate, that.creationDate)
//				&& Objects.equals(fromAccount, that.fromAccount) && Objects.equals(toAccount, that.toAccount);
//	}

	@Override
	public int hashCode() {

		return Objects.hash(creationDate, amount, fromAccount, toAccount);
	}

}
