package Lesson7.Hometask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Revan", 3, 50000));
        employees.add(new PartTimeEmployee("Kenan", 1, 20, 15));
        employees.add(new FullTimeEmployee("Nurlan", 5, 60000));
        employees.add(new PartTimeEmployee("Cavidan", 2, 15, 12));

        //adding
        ArrayList<Employee> logicalEmployees = new ArrayList<>();
        for(Employee emp: employees){
            if(emp.getExperience() > 2){
                logicalEmployees.add(emp);
            }
        }

        //sort
        logicalEmployees.sort(Comparator.comparingInt(Employee::getExperience));

        //create and get max and min element
        Map<String, Employee> salaryMap = new HashMap<>();
        if (!logicalEmployees.isEmpty()) {
            salaryMap.put("max_salary", logicalEmployees.get(logicalEmployees.size() - 1));
            salaryMap.put("min_salary", logicalEmployees.get(0));
        }

// Output the results
        if (!logicalEmployees.isEmpty()) {
            for (Employee emp : logicalEmployees) {
                System.out.println("Name: " + emp.getName() + ", Experience: " + emp.getExperience());
            }

            System.out.println("Max Salary Employee: " + salaryMap.get("max_salary").getName());
            System.out.println("Min Salary Employee: " + salaryMap.get("min_salary").getName());
        } else {
            System.out.println("No employees with experience greater than 2 found.");
        }


    }
}
