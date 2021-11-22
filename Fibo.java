package java_programs;

import java.util.Iterator;

public class Fibo {

	public static void main(String[] args) {
int num=10;
int firstNum=0;
int secondNum=1;
int sum;
if (num>=2) {
	System.out.println(firstNum);
	System.out.println(secondNum);
}
for (int i = 0; i < num; i++) {
	sum=firstNum+secondNum;
	firstNum=secondNum;
	secondNum=sum;
	System.out.println(sum);
	
}



	}

}
