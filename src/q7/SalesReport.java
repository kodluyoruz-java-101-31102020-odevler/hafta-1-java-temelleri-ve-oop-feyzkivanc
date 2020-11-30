package q7;

public class SalesReport extends Report {
	private String [] authorizedDepartments;
	
	
	public SalesReport() {
		
		super();
	}

	public String[] getAuthorizedDepartments() {
		return authorizedDepartments;
	}

	public void setAuthorizedDepartments(String[] authorizedDepartments) {
		this.authorizedDepartments = authorizedDepartments;
	}
	

}
