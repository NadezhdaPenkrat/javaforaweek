package src.com.javaforaweek.practice_11_20;

 class Example15Example18staticObjects {
     // Описание метода, выполняющего сложение
     int summ (int a, int b) {
         int summa=a+b;
         return summa;
     }
     // Описание метода, выполняющего умножение
     int proiz (int a, int b) {
         int proizvedenie=a*b;
         return proizvedenie;
     }
 }
class Exmpl15 {
    public static void main (String [] args) {
// Создаем объект класса Example15Example18staticObjects
        Example15Example18staticObjects test=new Example15Example18staticObjects ();
// Вызов метода, выполняющего сложение
        System.out.println ("Сумма чисел 4+5="+test.summ (4,5));
// Вызов метода, выполняющего умножение
                System.out.println ("Произведение чисел 5*6="+test.proiz (5,6));
    }
}
