public class Employee {
    private int id,salary;
    private String fistname,lastname;
    public Employee(int id,String fistname,String lastname,int salary){
        this.id=id;
        this.fistname=fistname;
        this.lastname=lastname;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public String getFistname(){
        return fistname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getname()
    {
        return fistname+" "+lastname;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getAnnualSalary(){

        return salary*12;
    }
    public int raiseSalary(int percent){
        salary += salary*percent/100;
        return salary;
    }
    @Override
    public String toString() {
        return "Employee [id="+id+",name="+fistname+" "+lastname+",salary="+salary+"]";
    }
}
