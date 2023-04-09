package JavaOOPs;

import java.util.List;

public class School
{
    private List<Teacher> teachers ;
    private List<Student> students ;
    private static int totalMoneyEarned ;
    private  static int totalMoneySpent ;

    public School (List<Teacher> t , List<Student> s)
    {
        this.teachers = t ;
        this.students = s ;
        totalMoneyEarned = 0 ;
        totalMoneySpent = 0 ;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void updateStudents(Student student) {
      students.add(student);
    }

    public List<Teacher> getTeachers() {   // this returns the list of teachers .
        return teachers;
    }

    public void updateTeachers(Teacher teacher) { // adds a teacher to the school .
        teachers.add(teacher);
    }

    public int getMoneyEarned() {
        
        return totalMoneyEarned;
    }

    public static void updateMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned; // adds the money into the global variable .
    }

    public int getMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent ;
        totalMoneyEarned -= totalMoneySpent;
    }
}
