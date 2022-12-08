package src.com.javaforaweek.part_1_theoretics.practice_41_50;

// объявляем функциональный интерфейс
interface Example41LambdaExpressionUsingReferencesToNonStaticclassMethods {

    int calc (MyClass obj, int n);
}
// класс
class MyClass {
    // деление на два
    int div2 (int n) {
        return n/2;
    }
    // просто возвращаем значение
    int none (int n) {
        return n;
    }
}
class Exmpl41 {
    public static void main (String [] args) {
// создаем объект класса
        MyClass obj=new MyClass ();
// объявляем интерфейсную переменную
        Example41LambdaExpressionUsingReferencesToNonStaticclassMethods tmp;
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
            System.out.println(tmp.calc (obj, i));
        }
    }
}
