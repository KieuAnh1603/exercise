// package java;

public class FullTimeEmployee extends Employee implements Ipayable{
        private int bonus;
        public FullTimeEmployee(String name, int age, String id, int bonus){
            setName(name);
            setAge(age);
            setID(id);
            this.bonus=bonus;
        }
        @Override
        public double CaculateSalary(){
            double Luong1 = 20*1000 + bonus;
            return Luong1;
        }

        @Override
        public void PaySalary(){
            System.out.println("tra luong 1: " + CaculateSalary());
        }

        @Override
        public void ShowInFo(){
            System.out.println("Ten nhan vien: "+ getName() );
            System.out.println("Tuoi nhan vien: "+ getAge() );
            System.out.println("ID nhan vien: "+ getID() );
            System.out.println("Tien luong nhan vien: "+ CaculateSalary() );
        }
}
