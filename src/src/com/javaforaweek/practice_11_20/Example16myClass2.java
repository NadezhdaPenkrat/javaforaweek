package src.com.javaforaweek.practice_11_20;
import javax.swing.JOptionPane;

 class Example16Example18staticObjects2 {
    // Поля класса
    int fieldOne;
    int fieldTwo;
    // Метод для присваивания значений полям
    void set (int a, int b) {
        fieldOne = a;
        fieldTwo = b;
    }
    // Метод для перемножения значений полей
    int multiply () {
        return fieldOne*fieldTwo;
    }
    // Метод для суммирования значений полей
    int summ () {
        return fieldOne+fieldTwo;
    }
}
 class Exmpl16{
    public static void main (String [] args) {
// Объявляем переменные главного класса
        int input1, input2;
        String inputString1,inputString2;
// Создаем объект своего класса
        Example16Example18staticObjects2 obj=new Example16Example18staticObjects2 ();

// Окно ввода первого значения
        inputString1=JOptionPane.showInputDialog ("Введите первое значение");
        input1 = Integer.parseInt (inputString1);
// Окно ввода второго значения
        inputString2=JOptionPane.showInputDialog ("Введите второе значение");
        input2 = Integer.parseInt (inputString2);

// Вызываем метод для присвоения значений полям объекта
        obj.set (input1, input2);
// Выводим в диалоговое окно результат сложения
        JOptionPane.showMessageDialog (null,"Результат сложения: "+obj.summ ());
// Выводим в диалоговое окно результат умножения
        JOptionPane.showMessageDialog (null,"Результат умножения: "+obj.multiply ());
    }
}
