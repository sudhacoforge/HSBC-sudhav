package Customer.module;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
    private	long cid;
	private String custname;
	private String custaddress;
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustAddress() {
		return custaddress;
	}
	public void setCustAddress(String custaddress) {
		this.custaddress = custaddress;
	}

}
