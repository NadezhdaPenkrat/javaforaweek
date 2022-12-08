package src.com.javaforaweek.part_1_theoretics.practice_11_20;

public class Example11continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            if (i == (i / 2) * 2) {
                //выводятся четные
                // System.out.println("i = " + i);
                continue;
            }
            //continue - пробрасывает и выводятся нечетные
            System.out.println("i = " + i);
        }
    }
}
