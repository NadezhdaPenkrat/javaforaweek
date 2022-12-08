package src.com.javaforaweek.part_1_theoretics.practice_1_10;
// импортируем класс JOptionPane из библиотеки Swing
//с использованием логического и условного оператора
import javax.swing.JOptionPane;

public class Example8switch {
    public static void main (String [] args) {
        int userData;
        String userInput;
// Выводим окно запроса текущей даты
        userInput = JOptionPane.showInputDialog ("Введите число от 1 до 3");
// Преобразуем строку в число в явном виде
        userData = Integer.parseInt (userInput);
        if ((userData >= 1) & (userData <=3)) {
            JOptionPane.showMessageDialog (null, "Вы ввели число " + userData);
        }
        else {
            JOptionPane.showMessageDialog (null, "Вы ввели недопустимое число!");
        }


    }
}
