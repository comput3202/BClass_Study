package javaHeight02.p645;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx05 {

	public static void main(String[] args) {
		List<Student> vlist=new Vector<>();//������ ���α׷����� �̿�Ǵ� ArrayList�� ������ �÷���
		
		vlist.add(new Student("ȫ�浿1", 100));
		vlist.add(new Student("ȫ�浿2", 90));
		vlist.add(new Student("ȫ�浿3", 110));
		vlist.add(new Student("ȫ�浿4", 80));
		 
		Iterator<Student> it=vlist.iterator();
	
		while(it.hasNext()) {
			Student st=it.next();
			System.out.println(st);
		}
		
		//2�� �ε����� �����ϱ�
		
		vlist.remove(2);
		
		it=vlist.iterator();//
		System.out.println("delete num2");
		while(it.hasNext()) {
			Student st=it.next();
			System.out.println(st);
		}
		
		boolean isE=vlist.isEmpty();
		if(isE) {
			System.out.println("nothing");
		}else {
			System.out.println("here");
		}
		
		
		
	}

}