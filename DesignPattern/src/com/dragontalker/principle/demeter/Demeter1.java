package com.dragontalker.principle.demeter;

import java.util.ArrayList;
import java.util.List;

// 客户端
public class Demeter1 {

    public static void main(String[] args) {
        // 创建了一个SchoolManager对象
        SchoolManager schoolManager = new SchoolManager();
        // 输出学院的员工id 和 学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

// 学校总部员工
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 学院的员工
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 管理学院员工的管理类
class CollegeManager {
    // 返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) { // 这里我们增加了10个员工到list
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id=" + i);
            list.add(emp);
        }
        return list;
    }
}

// 学校管理类
class SchoolManager {
    // 返回学校总部的员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    // 该方法完成输出学校总部和学院员工信息的方法
    void printAllEmployee(CollegeManager sub) {
        // 获取到学院员工
        List<CollegeEmployee> list1 = sub.getAllEmployee();
        System.out.println("----------分公司员工----------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }

        // 获取到学校总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("----------总公司员工----------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
