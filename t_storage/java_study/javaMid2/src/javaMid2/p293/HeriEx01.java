package javaMid2.p293;

public class HeriEx01 {
   public static void main(String[] args) {
	   Animal animal = new Animal();
	   animal.setFood("�Դ� ��");
	   animal.setSound("������ �Ҹ�");
	   animal.printAll();
	   
	   Dog dog = new Dog();
	   dog.setFood("���������");
	   dog.setSound("�۸۸�");
	   dog.setCharacteristic("������ �� ������");
	   
	   System.out.println();
	   dog.printAll(); //�ڽ� �θ�޼ҵ� ȣ�� ���
	   
	   
  }  
}