package src.com.javaforaweek;

 class Example19staticObjects {
     // статическое числовое поле
     static int number=5;
     // статическое текстовое поле
     static String text="Hello";
     // статическй метод (вывод текста на печать)
     static void showText () {
         System.out.println (text);
     }
     // статический метод (вывод числа на печать)
     static void showNumber () {
         System.out.println (number);
     }
 }
 class Exmpl19 {
    public static void main (String [] args) {

// прямое обращение к статическим методам
// без создания объекта класса
        Example19staticObjects.showText ();
        Example19staticObjects.showNumber ();

// прямое обращение к статическим полям
// без создания объекта класса
        Example19staticObjects.number=15;
        Example19staticObjects. text="Java";

// проверяем, изменились ли статические поля
// после прямого обращения
        Example19staticObjects.showText ();
        Example19staticObjects.showNumber ();

// создаем объект класса
        Example19staticObjects obj=new Example19staticObjects ();

// обращаемся к статическим полям
// в качестве полей объекта
        obj.showText ();
        obj.showNumber ();
    }
}

