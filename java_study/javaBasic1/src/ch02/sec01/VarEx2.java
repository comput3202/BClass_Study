package ch02.sec01;

import java.util.Scanner;

public class VarEx2 {

	public static void main(String[] args) {
	
		//�빮�� K�� ������ �ֱ�
		//�ҹ��� S ���
		
		char kWord='K'; //75
		System.out.println( (char) (kWord + 40 )) ; //115
		
		char name1='��';
		char name2='��';
		char name3='��';
		System.out.println((int) (name1) + " " + (int) (name2) + " " + (int) (name3) + " " );
		
		String name = "������"; //9����Ʈ(3*3)
		
		String hakbun = "221208"; //���ڿ�->���������� �ٲٱ� string�� ���ڿ�
		//Q. ���� �й��� ���� ����� �й��� ���Ͻ�ȣ(221209)
		System.out.println(Integer.valueOf(hakbun) + 1 );
		
		String avgS = "52.2"; //52.2 + 100 = 152.2
		//���ڿ��� ��� �ȵǴϱ� ���ڿ��� �Ǽ������� �ٲ�� �Ѵ�
		//�׸��� 100�� ���ؼ� ��� �Ѵ�
		System.out.println(Float.valueOf(avgS) + 100);
		
		
		float convAvg=Float.parseFloat(avgS);//"52.2"->52.2
		convAvg = convAvg + 100;
		System.out.println(convAvg);
		
		double convAvg1 = Double.parseDouble(avgS);
		convAvg1 = convAvg1 + 100;
		System.out.println(convAvg1+"~");		
		
		String ����="false"; //"true"->true
		Boolean.parseBoolean(����);
		System.out.println(����);
		
	
		boolean ��ȯ�Ѽ��� = Boolean.parseBoolean(����); //parse : �ٲ��
		System.out.println(��ȯ�Ѽ���);
		if(��ȯ�Ѽ���)
			System.out.println("����");
		else
			System.out.println("����");
		
		int hakbun1 = 221208;//���ڿ� ������ ��ȯ �ڹ� : int ���
		System.out.println("���� ����� �й���" + (hakbun1+1));
		
		
		//�ڵ�Ÿ�Ժ�ȯ
		byte v1=10; //1byte
		int v2=20; //4byte
		
		v2 = v1; //�ڿ� �ִ� ���� ������ ��. v2 = 10 �� �ȴ�. byte���� ���� int������ ����.(����x)
		
		//������ ��ȯ
		v1 =(byte) v2; //v2�� ���� v1�� �ִ´�. �� int���� byte������ ����. ū ���� ���� ������ �� -> ����
		
		int v3=50; //������
		double v4 = 10.0; //�Ǽ���, double�� 8����Ʈ, �Ҽ��� ���� 32����, �⺻
		float v5=20.5f; //�Ǽ���, float�� ���� �ڿ� f �ٿ����Ѵ�. float��� ��, float 4����Ʈ, �Ҽ��� ���� 8�ڸ����� ����
		
		v4=v3;
		v4=v5;
		v3= (int) v4; //
		v3=(int) v5; //
		v5=(float) v4; //
		
		//���� ���� 2���� �Է¹޾Ƽ� ��Ģ�����غ�����
		Scanner sc = new Scanner(System.in); //Ű���� �Է��� ����ϴ� ��ĳ�� Ŭ������ ����Ѵ�.
		
//		int x = sc.nextInt(); //Ű���忡�� ������ �Է� �޴´�.
//		System.out.println("�Է°� " + x);
//		
//		int y = sc.nextInt(); 
//		System.out.println("�Է°� " + y);
//		
//		//double������ �Ǽ� 2���� �Է� ��������
//		double z = sc.nextDouble();
//		System.out.println("�Է°� " + z);
//		
//		double k = sc.nextDouble();
//		System.out.println("�Է°� " + k);
//		
//		
//		//boolean�� 2���� �Է¹�������
//		boolean t = sc.nextBoolean();
//		System.out.println("�Է°� " + t);
//		
//		boolean f = sc.nextBoolean();
//		System.out.println("�Է°� " + f);
		
		//���ڿ��� 2���� �Է¹������� �Է��� "�ڹ�" "����ִ�" �� ���ݴϴ�.
		String str3 = sc.nextLine();
		System.out.println("������1=>" + str3);
				
		String str4 = sc.nextLine();
		System.out.println("������2=>" + str4);
		//nextLine() : �Է¹ް� ������ ������. �Ǵ� next()�� ����ϼ���
		
		
		
	}

}