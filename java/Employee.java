// package java;
public abstract class Employee {
    private String name;
    private String id;
    private int age; 
   
    public abstract double CaculateSalary();

    public abstract void ShowInFo();
        
    public abstract void PaySalary();

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getID(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public void setID(String id){
        this.id=id;
    }
}