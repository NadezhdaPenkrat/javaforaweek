package src.com.javaforaweek.part_1_theoretics.practice_21_30;

import javax.swing.JOptionPane;


public class Example30CreatingCustomException extends Exception {

    // закрытое числовое поле
    private int code;

    // конструктор объекта исключения
    Example30CreatingCustomException(int n) {
        // вызов конструктора суперкласса
        super();
        code = n;
    }

    // переопределяем метод toString
    @Override
    public String toString() {
        String message = "Пользовательское исключение. Код ошибки: " + code;
        return message;
    }
}

 class Exmpl30 {

    public static void main(String[] args) {
        String userInput;
        int userData;

        // запускаем "вечный" цикл
        while (true) {
            // Выводим окно запроса
            userInput = JOptionPane.showInputDialog("Введите произвольное целое число");
            // проверяемый блок try
            try {
                // преобразуем строку в число в явном виде
                userData = Integer.parseInt(userInput);
                // проверяем введенное число на четность
                if ((userData % 2) == 0) {
                    // если число четное, генерируем исключение
                    throw new Example30CreatingCustomException(1);
                } else if (userData > 100) {
                    throw new Example30CreatingCustomException(2);
                }
            } catch (NumberFormatException e) {
                // если пользователь нажал кнопку "Cancel"
                if (e.toString().contains("null")) {
                    // прерывание работы программы
                    System.exit(0);
                }
                // если ошибка преобразования типа int
                else {
                    JOptionPane.showMessageDialog(null, "Введено недопустимое значение");
                }
            }
            // обработка пользовательских исключений
            catch (Example30CreatingCustomException e) {
                System.out.println(e);
            }
        }
    }
}
