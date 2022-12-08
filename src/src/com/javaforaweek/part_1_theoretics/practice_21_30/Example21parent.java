package src.com.javaforaweek.part_1_theoretics.practice_21_30;

// описание суперкласса
class Example21parent {

    // числовое поле суперкласса
    int number = 5;
    // текстовое поле суперкласса
    String text = "Hello";

    // методы суперкласса
    void showText() {
        System.out.println(text);
    }

    void showNumber() {
        System.out.println(number);
    }
}

// описание подкласса
class MyChildClass extends Example21parent {
    int sum(int a) {
        return number + a;
    }
}

class Exmpl21 {
    public static void main(String[] args) {

// создаем объект суперкласса
        Example21parent objParent = new Example21parent();
// создаем объект подкласса
        MyChildClass objChild = new MyChildClass();


// вызываем методы суперкласса
        objParent.showNumber();
        objParent.showText();

// вызываем методы подкласса
        objChild.showNumber();
        objChild.showText();

// вызываем дополнительный метод подкласса
        int b = objChild.sum(12);
        // выводим результат вызова метода на печать
        System.out.println(b);
    }
}
