package org.example;


import java.util.ListIterator;

public class Battle {

    public static boolean fight(Warrior firstWarrior, Warrior secondWarrior){
        Warrior attacker = firstWarrior;
        Warrior defender = secondWarrior;
        while(attacker.isAlive()){
            attacker.takeHits(defender);
            {
                var swap = attacker;
                attacker = defender;
                defender = swap;
            }
        }
        return firstWarrior.isAlive();
    }

    public static boolean fight(Army army1, Army army2){
        ListIterator<Warrior> it = army1.troops.listIterator();
        ListIterator<Warrior> it1 = army1.troops.listIterator();
        while(!army1.troops.isEmpty()){
            int index =0;
            int firstUnitHealth = army1.troops.get(index).getHealth();
            int secontUnitHealth = army2.troops.get(index).getHealth();
            fight(army1.troops.get(index),army2.troops.get(index));
            boolean army1HasNext = army1.troops.size() > 1;
            boolean army2HasNext = army2.troops.size() > 1;
            if(army1.troops.get(index) instanceof Lancer && army2HasNext){
                army2.troops.get(it1.hasPrevious() ? it1.previousIndex(): it1.nextIndex()).hittedFromLancer(secontUnitHealth - army2.troops.get(index).getHealth());
                index++;
            } else if(army2.troops.get(index) instanceof Lancer && army1HasNext){
                army1.troops.get(it.hasPrevious() ? it.previousIndex(): it.nextIndex()).hittedFromLancer(firstUnitHealth - army1.troops.get(index).getHealth());
                index++;
            }
            if(army1.troops.get(index).isAlive()){
                army2.deadthUnits();
            }else {
                army1.deadthUnits();
            }

            if(army2.troops.isEmpty()){
                return true;
            }
        }

        return false;
    }
}
