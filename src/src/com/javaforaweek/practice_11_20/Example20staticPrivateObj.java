package src.com.javaforaweek.practice_11_20;

 class Example20staticPrivateObj {

    // закрытое статическое текстовое поле
    private static String text="Hello";
    // открытый статический метод
// для изменения закрытого поля
    static void setText (String txt) {
        text=txt;
    }
    static void showText () {
        System.out.println (text);
    }
}
 class Exmpl20 {
    public static void main (String [] args) {

// Выводим значение поля на печать
        Example20staticPrivateObj.showText ();

// Модифицируем значение поля
        Example20staticPrivateObj.setText ("New text");

// Выводим новое значение на печать
        Example20staticPrivateObj.showText ();
    }
}
