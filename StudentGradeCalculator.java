import java.util.*;  
class Main  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);  
System.out.println("Enter marks of five subjects");
System.out.print("Enter marks obtained in Subject1: ");  
int a= sc.nextInt();  
System.out.print("Enter marks obtained in Subject2: ");  
int b= sc.nextInt();  
System.out.print("Enter marks obtained in Subject3: ");  
int c= sc.nextInt(); 
System.out.print("Enter marks obtained in Subject4: ");  
int d= sc.nextInt();  
System.out.print("Enter marks obtained in Subject5: ");  
int e= sc.nextInt(); 

int f=a+b+c+d+e;  

int g=(f/5);

System.out.println("Total marks of all subjects:= " +f);  
System.out.println("Average percentage:= " +g);  

if(g>=90)
			System.out.println("Grade A");
		else if(g>=80)
			System.out.println("Grade B");
		else if(g>=70)
			System.out.println("Grade C");
		else if(g>=60)
			System.out.println("Grade D");
		else if(g>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
}  
}
