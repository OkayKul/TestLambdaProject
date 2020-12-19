package com.omkarkulkarni;

public class Employee {
    public int empId;
    public String empName;
    public long salary;

    public int getEmpId() {
        return empId;
    }


    public Employee(int empId, String empName, long salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
