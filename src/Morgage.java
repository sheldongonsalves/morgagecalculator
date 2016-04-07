
public class Morgage {

	int months;
	int principal;
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	public int getPrincipal() {
		return principal;
	}
	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	public Morgage() {
		// TODO Auto-generated constructor stub
	}
	public Morgage(int principalamt ,int monthsentered) {
		this.principal=principalamt;
		this.months=monthsentered;
	}

}
