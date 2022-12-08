package src.com.javaforaweek.practice_21_30;

class Example23ParentClassOverridingMethods {

    int number = 5;

    // исходный метод суперкласса
    void show() {
        System.out.println("Метод суперкласса");
        System.out.println(number);
    }
}


class MyNewChildClass extends Example23ParentClassOverridingMethods {
    // переопределение метода суперкласса
    @Override
    void show() {
        System.out.println("Новый метод подкласса");
        System.out.println(number * 2);
    }
}

class Exmpl23 {
    public static void main(String[] args) {

// создаем объект суперкласса
        Example23ParentClassOverridingMethods objParent = new Example23ParentClassOverridingMethods();
// создаем объект подкласса
        MyNewChildClass objChild = new MyNewChildClass();
        
// вызываем метод суперкласса
        objParent.show();
// вызываем переопределенный метод подкласса
        objChild.show();
    }
}
