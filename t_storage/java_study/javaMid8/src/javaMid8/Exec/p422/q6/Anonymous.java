package javaMid8.Exec.p422.q6;

public class Anonymous {

	Vehicle field = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("�ڵ����� �޸��ϴ�.");
		}
	};

	public void method1() {
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
				
			}
		};
		
		localVar.run();
		
	}

	public void method2(Vehicle v) {
		v.run();
	}
}