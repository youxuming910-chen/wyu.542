package ibm.homework.day917;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp {
	public static void main(String[] args) throws IOException {
		Emp emp = new Emp("张三", 25, "男", 5000, new Date());
		System.out.println(emp);

		FileOutputStream fos = new FileOutputStream("C:/string.txt", true);
		String string = emp.toString();
		fos.write(string.getBytes());
		fos.close();

	}

	private String name;
	private int age;
	private String gender;
	private int salary;
	private Date hiredate; // 入职时间

	private static final long serialVersionUID = 1L;

	public Emp(String name, int age, String gender, int salary, Date hiredate) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		String[] strNow1 = new SimpleDateFormat("yyyy-MM-dd").format(hiredate).toString().split("-");
		int year = Integer.parseInt(strNow1[0]); // 获取年
		int month = Integer.parseInt(strNow1[1]); // 获取月
		int day = Integer.parseInt(strNow1[2]); // 获取日
		return "[姓名=" + name + ", 年龄=" + age + ", 性别=" + gender + ", 薪资=" + salary + ", 入职时间=" + year + "-" + month
				+ "-" + day + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (hiredate == null) {
			if (other.hiredate != null)
				return false;
		} else if (!hiredate.equals(other.hiredate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
