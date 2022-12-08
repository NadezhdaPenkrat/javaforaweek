package src.com.javaforaweek.part_1_theoretics.practice_41_50;


// класс с перегруженным методом
    class Example43LambdaExpressionUsingReferencesToOverloadedMethods {
        // первый вариант метода (без аргумента)
        void mult () {
            System.out.println ("Вызван пустой метод.");
        }
        // второй вариант метода (с аргументом)
        void mult (int n) {
            System.out.println ("Вызвано умножение на два: "+n*2);
        }
    }
    // первый интерфейс
    interface Method1 {
        void doit ();
    }
    // второй интерфейс
    interface Method2 {
        void doit (int n);
    }
    class Exmpl43 {
        public static void main (String [] args) {
// создаем объект класса
            Example43LambdaExpressionUsingReferencesToOverloadedMethods obj=new
                    Example43LambdaExpressionUsingReferencesToOverloadedMethods ();
// первая интерфейсная переменная
            Method1 A=obj::mult;
// вторая интерфейсная переменная
            Method2 B=obj::mult;
// вызываем первый вариант метода
            A.doit ();
// вызываем второй вариант метода
            B.doit (5);
        }
    }
