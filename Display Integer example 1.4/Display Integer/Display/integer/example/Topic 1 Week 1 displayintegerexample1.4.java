/*
 (Print a table) Write a program that displays the following table:
 a		a^2		a^3
 1		1		1
 2		4		8
 3		9		27
 4		16		64
 */
package Display.integer.example;

public class displayintegerexample14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b;
		System.out.println("a        b        pow(a, b)");
		a = 1;
		b = 2;
		System.out.println((int)a + "        " + (int)b + 
			"        " + (int)Math.pow(a, b));
		a++;
		b++;
		System.out.println((int)a + "        " + (int)b + 
			"        " + (int)Math.pow(a, b));
		a++;
		b++;
		System.out.println((int)a + "        " + (int)b + 
			"        " + (int)Math.pow(a, b));
		a++;
		b++;
		System.out.println((int)a + "        " + (int)b + 
			"        " + (int)Math.pow(a, b));
		a++;
		b++;
		System.out.println((int)a + "        " + (int)b + 
"        " + (int)Math.pow(a, b));
	}

}
