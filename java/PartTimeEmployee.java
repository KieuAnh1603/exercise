// package java;

public class PartTimeEmployee extends Employee {
    private int SGio;
    public PartTimeEmployee(String name,int age, String id, int SGio){
            setName(name);
            setAge(age);
            setID(id);
            this.SGio=SGio;
    }

    @Override
    public double CaculateSalary(){
        double Luong2 = SGio*100;
        return Luong2;
    }

    @Override
    public void PaySalary(){
        System.out.println( "tra luong 2: " + CaculateSalary());
    }

    @Override
    public void ShowInFo(){
        System.out.println("Ten nhan vien: " + getName() );
        System.out.println("Tuoi nhan vien: " + getAge() );
        System.out.println("ID nhan vien: " + getID() );
        System.out.println("Tien luong nhan vien: " + CaculateSalary() );
        }
}
