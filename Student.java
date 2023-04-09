package JavaOOPs;

public class Student
{
    private int id ;
    private  String  name ;
    private int grade ;
    private int feesPaid ;
    private int feesTotal;

   public Student(int id , String name ,int grade) // new statement -> constructor to initailize values.
   {
       this.id = id ; // left side id this the global id , and right side is the value that has been passed through the object initialization .
       this.name = name ;
       this.grade = grade ;
       feesPaid= 0 ;
       feesTotal=3000 ;
   }
   // not altering the id and name , hence not using setter method for them . but will use it for grade .
   public void setGrade(int garde)
   {
       this.grade = grade ; // this will be the new grade for the students, the value that has been passed .

   }
   public void payFees (int fees)
   {
     feesPaid+= fees ;
     School.updateMoneyEarned(feesPaid);
   }
   public int remainingFees(int fees)
   {
       return feesTotal-feesPaid;
   }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
}
