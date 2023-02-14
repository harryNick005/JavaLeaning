package CustomeClass;

import CustomeClass.employee;

import java.util.List;

public class employeeInfo {
    public static void main(String[] args) {
        // access id
        // className+(noArg)||(withArg) ======Constructor
        // object = new+Constructor;
        // object = new+ClassName+();


        employee employee1 = new employee(100001, "KasimBodak", "Xax", "QA", 'M', 23, 85000d);
        employee employee2 = new employee(100002, "AkangKatil", "Puxaxman", "SDET", 'M', 30, 110000d);
        employee employee3 = new employee(100003, "SorunmangGul", "Tanha", "HR", 'F', 36, 100000d);
        employee employee4 = new employee(100004, "AlimXanku", "Maynat", "SDET", 'M', 48, 150000d);
        employee employee5 = new employee(100005, "Ayxamgul", "Qokan", "PO", 'F', 33, 120000d);

        //add employees
        List<employee> employees=employee.addEmployee(new employee[]{employee1,employee2,employee3,employee4,employee5});
       // print employees
        System.out.println("Before remove======================================");
        employee.printAllEmployees(employees);
        //delete CustomeClass.employee
        System.out.println("after remove======================================");
        employee.removeEmployeeById(100001,employees);
        // print employees to check if specific employees is removed
        employee.printAllEmployees(employees);




    }
}
