package javaHeight03.p675;

import java.util.TreeSet;

public class BusEx {

	public static void main(String[] args) {
		
			
			TreeSet<Bus> bus=new TreeSet<Bus>(new BusComparator());
			
			bus.add(new Bus("�溹��",6));
			bus.add(new Bus("��ȭ��",3));
			bus.add(new Bus("û��õ",4));
			bus.add(new Bus("�λ絿",5));
			
			for(Bus b1 : bus) {
				System.out.println(b1.getDe()+":"+b1.getStop());
		}

	}

}
