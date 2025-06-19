package Testoopbaibon;

public abstract class GameCharacter {
    private String name;
    private int level;
    private int health;

    public GameCharacter(String name, int level , int health){
        this.name=name;
        this.level=level;
        this.health=health;
    }

    public abstract void Attack(GameCharacter target);

    public abstract void LevelUp();

    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void TakeDamage(int damage) {
        if (getHealth() <= 0) {
            System.out.println(getName() + " da chet.");
            return;
        }
        int newHealth = getHealth() - damage;
        if (newHealth < 0) {
            newHealth = 0;
        }

        setHealth(newHealth);
    }
    // public
}
