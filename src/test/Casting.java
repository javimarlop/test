package test;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cualquier cosa a String
		int i = 1;
		String s1 = ""+i; //forzando a que se convierta
		String s2 = String.valueOf(i); // forma correcta
		
		String n1 = "12";
		int i1 = new Integer(n1);
		int i2 = Integer.parseInt(n1);
		System.out.println(i2);
		

		
	}

}
