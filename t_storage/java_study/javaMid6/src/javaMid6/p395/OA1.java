package javaMid6.p395;

public class OA1 {
    int a=10;
    static int sa=20;
    
    void m1() {
    	a=a+20;
    	sa = sa + 10;
    }
    static void sm1() { 
    	//a = a+ 20; ��� ����
    	sa = sa + 10;
    }
    
    public OA1() {
		a=a+10;
		sa = sa+20;
		m1();
		sm1();
	}
    
   class IA{
    	int iaa=20;
    	//static int isa = 20; (X)
    	
    	void iaaM() {
    		a = a+20;
    		sa = sa + 10;
    		m1();
    		sm1();
    	}
    	
    	//static void isaM() {
    		
    	// }  (X)
    }
    
    
    
    
}
