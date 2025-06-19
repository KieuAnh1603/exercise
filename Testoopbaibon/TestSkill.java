package Testoopbaibon;

// import java.util.ArrayList;
// import java.util.List;

public class TestSkill {
    public static void main(String[] args) {
        GameCharacter Nhanvat1, nhanvat2, nhanvat3;
        Nhanvat1 = new Mage("Kaine", 10, 100, 40);
        nhanvat2 = new Assassin("Aya", 5, 100, 10);
        nhanvat3 = new Warrior("Thane", 8, 1000, 60);
        Nhanvat1.Attack(nhanvat2);
        Nhanvat1.Attack(nhanvat3);
    }
}


