package src.com.javaforaweek.part_1_theoretics.practice_31_40;

// объявляем функциональный интерфейс
interface Example39PassingLambdaExpressionAsAparameter {

    boolean isTrue (int n);
}

class Exmpl39 {
    public static void main (String [] args) {
// определяем условие проверки
        Example39PassingLambdaExpressionAsAparameter term = (n) -> n%2==0;
// формируем массив чисел
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
// вызываем метод sum (), которому передаем
// лямбда-выражение term в качестве аргумента
        System.out.println (sum (nums, term));
    }
    // описываем метод для вычисления суммы
    private static int sum (int [] numbers, Example39PassingLambdaExpressionAsAparameter func)
    {
        int result = 0;
// перебираем элементы массива
        for (int i: numbers)
        {
            if (func.isTrue (i)) result += i;
        }
        return result;
    }
}
