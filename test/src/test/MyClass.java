package test;

public class MyClass {
	
	char nombre;
	//public int myvar = 67;
	static int i = 0;
	//i++;
	static int j = ++i;
	static int j2 = i++;
	static int k = ++i;
	static int k2 = i++;
	String[] nombres = new String[10];
	static String minombre = "Javier";
	static String[] diasSemana = {"Lunes","Martes"};
	
	public static void main(String[] args){
		
		String minombre2 = "Javierr";
		
		System.out.println(diasSemana[0]);
		System.out.println(diasSemana.length);
		System.out.println(minombre);
		System.out.println(minombre2);
		System.out.println(j);
		System.out.println(j2);
		System.out.println(k);
		System.out.println(k2);
		System.out.println(i);
		System.out.println(++i);
		//System.out.println(myvar);
	}
	
}
