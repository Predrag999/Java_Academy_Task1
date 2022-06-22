package org.example;

public class Defender extends Warrior {
    private static final int ATTACK = 3;
    private static final int DEFENSE = 2;
    public Defender(){
        super(60);
    }
    @Override
    public  int getAttack(){
        return ATTACK;
    }

    public  static int getDefense(){
        return DEFENSE;
    }
    @Override
    protected void hittedBy(canAttack attacker){
        super.hittedBy(() -> Math.max(0, attacker.getAttack() - getDefense()));
    }

}
