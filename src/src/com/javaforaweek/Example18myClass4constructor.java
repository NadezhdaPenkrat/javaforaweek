package src.com.javaforaweek;

 class Example18Example18staticObjects4constructor {

    // Объявляем поля класса
    int digit;
    char letter;

    // Конструктор класса без аргументов
    Example18Example18staticObjects4constructor () {
        digit=9;
        letter='Z';
        System.out.println ("Вызван конструктор объекта без аргументов.");
        System.out.println ("Полям присвоены значения "+digit+" и "+letter);
    }


    // Конструктор класса с двумя аргументами
    Example18Example18staticObjects4constructor (int a, char b) {
        digit=a;
        letter=b;
        System.out.println ("Вызван конструктор объекта с двумя аргументами.");
        System.out.println ("Полям присвоены значения "+digit+" и "+letter);
    }
}


class Exmpl18 {
    public static void main (String [] args) {

// Создаем первый объект класса Example18staticObjects
// Вызывается конструктор без аргументов
        Example18Example18staticObjects4constructor objFirst=new Example18Example18staticObjects4constructor ();


// Создаем второй объект класса Example18staticObjects
// Вызывается конструктор с двумя аргументами
        Example18Example18staticObjects4constructor objSecond=new Example18Example18staticObjects4constructor (8, 'B');
    }
}
