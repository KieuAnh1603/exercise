package Testoopbaibon;

public class Warrior extends GameCharacter implements ISkillUser{
    private int armor;

    public Warrior(String name, int level, int health, int armor) {
        super(name, level, health);
        this.armor=armor;
    }
    @Override
    public void UseSkill(GameCharacter target) {
        System.out.println("Skill Chem manh");
        this.Attack(target);
    }

    @Override
    public void Attack(GameCharacter target) {
        target.TakeDamage(150);
    }

    @Override
    public void LevelUp() {
        System.out.println("Level now: " + (getLevel()+1));
    }
}
