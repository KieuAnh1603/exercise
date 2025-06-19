package example;

public class GunController {
    private bulletBase _bullet;

    public GunController() {
    }

    public void fireBullet() {
        _bullet.fire();
    }

    public void ChangeBullet(bulletBase bullet) {
        _bullet = bullet;
    }
}
