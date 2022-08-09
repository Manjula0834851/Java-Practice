package Oops;

class Demo9
{
static int v1=100;
public static void test()
{
System.out.println("this is test() of demo9 class");
}
static void sample()
{
	System.out.println("Try this");
}
}
class MainClass
{
public static void main (String ar[])
{
	System.out.println("V1 is = " +Demo9.v1);
	Demo9.test();
	Demo9.sample();
}}
