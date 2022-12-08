package src.com.javaforaweek.part_1_theoretics.practice_31_40;

import javax.swing.JOptionPane;

// класс, реализующий интерфейс Runnabl
public class Example35CreatingStartingDaemonProcessThreads implements Runnable {

    // описание метода run ()
    @Override
    public void run () {
        int i=0;
        while (true) {
            System.out.println (i);
            i++;
            try {
                Thread.sleep (500);
            }
            catch (InterruptedException e) {
                System.out.println ("Прерывание дочернего потока");
            }
        }
    }
}

class Exmpl35 {
    public static void main (String [] args) {
// создаем объект потока
        Thread thr=new Thread (new Example35CreatingStartingDaemonProcessThreads ());
// назначаем потоку статус демона
        thr.setDaemon (true);
// запускаем поток
        thr.start ();
// выводим окно запроса
        JOptionPane.showConfirmDialog (null,
                "Остановить программу?",
                "Пример потока-демона",
                JOptionPane.DEFAULT_OPTION);
// немедленное прекращение выполнения программы
                System. exit (0);
    }
}
