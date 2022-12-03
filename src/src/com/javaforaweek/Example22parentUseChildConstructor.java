package src.com.javaforaweek;

// описание суперкласса
class Example22parentUseChildConstructor {


    // поля родительского класса
    String text;
    int number;


    // конструктор родительского класса
    Example22parentUseChildConstructor(String text, int number) {
// присваиваем полям значения аргументов
        this.text = text;
        this.number = number;
// выводим значения полей на печать
        System.out.println("Сработал конструктор суперкласса!");
    }
}


// описание подкласса
class ChildClass extends Example22parentUseChildConstructor {
    char letter;
    int digit;

    // конструктор подкласса
    ChildClass(String text, int number, char letter, int digit) {
// вызываем конструктор суперкласса
        super(text, number);
        this.letter = letter;
        this.digit = digit;
        System.out.println("Сработал конструктор подкласса!");
    }

    // описание метода подкласса
    void showChildMethod() {
// Выводим на печать значения всех полей объекта
// присвоенные конструктором подкласса
        System.out.println("text=" + this.text);
        System.out.println("number=" + this.number);
        System.out.println("letter=" + this.letter);
        System.out.println("digit=" + this.digit);
    }
}

class Exmpl22 {
    public static void main(String[] args) {
// создаем объект подкласса
// и передаем аргументы в конструктор подкласса
        ChildClass obj = new ChildClass("Hello", 200, 'S', 5);
        obj.showChildMethod();
    }
}
