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
    // public
}
