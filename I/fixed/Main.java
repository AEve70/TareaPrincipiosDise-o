package I.fixed;

public class Main {
    public static void main(String[] args){
        Robot robot = new Robot();
        Employee employee = new Employee();

        robot.work();
        employee.work();
        employee.eat();
        employee.sleep();
    }
}

