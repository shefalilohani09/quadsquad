class Employee
{
    String name,address,salary;
    int year_of_joining;

    Employee(String n,int year_of_joining,String salary,String address)
    {
        this.name=n;
        this.year_of_joining=year_of_joining;
        this.salary=salary;
        this.address=address;
    }
    void display()
    {
        System.out.println(name+" "+year_of_joining+" "+salary+"- "+address);
    }
}
public class class_objects {
    public static void main(String[] args) {
        Employee E1=new Employee("Robert",1994,"64C","WallsStreet");
        E1.display();
        Employee E2=new Employee("Sam",2000,"68D","WallsStreet");
        E2.display();
        Employee E3=new Employee("Jhon",1999,"26B","WallsStreet");
        E3.display();
    }
}
