import java.util.*;
import java.io.*;

public class Calculator{
	int a=100;
	int b=200;
	public void add (int a,int b){
		int c=a+b;
		System.out.println(c);
	}

	public int subt(){
		int c=b-a;
		System.out.println(c);
		return c;
	}

	public void mult(int a, int b){
		int c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args){
		Calculator object = new Calculator();
		int d=object.subt();
		object.add(2,d);
	}

}