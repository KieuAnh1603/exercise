// package java;

public class Intern extends Employee{
    public Intern(String name,int age, String id){
            setName(name);
            setAge(age);
            setID(id);
    }

    @Override
    public double CaculateSalary(){
        double luong3 = 3*1000;
        return luong3;
    }

    @Override
    public void PaySalary(){
        System.out.println( "tra luong 3: " + CaculateSalary());
    }

    @Override
    public void ShowInFo(){
        System.out.println("Ten nhan vien: " + getName() );
        System.out.println("Tuoi nhan vien: " + getAge() );
        System.out.println("ID nhan vien: " + getID() );
        System.out.println("Tien luong nhan vien: " + CaculateSalary() );
    }
}
