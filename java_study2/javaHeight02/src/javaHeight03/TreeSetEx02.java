package javaHeight03;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx02 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.add(350);
		ts.add(215);
		ts.add(220);
		ts.add(270);
		ts.add(275);
		
		
		
		System.out.println("���� ���� �⺻����?");
		System.out.println(ts.last());
		System.out.println("���� ���� �⺻����?");
		System.out.println(ts.first());
		System.out.println("�⺻�� ��������");	//�׳� ��ü����ϸ� ������������ ���´�
		for(Integer s : ts) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("�⺻�� ��������");
		Iterator<Integer> dit=ts.descendingIterator();
		while(dit.hasNext()) {
			System.out.print(dit.next()+" ");
			
			System.out.println();
	
			System.out.println("250~350������ �⺻�� ��� ���");
			NavigableSet<Integer> ns=ts.subSet(250,true,350,true);
			for(Integer n:ns) {
				System.out.print(n+" ");
			}
			
			//Tree �ȿ� ���� �ֱ�
			
			
			
			
			
		}

	}

}