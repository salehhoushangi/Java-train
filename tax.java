
public class tax {
	/*public static int salary;*/
	private static int y = 200000;
	public static void  taxes(int salary) {
	 int a1 = (salary-y);
	
	if (salary<200000) {
		System.out.print("You are exempt from taxes");
		System.out.print("Your pure salary is:" + salary);
	}
	else if (salary>200000 && salary<300000) {
			int a2 = a1*7;
			int a3 = a2/100;
			int a4= salary-a3;
			System.out.println("your dues is 7% and your salary after decline tax is:" + a4);
	}
	else {
		int a2 = a1*12;
		int a3 = a2/100;
		int a4= salary-a3;
		System.out.println("your dues is 12% and your salary after decline tax is:" + a4);
	}
	}

public static void main(String[] args) {
	
	tax t1 =new tax();
	t1.taxes(250000);
}
}
