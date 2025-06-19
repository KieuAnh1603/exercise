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

    }

    @Override
    public void Attack(GameCharacter target) {
        System.out.println("Dame = " + (30+getLevel()));
        System.out.println("Giap hien tai: "+ armor);
    }

    @Override
    public void LevelUp() {
        System.out.println("Level now: " + (getLevel()+1));
    }
}
