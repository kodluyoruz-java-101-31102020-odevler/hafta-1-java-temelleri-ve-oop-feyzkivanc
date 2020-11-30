package q7;

import java.sql.Date;

public class Report {

	protected String name;
	protected  String result;
	protected Date createDate;
	
	public Report() {
		this.name="name";
		this.result="result";
		this.createDate= null;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
