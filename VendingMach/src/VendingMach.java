

import java.util.Scanner;
public class VendingMach{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int answer=0;
	
		
		System.out.println("Choose a drink");
		System.out.println("1.Coco cola \n 2. Pepsi \n 3.Thumbs up \n 4.Sprite \n 5.Frooti");
		int num1=in.nextInt();
		System.out.println(num1);
		System.out.println("Enter the quantity");
		int num2=in.nextInt();
		switch(num1) {
		case 1:
			answer=num2*20;
			break;
		case 2:
			answer=num2*25;
			break;
		case 3:
			answer=num2*30;
			break;
		case 4:
			answer=num2*45;
			break;
		case 5:
			answer=num2*15;
			break;	
		
		
		}
		System.out.println("The cost is :"+answer);
		System.out.println("Enter the amount ");
		int num4=in.nextInt();
		if(num4<answer) {
			System.out.println("Amount is not enough");
			int a=answer-num4;
			System.out.println("Pay the remaining amount:"+a);
			int insuff=in.nextInt();
			int fin=a-insuff;
			System.out.println("Thank you and your change is:"+fin);
		}else {
			int change=num4-answer;
			System.out.println("Thank you and your change is:"+change);
			
		}
		
		
		
		
  
		
		
	}

}
