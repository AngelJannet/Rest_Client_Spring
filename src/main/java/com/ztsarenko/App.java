package com.ztsarenko;

import com.ztsarenko.configuration.MyConfig;
import com.ztsarenko.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
        System.out.println("Get list employee");
        List<Employee> employeeList = communication.getAllEmployee();
        System.out.println(employeeList);

        System.out.println("Get Employee by Id");
        Employee empbyId = communication.getEmployee(1);
        System.out.println(empbyId);

        System.out.println("Save or update Employee");
        Employee employee = new Employee("Svetlana", "Kovalenko", "IT", 1100);
        communication.saveEmployee(employee);

        System.out.println("Delete Employee");
        communication.deleteEmployee(11);
    }
}
