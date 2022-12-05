package src.com.javaforaweek;

public class Example33AccessingMainThreadOfTheProgram {
    public static void main(String[] args) {

        // объявляем объектную переменную
        Thread thr;

        // присваиваем переменной ссылку
        // на объект главного потока
        thr = Thread.currentThread();

        // выводим на печать информацию о потоке
        System.out.println(thr);

        // назначаем новое имя потока
        thr.setName("Главный поток");

        // назначаем новый приоритет потока
        thr.setPriority(8);

        // выводим обновленную информацию о потоке
        System.out.println(thr);
    }

}
