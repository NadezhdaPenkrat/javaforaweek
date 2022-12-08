package src.com.javaforaweek.practice_21_30;

// описание интерфейса
interface Example25Interface {

    // статическая константа
    int DISTANCE = 25;

    // объявление методов
    int mult(int a);

    double div(double b);
}




// класс, реализующий интерфейс
class MyClass implements Example25Interface {
    // реализация метода mult ()
    @Override
    public int mult(int a) {
        return (a * 2);
    }

    // реализация метода div ()
    @Override
    public double div(double b) {
        return (b / 3);
    }
}

class Exmpl25 {
    public static void main(String[] args) {

// объект класса
        MyClass obj = new MyClass();

// вывод на печать результатов работы
// реализованных методов и константы
        System.out.println(obj.DISTANCE);
        System.out.println(obj.mult(5));
        System.out.println(obj.div(7));
    }
}
