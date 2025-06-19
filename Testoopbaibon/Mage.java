package Testoopbaibon;

public class Mage extends GameCharacter implements ISkillUser{
    private int mana;

    public Mage(String name, int level, int health, int mana) {
        super(name, level, health);
        this.mana=mana;
    }


    @Override
    public void UseSkill(GameCharacter target) {
        System.out.println("Skill Fire ball");
    }

    @Override
    public void Attack(GameCharacter target) {
        System.out.println("Dang tan cong: "+ target.getName());
    }

    @Override
    public void LevelUp() {
        System.out.println("Level now: " + (getLevel()+1));
    }
}
