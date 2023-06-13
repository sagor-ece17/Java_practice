package UltimateJavaPart2OOP.F1Classes;

public class main {
    public static void main(String[] args) {
        var textbox1 = new TextBox(); // new instance(heap)
        textbox1.setText("Box 1");
        System.out.println(textbox1.text);//reference types.so that when we have not set any value this print null
        var textbox2 =  new TextBox();
        textbox2.setText("Box 2");
        System.out.println(textbox2.text);
        var textbox3 = textbox2; //single textBox object in the heap and two variables referencing the same object
        textbox3.setText("Hello");
        System.out.println(textbox2.text);
    }
}
