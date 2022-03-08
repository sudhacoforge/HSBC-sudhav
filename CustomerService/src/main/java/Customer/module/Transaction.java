package Customer.module;

public class Transaction {
	
	
	public int transid;
	public String trntype;
	public String tranAmt;
	public String date;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getTransid() {
		return transid;
	}
	public void setTransid(int transid) {
		this.transid = transid;
	}
	public String getTrntype() {
		return trntype;
	}
	public void setTrntype(String trntype) {
		this.trntype = trntype;
	}
	public String getTranAmt() {
		return tranAmt;
	}
	public void setTranAmt(String tranAmt) {
		this.tranAmt = tranAmt;
	}
	
	

}
