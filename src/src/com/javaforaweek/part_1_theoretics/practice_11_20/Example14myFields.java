package src.com.javaforaweek.part_1_theoretics.practice_11_20;

class Example14myFields {
    // Поля класса
    int data;
    char letter;
}
// Описание класса с главным методом программы
// Шаблон описания автоматически создается средой NetBeans
class Exmpl14 {
    // Главный метод
    public static char main;{
// Создаем объект класса MyFields
        Example14myFields demo = new Example14myFields ();
// Присваиваем значения полям
        demo. data = 1234;
        demo. letter = 'B';
// Выводим значения полей на печать
        System.out.println ("Число: "+demo. data);
        System.out.println ("Буква: "+demo. letter);
    }
}