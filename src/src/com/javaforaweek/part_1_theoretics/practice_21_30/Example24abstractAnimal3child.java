package src.com.javaforaweek.part_1_theoretics.practice_21_30;
// абстрактный суперкласс
abstract class Example24abstractAnimal3child {
    //Animal


    String name;
    String sound;
    int weight;

        // конструктор класса
        //Animal
        Example24abstractAnimal3child (String nm, String snd, int wt) {
            name=nm;
            sound=snd;
            weight=wt;
        }
        // абстрактный метод
        abstract void doExample24abstractAnimal3child ();//doAnimal()
    }


    // подкласс (кошка)
    class Cat extends Example24abstractAnimal3child {
        // конструктор
        Cat (String nm, String snd, int wt) {
            super (nm, snd, wt);
        }
        // описание метода, наследованного из суперкласса
        @Override
        void doExample24abstractAnimal3child () { //doAnimal()
            System.out.println ("Животное "+name+" весит примерно "+weight+"кг, издает звук "+sound);
            System.out.println ("Это животное выполняет действие:");
            System.out.println ("Ловит мышей.");
        }
    }
    // подкласс (собака)
    class Dog extends Example24abstractAnimal3child {
        // конструктор
        Dog (String nm, String snd, int wt) {
            super (nm, snd, wt);
        }
        // описание метода, наследованного из суперкласса
        @Override
        void doExample24abstractAnimal3child () { //doAnimal()
            System.out.println ("Животное "+name+" весит примерно "+weight+"кг, издает звук "+sound);
            System.out.println ("Это животное выполняет действие:");
            System.out.println ("Охраняет дом и хозяина.");
        }
    }
    class Exmpl24 {
        public static void main (String [] args) {

// объект кошка Маруся подкласса Cat
            Cat objCat=new Cat ("Маруся", "Мур-мур-мур", 3);
// объект пес Тузик подкласса Dog
            Dog objDog1=new Dog ("Тузик", "Гав-гав-гав", 9);
// объект пес Барбос подкласса Dog
            Dog objDog2=new Dog ("Барбос", "Р-р-р-р-р", 15);


// метод объекта подкласса Cat
            objCat.doExample24abstractAnimal3child (); //doAnimal()
// метод первого объекта подкласса Dog
            objDog1.doExample24abstractAnimal3child (); //doAnimal()
// метод второго объекта подкласса Dog
            objDog2.doExample24abstractAnimal3child ();//doAnimal()
        }
    }

