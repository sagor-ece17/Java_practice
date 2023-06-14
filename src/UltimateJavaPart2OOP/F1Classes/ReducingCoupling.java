package UltimateJavaPart2OOP.F1Classes;

public class ReducingCoupling {
    public static void main(String[] args) {
        var browser = new Browser();
        var employee1 = new Employee(1000_0000, 10);
        System.out.println(employee1.calculateWage(10));
    }
}
