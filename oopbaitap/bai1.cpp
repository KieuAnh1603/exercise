#include <iostream>
#include <vector>

class Vehicle{
    private:
        std::string LicensePlate;
        int year;
        double weight;
    public:
        double getWeight(){
            return weight;
        }
        std::string getLP(){
            return LicensePlate;
        }
        int getYear(){
            return year;
        }
        void setYear(int y){
            this->year= y;
        }
        // virtual Vehicle(std::string LicensePlate, int year, double weight) =0;
        virtual double calculateInspectionFee() =0;
        virtual void InTT() =0;
        virtual void Move() =0;
};

class IMovable{
    public:
    virtual void Move()=0;
};

class Motorbike : public Vehicle, IMovable{
    public:
    Motorbike(std::string LicensePlate, int year, double weight){

    }
    void Move() override{
        std::cout<<"xe may dang di chuyen"<<std::endl;
    }

    double calculateInspectionFee(){
        double FeeMTB=getWeight()*0.01;
        return FeeMTB;
    }
    void InTT(){
        std::cout<< calculateInspectionFee()<<std::endl;
        std::cout<< "Nam: "<< getYear()<<std::endl;
        std::cout<< "Bien so: "<< getLP()<<std::endl;
        std::cout<< "Trong luong: "<< getWeight()<<std::endl;
    }
};


class Car : public Vehicle,IMovable{
    public:
    Car(std::string LicensePlate, int year, double weight){

    }
    void Move() override{
        std::cout<<"xe o to dang di chuyen"<<std::endl;
    }

    double calculateInspectionFee(){
        double Feecar=getWeight()*0.015+500;
        return Feecar;
    }
    void InTT(){
        std::cout<< calculateInspectionFee()<<std::endl;
        std::cout<< "Nam: "<< getYear()<<std::endl;
        std::cout<< "Bien so: "<< getLP()<<std::endl;
        std::cout<< "Trong luong: "<< getWeight()<<std::endl;
    }
};

class Bus : public Vehicle,IMovable{
    private:
        int s;
    public:
    Bus(std::string LicensePlate, int year, double weight,int s){
        this->s=s;
        this->setYear(year);
    }
    void Move() override{
        std::cout<<"xe buyt dang di chuyen"<<std::endl;
    }
    double calculateInspectionFee(){
        double FeeBus=getWeight()*0.02+s*10;
        return FeeBus;
    }
    void InTT(){
        std::cout<< calculateInspectionFee()<<std::endl;
        std::cout<< "Nam: "<< getYear()<<std::endl;
        std::cout<< "Bien so: "<< getLP()<<std::endl;
        std::cout<< "Trong luong: "<< getWeight()<<std::endl;
        std::cout<< "So cho: "<< s <<std::endl;
    }
};

int main(){
    std::vector<Vehicle*> Ptgt;
    Ptgt.push_back(new Motorbike("001",2,50));
    Ptgt.push_back(new Car("002",1,500));
    Ptgt.push_back(new Bus("003",10,600,4));

    for(Vehicle* phuongtien : Ptgt){
        (*phuongtien).Move();
        phuongtien->InTT();
    }

    for(Vehicle* phuongtien : Ptgt){
        delete phuongtien;
    }
    return 0;
}