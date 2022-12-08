package src.com.javaforaweek.practice_11_20;

class Example17Example18staticObjects3overload {
    // Объявляем поля класса
    int digit;
    char letter;
    // Метод с одним числовым аргументом
    void set (int n) {
        digit=n;
    }
    // Метод с одним символьным аргументом
    void set (char s) {
        letter=s;
    }
    // Метод с двумя аргументами
    void set (int n, char s) {
        set (n); //Присвоить значение полю digit
        set (s); //Присвоить значение полю letter
    }
    // Метод без аргументов
    void set () {
// Присваиваем значение 5 полю digit
// и значение А полю letter
        set (5, 'A');
    }
    // Метод для отображения значений полей
    void show () {
        System.out.println ("Поле digit: "+digit);
        System.out.println ("Поле letter: "+letter);
    }
}
 class Exmpl17 {
    public static void main (String [] args) {

// Объявляем первый объект класса Example18staticObjects
        Example17Example18staticObjects3overload objFirst=new Example17Example18staticObjects3overload ();
// Объявляем второй объект класса Example18staticObjects
        Example17Example18staticObjects3overload objSecond=new Example17Example18staticObjects3overload ();


// Присваиваем числовое значение полю
// первого объекта
        objFirst.set (10);
// Присваиваем символьное значение полю
// первого объекта
        objFirst.set ('F');
// Присваиваем значения по умолчанию полям
// второго объекта
        objSecond.set ();
// Выводим на печать значения полей первого объекта
        System.out.println ("Свойства первого объекта");
        objFirst.show ();
// Выводим на печать значения полей второго объекта
        System.out.println ("\nСвойства второго объекта");
        objSecond.show ();
    }
}

