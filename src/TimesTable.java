
public class TimesTable {

	private int n;
	private int m;
	
	public TimesTable(int n, int m) {
		this.n = n;
		this.m = m;
	}
	
	public TimesTable() {
	}
	
	public TimesTable setNumber(int n) {
		this.n = n;
		return this;
	}
	
	public TimesTable setMax(int m) {
		this.m = m;
		return this;
	}
	
	@Override
	public String toString() {
		String table = n + " times table \n";
		
		for(int i = 1; i <= m; i++) {
			int j = n * i;
			table += n + " x " + i + " = " + j + System.lineSeparator();
		}
		
		return table;
	}
	
}
