package src.com.javaforaweek;

public class Example31InheritingThreadForCreatingThread  extends Thread {
    // переопределение метода run ()
    @Override
    public void run () {
// цикл дочернего потока
        for (int i=1;i <=5;i++) {
            System.out.println ("Дочерний поток: "+i);
            try {
                Thread.sleep (2500);
            }
            catch (InterruptedException e) {
                System.out.println ("Прерывание дочернего потока");
            }
        }
    }
}
// главный класс программы
class Exmpl31 {
    public static void main (String [] args) throws InterruptedException {
// создаем объект дочернего потока
        Example31InheritingThreadForCreatingThread thr=new Example31InheritingThreadForCreatingThread ();
// запускаем дочерний поток
        System.out.println ("Запуск дочернего потока");
        thr.start ();
// цикл главного потока
        for (int j=0;j <=5;j++) {
            System.out.println ("Главный поток: "+j);
            Thread.sleep (1500);
        }
// проверяем, работает ли дочерний поток
// если да, то ждем, пока он завершит работу
        if(thr.isAlive ()) {
            System.out.println ("Ждем завершение дочернего потока");
            thr.join ();
        }
        System.out.println ("Все процессы завершены");
    }
}
