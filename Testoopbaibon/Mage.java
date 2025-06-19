package Testoopbaibon;

public class Mage extends GameCharacter implements ISkillUser{
    private int mana;

    public Mage(String name, int level, int health, int mana) {
        super(name, level, health);
        this.mana=mana;
    }


    @Override
    public void UseSkill(GameCharacter target) {
        // auto user skill se tru 20 mana
        if (mana < 20) {
            System.out.println("Khong du mana de su dung skill");
            return;
        }
        mana -= 20;
        System.out.println("Skill Fireball");
        this.Attack(target);
    }

    @Override
    public void Attack(GameCharacter target) {
        System.out.println("Dang tan cong: "+ target.getName());
        target.TakeDamage(50);
    }

    @Override
    public void LevelUp() {
        System.out.println("Level now: " + (getLevel()+1));
    }
}
