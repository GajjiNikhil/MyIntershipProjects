package quiz;

	import java.util.Scanner;
	import java.util.*;
	public class onlinequiz {
	int pass=3452;	
	int score=0;
	public void quiz() {
	System.out.println("TO start the quiz test");	
	System.out.println("Enter your password");
	Scanner s=new Scanner(System.in);
	int enterpass=s.nextInt();
	if(enterpass==pass) {
		System.out.println("correct password");
		test();
	}
	else {
		System.out.println("wrong password");
	}	
	}
	public void test() {
		System.out.println("Enter the numbers serial wise to get the question");
		Scanner s=new Scanner(System.in);
		int ques=s.nextInt();
		if(ques==1) {
			question1();
		}
		else if(ques==2) {
			question2();
		}
		else if(ques==3) {
			question3();
		}
		else if(ques==4) {
			question4();
		}
		else {
			System.out.println("wrong");
		}}
		public void question1() {
			int a=3;
			System.out.println("which programming language has the high object oriented program?"); 
			System.out.println("1.C");
			System.out.println("2.C++");
			System.out.println("3.Java");
			System.out.println("4.Python");
			Scanner s=new Scanner(System.in);
			int aa=s.nextInt();
			switch (aa) {
			case 1:
				System.out.println("c");
				break;
			case 2:
				System.out.println("c++");
				break;
			case 3:
				System.out.println("java");
				break;
			case 4:
				System.out.println("python");
				break;
				default :
					System.out.println("invalid option");
			}
	System.out.println("the answer is 3");
	System.out.println("Enter the option");
			Scanner ss=new Scanner(System.in);
			int ans=ss.nextInt();
			if(ans==3) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
			System.out.println("your score is");
			if(ans==3) {
				score=score+1;
				System.out.println("score is " +score);
			}
			else {
				System.out.println("0");
			}
			test();
	}
		public void question2() {
			int a=2;
			System.out.println("What is the capital of France?"); 
			System.out.println("1.London");
			System.out.println("2.paris");
			System.out.println("3.Berlin");
			System.out.println("4.Rome");
			Scanner s=new Scanner(System.in);
			int aa=s.nextInt();
			switch (aa) {
			case 1:
				System.out.println("London");
				break;
			case 2:
				System.out.println("Paris");
				break;
			case 3:
				System.out.println("Berlin");
				break;
			case 4:
				System.out.println("Rome");
				break;
				default :
					System.out.println("invalid option");
		}
        	System.out.println("the answer is 2");
        	System.out.println("Enter the option");
			Scanner w=new Scanner(System.in);
			int ans=w.nextInt();
			if(ans==2) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
			System.out.println("your score is");
			if(ans==2) {
				score=score+1;
				System.out.println("score is " +score);
			}
			else {
				System.out.println("0");
			}
			test();
	}
		public void question3() {
			int a=2;
			System.out.println("What is 2 + 2?"); 
			System.out.println("1.2");
			System.out.println("2.4");
			System.out.println("3.6");
			System.out.println("4.8");
			Scanner s=new Scanner(System.in);
			int aa=s.nextInt();
			switch (aa) {
			case 1:
				System.out.println("2");
				break;
			case 2:
				System.out.println("4");
				break;
			case 3:
				System.out.println("6");
				break;
			case 4:
				System.out.println("8");
				break;
				default :
					System.out.println("invalid option");
			} 
			System.out.println("the answer is 2");
			System.out.println("Enter the option");
			Scanner p=new Scanner(System.in);
			int ans=p.nextInt();
			if(ans==2) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
      		System.out.println("your score is");
			if(ans==2) {
				score=score+1;
				System.out.println("score is " +score);
			}
			else {
				System.out.println("0");
			}
			test();
		}
		public void question4() {
			int a=1;
			System.out.println("Who is the author of 'To Kill a Mockingbird'?"); 
			System.out.println("1.Harper Lee");
			System.out.println("2.J.K.Rowling");
			System.out.println("3.Stephen King");
			System.out.println("4.Charkes Dickens");
			Scanner s=new Scanner(System.in);
			int aa=s.nextInt();
			switch (aa) {
			case 1:
				System.out.println("Harper Lee");
				break;
			case 2:
				System.out.println("J.k.Rowling");
				break;
			case 3:
				System.out.println("Stephen King");
				break;
			case 4:
				System.out.println("Charkes Dickens");
				break;
				default :
					System.out.println("invalid option");
			} 
			System.out.println("the answer is 1");
			System.out.println("Enter the option");
			Scanner p=new Scanner(System.in);
			int ans=p.nextInt();
			if(ans==1) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
      		System.out.println("your score is");
			if(ans==1) {
				score=score+1;
				System.out.println("score is " +score);
			}
			else {
				System.out.println("0");
			}
			System.out.println("your total score is " +score);
			System.out.println("Quiz Test Completed");
		}
	public static void main(String[] args) {
		
		onlinequiz o=new onlinequiz();
		o.quiz();
	}
}
