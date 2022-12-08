package src.com.javaforaweek.practice_1_10;

public class Example6IfElse {
    public static void main(String[] args) {


        int a;
        int b;
        a = 0;
        b = 0;
        int c=a+b;

        if (  c > 100){
            System.out.println("true");

        }else{
            System.out.println("false");
            a = a + 5;
            b = b + 2;
            System.out.println("a"+ a+ "b"+b);
        }
    }
}