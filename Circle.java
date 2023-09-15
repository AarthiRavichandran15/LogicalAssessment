package project1;
import java.util.*;

public class GitPro1 {
double pi=3.14;
public double area(double radius)
{
	double area=pi*radius*radius;
	return area;
}
public double perimeter(double radius)
{
	double perimeter=2*pi*radius;
	return perimeter;
}
public static void main(String[] args)
{
GitPro1	c1=new GitPro1();
Scanner scn=new Scanner(System.in);
System.out.println("Enter Radius");
double rad =scn.nextInt();
double areaans=c1.area(rad);
double rad1 =scn.nextInt();
double perians=c1.perimeter(rad);
System.out.println("Area is "+areaans);
System.out.println("Perimeter is "+perians);
}
}
