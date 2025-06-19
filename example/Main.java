package example;

public class Main {
    public static void main(String[] args) {
        GunController gunController = new GunController();
        
        gunController.ChangeBullet(new bullet1()); // Set the first bullet type
        // Fire the first bullet
        gunController.fireBullet();

        gunController.ChangeBullet(new bullet2()); // Change to the second bullet type
        // Fire the second bullet
        gunController.fireBullet();
    }
}
