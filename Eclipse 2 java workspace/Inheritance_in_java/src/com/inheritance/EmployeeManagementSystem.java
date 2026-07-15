package com.inheritance;

class Employeee {
    String name; int id;
    Employeee(String n,int i){ name=n; id=i; }
    void show(){ System.out.println("Employee: "+name+" ID:"+id); }
}
class Manager extends Employeee {
    String dept;
    Manager(String n,int i,String d){ super(n,i); dept=d; }
    void show(){ super.show(); System.out.println("Dept: "+dept); }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager m = new Manager("Alice",101,"HR");
        m.show();
    }
}

