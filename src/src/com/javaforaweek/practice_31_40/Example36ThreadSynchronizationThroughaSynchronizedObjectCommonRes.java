package src.com.javaforaweek.practice_31_40;

// класс для создания объекта общего ресурса
class Example36ThreadSynchronizationThroughaSynchronizedObjectCommonRes  {

    int x=0;
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
// объявляем ресурс res как синхронизированный
        synchronized (res) {
// присваиваем полю объекта начальное значение
            res. x=1;
            for (int i = 1; i <= 5; i++) {
                System.out.printf("%s %d \n\", " +
                                "Thread.currentThread().getName ()," +
                                " res. x");
                        res. x++;
                try {
                    Thread.sleep (100);
                }
                catch (InterruptedException e) {}
            }
        } // конец синхронизированного блока команд
    }
}
    class Exmpl36 {
    public static void main (String [] args) {
// создаем объект класса CommonResClass
        Example36ThreadSynchronizationThroughaSynchronizedObjectCommonRes myRes=
                new Example36ThreadSynchronizationThroughaSynchronizedObjectCommonRes ();
// в цикле создаем четыре потока и запускаем их
        for (int i = 1; i <5; i++) {
            Thread thr = new Thread (new CountClass (myRes));
            thr.setName ("Поток "+ i);
                    thr.start ();
        }
    }
}