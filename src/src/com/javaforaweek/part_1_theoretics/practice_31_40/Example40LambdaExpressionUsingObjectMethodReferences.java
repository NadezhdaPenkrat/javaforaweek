package src.com.javaforaweek.part_1_theoretics.practice_31_40;

// объявляем функциональный интерфейс
interface Example40LambdaExpressionUsingObjectMethodReferences {

    int calc (int n);
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
class Exmpl40 {
    public static void main (String [] args) {
// создаем объект класса
        MyClass obj=new MyClass ();
// объявляем интерфейсную переменную
        Example40LambdaExpressionUsingObjectMethodReferences tmp;
// формируем массив исходных значений
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        for (int i: nums)
        {
            if (i%2==0) {// если делится на два
// то используем метод деления на два
                tmp=obj::div2;
            }
            else {// для всех остальных
// выводим исходное число
                tmp=obj::none;
            }
            System.out.println(tmp.calc (i));
        }
    }
}
