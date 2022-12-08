package src.com.javaforaweek.practice_41_50;

// объявляем функциональный интерфейс
interface Example42LambdaExpressionUsingReferencesToStaticclassMethods {

    int calc (int n);
}

// класс
class MyClass {
    // деление на два
    static int div2 (int n) {
        return n/2;
    }
    // просто возвращаем значение
    static int none (int n) {
        return n;
    }
}

class Exmpl42 {
    public static void main (String [] args) {
// создаем объект класса
// объявляем интерфейсную переменную
        Example42LambdaExpressionUsingReferencesToStaticclassMethods tmp;
// формируем массив исходных значений
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        for (int i: nums)
        {
            if (i%2==0) {// если делится на два
// то используем метод деления на два
                tmp=MyClass::div2;
            }
            else {// для всех остальных
// выводим исходное число
                tmp=MyClass::none;
            }
            System.out.println(tmp.calc (i));
        }
    }
}
