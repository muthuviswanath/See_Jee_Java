package stringmanipulations;

public class Student {
	private int stuID;
	String name;
	int age;
	float percentage;
	public Student(int stuID, String name, int age, float percentage) {
		this.stuID = stuID;
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
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
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
		
	@Override
	public String toString() {
		return String.format("Student[ID= %d, Age = %d, Name = %s, Percentage = %.2f]",
				stuID,age,name,percentage);
	}
	
}
