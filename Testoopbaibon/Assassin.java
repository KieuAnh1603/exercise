package Testoopbaibon;

public class Assassin extends GameCharacter implements ISkillUser{
    private int criticalChance;

    public Assassin(String name, int level, int health,int criticalChance) {
        super(name, level, health);
        this.criticalChance=criticalChance;
    }


    @Override
    public void UseSkill(GameCharacter target) {
        System.out.println("Skill Dam sau lung");
        this.Attack(target);
    }

    @Override
    public void Attack(GameCharacter target) {
        target.TakeDamage(100 + criticalChance);
    }

    @Override
    public void LevelUp() {
        System.out.println("Level now: " + (getLevel()+1));
    }
}
