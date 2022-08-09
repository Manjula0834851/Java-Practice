package Oops;

class RefVariable1
{
int r = 20;
public static void main(String[] args)
{
RefVariable1 r1 = new RefVariable1();
System.out.println( " value of r1 = " +r1.r);
r1.r=30; 
System.out.println( " Address of Variable r = " +r1.r);
RefVariable1 r2 = r1;
System.out.println("Value of r2 = " +r2.r);
}
}
