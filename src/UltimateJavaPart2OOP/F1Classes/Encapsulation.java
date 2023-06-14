package UltimateJavaPart2OOP.F1Classes;

public class Encapsulation {
    public static void main(String[] args) {
        var employee = new Employee(-1,5); //coupling point
        employee.setBaseSalary(50_000);
        employee.getBaseSalary();
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
