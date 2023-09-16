
import java.util.*;

public class GitPerson {
String name="";
String country="";
int year=2023;
int age;


public int Calculation(int result)
{
	int ageOfPerson=year-result;
	return ageOfPerson;
}
public static void main(String[] args) {
	GitPerson p1=new GitPerson();
	Scanner prsn=new Scanner(System.in);
	System.out.println("Enter your name");
	String name=prsn.nextLine();
	System.out.println("Enter your country");
	String country=prsn.nextLine();
	System.out.println("Enter your birth year");
	int age=prsn.nextInt();
	int result=p1.Calculation(age);
	System.out.println(name+" "+"from"+" "+country+" " + "your Current Age is "+result);
}
}
