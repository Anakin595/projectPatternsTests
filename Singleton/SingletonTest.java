package singletonPackage;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton2 s3 = Singleton2.instance;
		Singleton2 s4 = Singleton2.instance;
		
		
		s1.name = "pierwszy";
		s2.name = "drugi";
		s3.name = "trzeci";
		s4.name = "czwarty";	
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s3.name);
		System.out.println(s4.name);
	}

}
