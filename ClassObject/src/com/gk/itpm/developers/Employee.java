package com.gk.itpm.developers;

public class Employee {

	String name;

	String gender;

	String birthday;

	int age;

	int employeeID;

	String entriedDate;

	String team;

	//ここからゲッターセッターを用意
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEntriedDate() {
		return entriedDate;
	}

	public void setEntriedDate(String entriedDate) {
		this.entriedDate = entriedDate;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	//コンストラクタ
	public Employee(String name, String gender, String birthday,
			int age, int employeeID, String entriedDate, String team) {
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.age = age;
		this.employeeID = employeeID;
		this.entriedDate = entriedDate;
		this.team = team;
	}

}
