package org.example;

public class Healer extends Warrior {
    private static final int HEALING_RATE = 2;

    public Healer(){
        super(60,0);
    }

//    public int getHealingRate(){
//        return HEALING_RATE;
//    }
//
//    protected void heal(Warrior other){
//        setHealth(other.getHealth() + getHealingRate());
//    }

}
