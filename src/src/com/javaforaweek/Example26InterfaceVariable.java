package src.com.javaforaweek;

// объявление интерфейса
interface Example26InterfaceVariable {


    // объявление метода интерфейса
    void show();
}


// описание класса, реализующего интерфейс
class NewClass implements Example26InterfaceVariable {

    int number;

    // конструктор класса
    NewClass(int n) {
        number = n;
    }

    // реализация метода интерфейса
    @Override
    public void show() {
        System.out.println(number);
    }

    // дополнительный метод класса
    void showDouble() {
        System.out.println(number * 2);
    }
}

class Exmpl26 {
    public static void main(String[] args) {

// объявляем интерфейсную переменную ref
        Example26InterfaceVariable ref;


// создаем объект класса NewClass
// и сохраняем ссылку в переменной интерфейса
        ref = new NewClass(5);

// вызываем метод интерфейса
        ref.show();

// создаем второй объект класса NewClass
        NewClass obj = new NewClass(6);

// присваиваем ссылку интерфейсной переменной
        ref = obj;

// вызываем метод интерфейса
        ref.show();
// вызываем дополнительный метод класса
        obj.showDouble();
    }
}

