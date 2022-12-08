package src.com.javaforaweek.practice_11_20;

public class Example12forArr {
    public static void main(String[] args) {

        int[] even = new int[10];

// Инициализация массива
        for (int i = 0; i < 10; i++) {

            even[i] = i * 2 + 2;

        }
// Вывод значений элементов массива
        for (int data : even) {
            System.out.println(data);
        }
    }
}
