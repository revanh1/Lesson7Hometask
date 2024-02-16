package Lesson7.Hometask;

public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlySalary;


    public PartTimeEmployee(String name, int experience, int hoursWorked, double hourlySalary) {
        super(name, experience);
        this.hoursWorked = hoursWorked;
        this.hourlySalary = hourlySalary;
    }
    public double getSalary(){
        return hourlySalary * hoursWorked;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "hoursWorked=" + hoursWorked +
                ", hourlySalary=" + hourlySalary +
                '}';
    }
}
