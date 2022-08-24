package baseClassPackage;

import java.util.Scanner;

public class modify {

	public static void main(String[] args) 
	{byte id=21;//two digit can stored
	short id1=3432;//4 digit can stored
	int id2=939292929;//9 digit can store
	long id3=5347857674675l;//upto 19 digit can stored and end with 'l'
	float id4=2343.3223332f;//upto 7 digit after decimal point
	double id5=3243.23423424;//upto 15 digit after deciaml
	char x='4';//in charactor single value can be stored
	String text="all numbers and symbols and also a alphapets";
	boolean condition=true;//only on true r false
	
	System.out.println("id:"+id);
		System.out.println("id1:"+id1);
		System.out.println("id1:"+id2);
		System.out.println("id1:"+id3);
		System.out.println("id1:"+id4);
		System.out.println("id1:"+id5);
		System.out.println("id1:"+x);
		System.out.println("id1:"+text);
		System.out.println("id1:"+condition);
		Scanner name = new Scanner(System.in);
		id=name.nextByte();
		System.out.println("id:"+id);
		
		id2=name.nextInt();
		System.out.println("id1:"+id2);
	}
}
