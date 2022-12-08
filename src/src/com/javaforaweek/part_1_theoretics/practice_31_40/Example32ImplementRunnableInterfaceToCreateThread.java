package src.com.javaforaweek.part_1_theoretics.practice_31_40;

public class Example32ImplementRunnableInterfaceToCreateThread implements Runnable {

    // описание метода run ()
    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Дочерний поток: " + i);

            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                System.out.println("Прерывание дочернего потока");
            }

        }
    }
}

class Exmpl32 {
    public static void main(String[] args)
            throws InterruptedException {

        // создаем объект дочернего потока
        // используя сокращенную запись
        Thread thr = new Thread(new Example32ImplementRunnableInterfaceToCreateThread());

        // запускаем дочерний поток
        System.out.println("Запуск дочернего потока");
        thr.start();

        // цикл главного потока
        for (int j = 0; j <= 5; j++) {
            System.out.println("Главный поток: " + j);
            Thread.sleep(1500);
        }

        // проверяем, работает ли дочерний поток
        // если да, то ждем, пока он завершит работу
        if (thr.isAlive()) {
            System.out.println("Ждем завершение дочернего потока");
            thr.join();
        }

        System.out.println("Все процессы завершены");
    }
}
