package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {


    public static void main(String[] args) {



        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1,  "Ahmet", "Bir"));
        employees.add(new Employee(1,  "Ahmet", "Bir"));
        employees.add(new Employee(2,  "Mehmet", "İki"));
        employees.add(new Employee(3,  "Ayşe", "Üç"));
        employees.add(new Employee(4,  "Hasan", "Dört"));
        employees.add(new Employee(4,  "Hasan", "Dört"));
        employees.add(new Employee(4,  "Hasan", "Dört"));
        employees.add(new Employee(5,  "Mehmet", "Beş"));
        employees.add(new Employee(6,  "Mehmet", "Beş"));
        employees.add(new Employee(6,  "Mehmet", "Beş"));

        //System.out.println(removeDuplicates(employees));


        //System.out.println(Arrays.toString(sentence.split("\\s+"));

        //System.out.println(Arrays.toString(sentence.split("\\s+")));
        System.out.println(WordCounter.calculatedWord());

    }
    public static  List<Employee> findDuplicates(List<Employee> employeeList){
        Set<Integer> setIdList = new HashSet<>();
        List<Employee> returnList = new LinkedList<>();
        for(Employee emp : employeeList){
            if(emp == null){
                continue;
            }
            else{
                if(!setIdList.add(emp.getId())){
                    if(!returnList.contains(emp)){
                        returnList.add(emp);
                    }
                }
            }

        }
        return returnList;

    }
    public static Map<Integer,Employee> findUniques(List<Employee> employeeList){
        Set<Employee> uniqueList = new HashSet<>();
        Map<Integer,Employee> mapList = new HashMap<>();
        for(Employee emp : employeeList){
            if(emp!=null){
                uniqueList.add(emp);
            }


        }
        System.out.println(uniqueList);
        System.out.println("************");
        for(Employee emp : uniqueList ){
            mapList.put(emp.getId(),emp);
        }

        return mapList;
    }
    public static List<Employee> removeDuplicates(List<Employee> employeeList)
    {
       List<Employee> removeEmployees =  findDuplicates(employeeList);
        Set<Employee> setList = new HashSet<>();
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()){
            Employee emp = iterator.next();
            if(removeEmployees.contains(emp) || emp == null){
                iterator.remove();
            }
        }
        return employeeList;
    }
}