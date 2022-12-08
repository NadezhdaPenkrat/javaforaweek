package src.com.javaforaweek.part_1_theoretics.practice_31_40;

// класс, в котором описан общий метод
class Example36ThreadSynchronizationThroughaSynchronizedObjectCommonRes  {

    int x=0;
    // объявляем синхронизированный метод
    synchronized void increment () {
        x=1;
        for (int i = 1; i <= 5; i++) {
            System.out.printf ("%s %d \n\", " +
                            "Thread.currentThread().getName ()," +
                            " x");
                       x++;
            try {
                Thread.sleep (100);
            }
            catch (InterruptedException e) {}
        }
    }
}
// класс для создания потоков
class CountClass implements Runnable {
    Example36ThreadSynchronizationThroughaSynchronizedObjectCommonRes res;
    // конструктор класса
    CountClass (Example36ThreadSynchronizationThroughaSynchronizedObjectCommonRes res) {
        res=res;
    }
    // реализация метода run ()
    @Override
    public void run () {
        res.increment ();
    }
}
class Exmpl37 {
    public static void main (String [] args) {
// создаем объект класса CommonResClass
        Example36ThreadSynchronizationThroughaSynchronizedObjectCommonRes myRes= new
                Example36ThreadSynchronizationThroughaSynchronizedObjectCommonRes ();
// в цикле создаем четыре потока и запускаем их
        for (int i = 1; i <5; i++) {
            Thread thr = new Thread (new CountClass (myRes));
            thr.setName ("Поток "+ i);
                    thr.start ();
        }
    }
}
