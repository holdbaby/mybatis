package vo;

public class Emp {
	int		empno;
	String 	eName;
	String 	job;
	int 	mgr;
	String 	hireDate;
	int 	sal;
	int 	comm;
	int 	deptno;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	// setter getter method 한 번에 작성 ? alt + shift + s -> r
	
	public int getEmpno() {
		return empno;
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public String geteName() {
		return eName;
	}
	
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public int getMgr() {
		return mgr;
	}
	
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	
	public String getHireDate() {
		return hireDate;
	}
	
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	public int getSal() {
		return sal;
	}
	
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public int getComm() {
		return comm;
	}
	
	public void setComm(int comm) {
		this.comm = comm;
	}
	
	public int getDeptno() {
		return deptno;
	}
	
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}
