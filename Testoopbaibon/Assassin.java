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
    }

    @Override
    public void Attack(GameCharacter target) {
         if(criticalChance/2 ==0){
            System.out.println("Dame = x2");
        }
    }

    @Override
    public void LevelUp() {
        System.out.println("Level now: " + (getLevel()+1));
    }
}
