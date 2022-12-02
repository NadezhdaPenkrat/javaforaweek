package src.com.javaforaweek;
import javax.swing.JOptionPane;
import java. util. Random;

public class Example10break {
    public static void main (String [] args) {
        Random rnd = new Random(System.currentTimeMillis ());
        int secret = 1 + rnd.nextInt (10);
        System.out.println(secret + "secret");
        int userNumber;
        String userInput;

        while (true) {
// Выводим окно запроса
            userInput = JOptionPane.showInputDialog ("Угадайте число от 1 до 10");
            System.out.println(userInput + "userInput");
// Преобразуем строку в число в явном виде
            userNumber = Integer.parseInt (userInput);
            if (userNumber == secret) {
                JOptionPane.showMessageDialog (null, "Вы угадали число!");

                break;
            }else{
                JOptionPane.showMessageDialog (null, ":(!");
                break;
            }
        }
    }

}
