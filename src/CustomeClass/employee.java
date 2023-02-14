package CustomeClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class employee {

    private int id;

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return this.id;
    }


    public String employeeFirstName;
    public String employeeLastName;

    public String title;
    public char gender;
    public int age;
    public double salary;

    public employee(){

    }
    public  employee(int id,String employeeFirstName,String employeeLastName,String title,char gender,int age, double Salary){
        this.id=id;
        this.employeeFirstName=employeeFirstName;
        this.employeeLastName=employeeLastName;
        this.title=title;
        this.gender=gender;
        this.age=age;
        this.salary=Salary;

    }

    @Override
    public String toString() {
        return "CustomeClass.employee{" +
                "id=" + id +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", title='" + title + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    /**
    this method is to add CustomeClass.employee
     @param employeeArr
     */
    public static List<employee> addEmployee(employee[] employeeArr){
        List<employee> employeeList=new ArrayList<>(Arrays.asList(employeeArr));
        return employeeList;
    }

    /**
     * this method would return all employees
     * @param employees
     */

    public static List<employee> getAllEmployees(List<employee> employees){
       return employees;
    }

    /**
     * this method would print all employees
     * @param employees
     */

    public static void printAllEmployees(List<employee> employees){
        System.out.println(employees);
    }

    /**
     * this method os tp remove specific CustomeClass.employee by id
     * @param employees
     */

    public static void removeEmployeeById(int  id,List<employee> employees){
       List<employee> employeeList= getAllEmployees(employees);
        employeeList.removeIf(eachEmployeeObject->eachEmployeeObject.id==id);
    }


    /**
     *
     * @param employees
     */

//    public static List <Integer> getId(List<employee> employeesList){
//        List<Integer> employeeIdList=new ArrayList<>();
//        for (int i = 0; i <employeesList.size() ; i++) {
//          employeeIdList.add(employeesList.get(i).getId());
//        }
//        return employeeIdList;
//    }


    //    public static Map<Integer,employee> addEmployeeMap(Integer id,){
//
//    }
    public static void printAllEmployees(Map<Integer, employee> employees){
        System.out.println(employees);
    }



}