package javaHeight03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		//
		//set ������ �ֱ�
		Set<String> set2=new HashSet();
		set2.add("���");
		set2.add("��");
		set2.add("�ٳ���");
		set2.add("��");
		set2.add("��"); //�߸�� ���� �ȹ���.������ 4, �赵 �ѹ��� ����
		set2.add("��");
		
		//��ü���
		Iterator<String> it2=set2.iterator();		//������ �����Ƿ� ���ͷ����ͷ� ����ؾ���, ���� ������ �ٸ��� ����
		while(it2.hasNext()) {			
			String fruit=it2.next();
			System.out.println(fruit);
		}
		
		//ũ��
		System.out.println("ũ�� "+set2.size());
		
		//���� �ִ��� �˻�
		if(set2.contains("����")) System.out.println("���� ����");
		else System.out.println("���� ����");

	}

}