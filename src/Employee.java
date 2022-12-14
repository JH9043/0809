
public class Employee {
	private String empno;
	private int base, night, family;
	private String name, dname, hopay, fampay, nightpay, total, salary;

	public Employee(String empno, String name, int base, int night, int family) {
		this.empno = empno;
		this.base = base;
		this.night = night;
		this.family = family;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("%-5s%5s%5s%5d%10d%7d%7d%10d%10d", empno, name, dname, base, hopay, fampay, nightpay,
				total, salary);
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getNight() {
		return night;
	}

	public void setNight(int night) {
		this.night = night;
	}

	public int getFamily() {
		return family;
	}

	public void setFamily(int family) {
		this.family = family;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getHopay() {
		return hopay;
	}

	public void setHopay(String hopay) {
		this.hopay = hopay;
	}

	public String getFampay() {
		return fampay;
	}

	public void setFampay(String fampay) {
		this.fampay = fampay;
	}

	public String getNightpay() {
		return nightpay;
	}

	public void setNightpay(String nightpay) {
		this.nightpay = nightpay;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
}
