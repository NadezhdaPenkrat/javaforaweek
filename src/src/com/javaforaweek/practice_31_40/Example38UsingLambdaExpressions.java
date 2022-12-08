package src.com.javaforaweek.practice_31_40;

// объявляем функциональный интерфейс
interface Example38UsingLambdaExpressions {

    // метод по умолчанию
    default void doit (int n) {
        System.out.println ("Результат: "+calc (n));
    }
    // абстрактный метод
    double calc (int n);
}
class Exmpl38 {
    public static void main (String [] args) {
// присваиваем лямбда-выражение
// (возведение в куб)
        Example38UsingLambdaExpressions  Cube= (int n) -> {
            return Math. pow (n,3);
        };
// (возведение в квадрат)
        Example38UsingLambdaExpressions  Square= (int n) -> {
            return Math. pow (n,2);
        };
// (умножение на 5)
        Example38UsingLambdaExpressions  Mult= (int n) -> {
            return n*5;
        };
// отправляем код выражения Cube
        Cube.doit (3);
// отправляем код выражения Square
        Square.doit (12);
// отправляем код выражения Mult
        Mult.doit (5);
// переопределяем код выражения Mult
        Mult=n-> n*10;
// повторно отправляем код выражения Mult
        Mult.doit (5);
    }
}
