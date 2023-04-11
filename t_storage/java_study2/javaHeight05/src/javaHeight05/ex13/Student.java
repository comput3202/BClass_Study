package javaHeight05.ex13;

public class Student {
    private int studentNum;
    private String name;
    
     
	@Override
	public int hashCode() {
		return studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Student) {
			Student s = (Student) obj; //�ٿ� ĳ����
			 return studentNum == s.studentNum;
		}else return  false;
	}
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		studentNum = studentNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
}