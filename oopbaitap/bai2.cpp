#include <iostream>
#include <vector>

class Employee {
    private:
        std::string name, id;
        int age;  
    public:     
        virtual double CaculateSalary() =0;
        virtual void ShowInFo() =0;
        std::string getName(){
            return name;
        }
        int getAge(){
            return age;
        }
        std::string getID(){
            return id;
        }
        void setName(std::string name){
            this->name=name;
        }
        void setAge(int age){
            this->age=age;
        }
        void setID(std::string id){
            this->id=id;
        }
        virtual void PaySalary()=0;
};

class Ipayable : public Employee {
    public:
        virtual void PaySalary()=0;
};

class FullTimeEmployee : public  Ipayable{
    private:
        int bonus;
    public:
        FullTimeEmployee(std::string name, int age, std::string id, int bonus){
            setName(name);
            setAge(age);
            setID(id);
            this->bonus=bonus;
        }
        double CaculateSalary(){
            double Luong1 = 20*1000 + bonus;
            return Luong1;
        }
        void PaySalary(){
            std::cout<< "tra luong 1: "<< CaculateSalary()<<std::endl;
        }
        void ShowInFo(){
            std::cout<<"Ten nhan vien: "<< getName() <<std::endl;
            std::cout<<"Tuoi nhan vien: "<< getAge() <<std::endl;
            std::cout<<"ID nhan vien: "<< getID() <<std::endl;
            std::cout<<"Tien luong nhan vien: "<< CaculateSalary() <<std::endl;
        }
};


class PartTimeEmployee : public Ipayable{
    private:
        int SGio;
    public:
        PartTimeEmployee(std::string name,int age, std::string id, int SGio){
            setName(name);
            setAge(age);
            setID(id);
            this->SGio=SGio;
        }
        double CaculateSalary(){
            double Luong2 = SGio*100;
            return Luong2;
        }
        void PaySalary(){
            std::cout<< "tra luong 2: "<< CaculateSalary()<<std::endl;
        }
        void ShowInFo(){
            std::cout<<"Ten nhan vien: "<< getName() <<std::endl;
            std::cout<<"Tuoi nhan vien: "<< getAge() <<std::endl;
            std::cout<<"ID nhan vien: "<< getID() <<std::endl;
            std::cout<<"Tien luong nhan vien: "<< CaculateSalary() <<std::endl;
        }
};

class Intern : public Ipayable{
    public:
        Intern(std::string name,int age, std::string id){
            setName(name);
            setAge(age);
            setID(id);
        }
        double CaculateSalary(){
            double luong3 = 3*1000;
            return luong3;
        }
        void PaySalary(){
            std::cout<< "tra luong 3: "<< CaculateSalary()<<std::endl;
        }
        void ShowInFo(){
            std::cout<<"Ten nhan vien: "<< getName() <<std::endl;
            std::cout<<"Tuoi nhan vien: "<< getAge() <<std::endl;
            std::cout<<"ID nhan vien: "<< getID() <<std::endl;
            std::cout<<"Tien luong nhan vien: "<< CaculateSalary() <<std::endl;
        }
};

int main(){
    std::vector<Employee*> dsnv;

    dsnv.push_back(new FullTimeEmployee("Kieu Tuan Anh", 16, "160309",10000));
    dsnv.push_back(new PartTimeEmployee("Kieu Thanh tung", 22, "050204",12));
    dsnv.push_back(new Intern("But", 2, "213"));

    for(Employee* nv : dsnv){
         nv->PaySalary();
        nv->ShowInFo();
    }

    for(Employee* nv : dsnv){
        delete nv;
    }
    return 0;
}