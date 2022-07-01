package org.example;

public class Vampire extends Warrior{
    private static final int VAMPIRISM = 50;
    public Vampire(){
        super(40,4);
    }

    public int getVampirism(){
        return VAMPIRISM;
    }
    @Override
    protected void takeHits(Warrior defense){
       int dealtDamage = defense.hittedBy(this);
       setHealth(getHealth() + dealtDamage * getVampirism() / 100);
    }
}
