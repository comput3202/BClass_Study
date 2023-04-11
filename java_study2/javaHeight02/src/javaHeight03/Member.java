package javaHeight03;

public class Member {
private String name;
private int age;

public Member(String name, int age) {
	
	this.name = name;
	this.age = age;
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

//�̸��� ���� ���̰� ������ �������(���ü)�̶�� ���� ���α׷����� �ۼ��ϱ�
//1�ܰ� hashcode()
//2�ܰ� equals()
//hashcode() ����� equals() ������ ������ �޼ҵ� ȣ������ �ʾƵ� set ��ü�� �˾Ƽ� ���ü �Ϸ��� �ڵ� ȣ���

@Override
public int hashCode() {
	// �����ڰ� �ؽ��ڵ带 ��������
	return name.hashCode()+age;	//���� �ؽ��ڵ���ڿ� ���̸� ���Ѵ�.
}

@Override
public boolean equals(Object obj) { 	//obj �������� 2��°�� set �ȿ� �� �ڷ��� �ּҰ� ����ִ�.
	if(obj instanceof Member) {
		Member target = (Member)obj;	//�ٿ�ĳ����
		return target.name.equals(this.name) && target.age==this.age;
			//target.name�� �� �ڷ��� �̸�, this.name�� ����ִ� �ڷ��� �ּ�
	}
	return false;
}





}