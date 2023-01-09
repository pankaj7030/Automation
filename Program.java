public class Program{

public static void main(String[]arg){

Program.t1();
Program b1=new Program();
b1.t2();
b1.t3();

System.out.println("Java 19 first program");
}

public static void t1(){
System.out.println("This is static method");
//These commect is for git test

}
public void t2(){
System.out.println("This is non static method");
}

public void t3(){
int a=20;
int b=30;
int c=a+b;
int d=b-a;
float e=b/a;
int f=a*b;

System.out.println("Addition="+c",""Substraction="+d);
}

}