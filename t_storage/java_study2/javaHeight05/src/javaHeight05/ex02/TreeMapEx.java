package javaHeight05.ex02;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// 670
      TreeMap<String, Integer> treeMap = new TreeMap< String, Integer>(); 
      treeMap.put("apple", 10);
      treeMap.put("forever", 60);
      treeMap.put("description", 40);
      treeMap.put("ever", 50);
      treeMap.put("zoo", 80);
      treeMap.put("base", 20);
      treeMap.put("guess", 70);
      treeMap.put("cherry", 30);
      
      Set< Entry<String,Integer> > entrySet =  treeMap.entrySet();
      Iterator< Entry<String, Integer>   > it = entrySet.iterator();
      while( it.hasNext() ) {
    	  Entry<String, Integer> i = it.next();
    	  System.out.println(  i.getKey() + " " + i.getValue() );
      }
      
      //Ư�� Ű�� ���� �� ��������
      Entry<String, Integer> entry = null;
      entry = treeMap.firstEntry();
      System.out.println("���� �� �ܾ� " + entry.getKey() + " - " + entry.getValue() );
      entry = treeMap.lastEntry();
      System.out.println("���� �� �ܾ� " + entry.getKey() + " - " + entry.getValue() );
      entry = treeMap.lowerEntry("ever");
      System.out.println("ever�� �մܾ� " + entry.getKey() + " - " + entry.getValue() );
      entry = treeMap.higherEntry("ever");
      System.out.println("ever�� �ڴܾ� " + entry.getKey() + " - " + entry.getValue() );
      
      //������������ ����
      NavigableMap<String, Integer> dM =treeMap.descendingMap();
      Set<  Entry<String, Integer> > des=dM.entrySet();
      for( Entry<String, Integer> d  : des) {
    	  System.out.println( d.getKey() + " - " + d.getValue() );
      }
      
      System.out.println( "-------------------- ");
      //�������� ����
      NavigableSet<String> ns = treeMap.descendingKeySet();
      for(String  n : ns) {
    	  System.out.println( n + "-" + treeMap.get(n));
      }
      
      //c~h������ �ܾ� �˻��ϱ�
      System.out.println(" c~h���� �ܾ��? ");
      NavigableMap<String, Integer> sm = treeMap.subMap("c", true, "h", true);
      for(Entry<String, Integer>  e : sm.entrySet()) {
    	  System.out.println(e.getKey() + " - " + e.getValue() );
      }
	}
}






