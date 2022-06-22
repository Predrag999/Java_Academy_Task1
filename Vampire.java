package org.example;

public class Vampire extends Warrior{
    private static final int VAMPIRISM = 50;
    private static final int ATTACK = 4;
    private int health = 40;

    @Override
    public int getHealth(){
        return health;
    }
    @Override
    public int getAttack(){
        return ATTACK;
    }

    @Override
    protected void takeHits(Warrior defense){
        class WarriorProxy extends Warrior{
            @Override
            public int getHealth(){
                  return health+= Math.max(0,(getAttack() - Defender.getDefense())  * VAMPIRISM % 100);
            }

        }
        super.takeHits(new WarriorProxy());
    }


}
