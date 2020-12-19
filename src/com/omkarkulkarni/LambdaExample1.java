package com.omkarkulkarni;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample1 {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(1, "a", 10000),
                new Employee(2, "b", 20000),
                new Employee(3, "b", 30000));


        List<String> employeeNameList = employeeList.stream().
                map(x -> x.getEmpName()).collect(Collectors.toList());

        System.out.println(employeeNameList);

        List<Employee> employeeswithSalaryMorethan20K = employeeList.stream()
                .filter(x -> x.getEmpName().contains("b"))
                .collect(Collectors.toList());

        for (Employee emp: employeeswithSalaryMorethan20K) {
            System.out.println(emp.toString());
        }
    }
}
