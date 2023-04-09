package JavaOOPs;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)  //psvm to write the main method .
    {
        Teacher tazwar = new Teacher(1,"tazwar" , 1500);
        Teacher zulfiquer = new Teacher(2,"zulfiquer" , 1550);
        Teacher toya = new Teacher(3,"toya" , 1550);
        List <Teacher> teacherList = new ArrayList<>() ;
        teacherList.add(tazwar);
        teacherList.add(zulfiquer);
        teacherList.add(toya);
        Student riya = new Student(1,"riya",2) ;
        Student shahreen = new Student(2,"shahreen",5) ;
        Student nasreen = new Student(3,"nasreen",7) ;
        List<Student>  studentList = new ArrayList<>() ;
        studentList.add(riya);
        studentList.add(nasreen);
        studentList.add(shahreen);

        School BracU =  new School(teacherList , studentList) ;
        System.out.println("BracU has earned"+ ""+BracU.getMoneyEarned());

        riya.payFees(5000);
        shahreen.payFees(4000);
        System.out.println("BracU has earned"+ "" +BracU.getMoneyEarned());
        tazwar.receiveSalary(tazwar.getSalary());
        System.out.println("BracU has paid salary to "+ tazwar.getName() + "and now has" + BracU.getMoneyEarned());
        System.out.println("get money spent "+  BracU.getMoneySpent());
    }
}
