package ch02.sec01;

import java.util.Scanner;

public class VarEx4 {

	public static void main(String[] args) {
		
		/*
		 * ü����������
		 * �ڽ��� ������(kg)��
		 * Ű�� ����(m)���� ���� ���Դϴ�.
		 * �Է�ȭ��
		 * ----------------------------
		 * ü���������� ���ϴ� ���α׷�
		 * ----------------------------
		 * ����� �����Դ�? 50(�Է�)
		 * ����� Ű��? 160 (�Է�)
		 * ����� ������? (��:true, ��:false) true
		 * -----------------------
		 * ����� ü���� ������? 000.00�Դϴ�.
		 * 
		 * �Ǵ��� �Ͻ� �� �ִ� ��� �غ���
		 * ��ü���Դϴ� �Ǵ� �����Դϴ�, ��ü��,���Դϴ�.
		 * 
		 * ���� �Ǵ��� ����
		 * ��ü�� 18.5 �̸�
		 * ���� 18.5�̻�~23�̸�
		 * ��ü�� 23�̻�~25.0�̸�
		 * �� 25.0 �̻�
		 */
		
		System.out.println("-----------------------------");
		System.out.println("    ü���������� ���ϴ� ���α׷�    ");
		System.out.println("-----------------------------");
		
		//Ű���� �Է� �޴� ��ü Scanner�� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �����Դ�? ");
		double weight =sc.nextDouble(); //�Ǽ�(�Ҽ��� ǥ��)�� double�ƴϸ� float�ε� double�� �⺻�̹Ƿ�..
		
		System.out.print("����� Ű��? ");
		double height = sc.nextDouble(); //���� �� �⺻ int�� ��, ���� �ڸ��� �Ǽ� ġ�� ��������(inputmismatch).
		
		//System.out.print("����� ������ (�� true, �� false) ");
		//boolean gender = sc.nextBoolean();
		
		System.out.println(weight+ " " + height+" ");
		//ü��������
		double bmi=weight/(height*height);
		System.out.println(bmi);
		
	}
}
		
	