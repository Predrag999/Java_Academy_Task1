package org.example;

public class Warrior implements canAttack{
    private static final int ATTACK = 5;
    private int health;
    public Warrior(){
        this(50);
    }
    public Warrior(int initialHealth){
        this.health = initialHealth;
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

    protected void hittedBy(canAttack attacker) {
        setHealth(getHealth() - attacker.getAttack());
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    protected int hittedFromLancer(int damage){
        return this.health -= (damage / 2);
    }

}
