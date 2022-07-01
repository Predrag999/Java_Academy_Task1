package org.example;

import java.awt.*;

public class Warrior implements canAttack{
    private int ATTACK;
    private int health;
    public Warrior(){
        this(50,5);
    }
    public Warrior(int initialHealth,int initialAttack){
        this.health = initialHealth;
        this.ATTACK = initialAttack;
    }

    public int getHealth(){
        return health;
    }
    public int getAttack(){
        return ATTACK;
    }
    boolean isAlive(){
        return getHealth() > 0;
    }
    protected void takeHits(Warrior defender){
        defender.hittedBy(this);
    }

    protected int hittedBy(canAttack attacker) {
//        setHealth(getHealth() - attacker.getAttack());
        this.health -= attacker.getAttack();
        return attacker.getAttack();
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    protected int hittedFromLancer(int damage){
        return this.health -= (damage / 2);
    }

    protected int maxHealth(){
        return  health = Math.min(health,maxHealth());
    }

}
