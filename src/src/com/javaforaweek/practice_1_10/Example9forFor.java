package src.com.javaforaweek.practice_1_10;

public class Example9forFor {
    public static void main(String[] args) {
        for (int weekDay = 1; weekDay <= 7; weekDay++) {

            System.out.print("День недели: ____");
            switch (weekDay) {
                case 1:
                    System.out.print("mon");
                    break;
                case 2:
                    System.out.print("tue");
                    break;
                case 3:
                    System.out.print("wed");
                    break;
                case 4:
                    System.out.print("thur");
                    break;
                case 5:
                    System.out.print("fri");
                    break;
                case 6:
                    System.out.print("sut");
                    break;
                case 7:
                    System.out.print("sun");
                    break;
            }
            System.out.print(+weekDay + " \n Часы:");
            System.out.print("\n");

            for (int dayHour = 1; dayHour <= 24; dayHour++) {
                System.out.print(" " + dayHour + " ");
            }
            System.out.print("\n");
        }


    }
}
