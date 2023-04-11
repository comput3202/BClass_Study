package javaHeight03.p652;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx652 {

	public static void main(String[] args) {
		
		Set<Shop> shopSet = new HashSet<Shop>();
		shopSet.add( new Shop( "�̱��", "1234", 100));
		shopSet.add( new Shop( "���ູ", "2345", 90));
		shopSet.add( new Shop( "�ڼ���", "1467", 300));
		shopSet.add( new Shop( "�����", "1234", 100));
		shopSet.add( new Shop( "�ֱ��", "1234", 100));
		shopSet.add( new Shop( "�̱��", "1234", 300));
		shopSet.add( new Shop( "�̱��", "1234", 200));
		
		//��ü ����ϱ�
		//���ü�� ��ȭ��ȣ�� ���� �̸��� ������ ���ü�� �Ǵ� �մϴ�. 
		
		 System.out.println("set�ȿ� ��� �ִ� ��Ҵ�? " + shopSet.size());
	     Iterator<Shop> it3 = shopSet.iterator();
	     while( it3.hasNext() ) {
	        	Shop shopAddr = it3.next();
	        	System.out.println( shopAddr.getCustname() + " " +  shopAddr.getCustPhone() + " " + shopAddr.getPoint() );
	    }
	     
	    //�̸��� ��ȭ��ȣ�� �Է��ϸ� �����ͳ����� 
	     String searchName="���ູ";
	     String searchPhone="5555";
	     // 90�� ��µǰ� ����� ������
	     it3 = shopSet.iterator();
	     boolean searchOk = false;
	     while( it3.hasNext() ) {
	    	 Shop shopAddr = it3.next();
	    	 if( shopAddr.getCustname().equals(searchName) && shopAddr.getCustPhone().equals(searchPhone)) {
	    		 System.out.println( shopAddr.getPoint());
	    		 searchOk = true;
	    		 break;
	    	 }
	     }
	     if ( !searchOk ) System.out.println( searchName + "�� " + searchPhone + " ������ �����ϴ�.");
	     
	    System.out.println("-----------------");
		
		Set<Member> memberSet = new HashSet<Member>();
        memberSet.add( new Member("ȫ�浿", 30));
        memberSet.add( new Member("�̼���", 25));
        memberSet.add(new Member("�ֱ��", 10));
        memberSet.add( new Member("ȫ�浿", 30));
        memberSet.add( new Member("�̼���", 35));
        memberSet.add( new Member("�̼���", 25));
        
        System.out.println("set�ȿ� ��� �ִ� ��Ҵ�? " + memberSet.size());
        Iterator<Member> it = memberSet.iterator();
        while( it.hasNext() ) {
        	Member memberAddr = it.next();
        	System.out.println( memberAddr.getName() + " " +  memberAddr.getAge() );
        }
        
        //������ 15, ������ 10, �䳢 7, �� 3
        Set<Animal> aniSet = new HashSet<Animal>();
        aniSet.add(new Animal("������", 15));
        aniSet.add(new Animal("������", 10));
        aniSet.add(new Animal("�䳢", 7));
        aniSet.add(new Animal("��",3));
        aniSet.add(new Animal("������", 15));
        aniSet.add(new Animal("������", 15));
        
        Iterator<Animal> it2=aniSet.iterator();
        while( it2.hasNext() ) {
        	Animal aniAddr = it2.next();
        	System.out.println( aniAddr.getKind() + "  " + aniAddr.getLifeSpan() );
        }
	}

}