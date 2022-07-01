package org.example;


import java.util.ListIterator;

public class Battle {

    public static boolean fight(Warrior firstWarrior, Warrior secondWarrior) {
        Warrior attacker = firstWarrior;
        Warrior defender = secondWarrior;
        while (attacker.isAlive()) {
            attacker.takeHits(defender);
            {
                var swap = attacker;
                attacker = defender;
                defender = swap;
            }
        }
        return firstWarrior.isAlive();
    }

    public static boolean fight(Army army1, Army army2) {
        ListIterator<Warrior> it = army1.troops.listIterator(); // ListIterator for the first Army
        ListIterator<Warrior> it1 = army2.troops.listIterator(); // ListIterator for the second Army
        while (!army1.troops.isEmpty()) {
//            int index =0;
            int firstUnitHealth = army1.troops.get(it.nextIndex()).getHealth();
            int secontUnitHealth = army2.troops.get(it1.nextIndex()).getHealth();
            fight(army1.troops.get(it.nextIndex()), army2.troops.get(it1.nextIndex()));
            boolean army1HasNext = army1.troops.size() > 1;
            boolean army2HasNext = army2.troops.size() > 1;
            if (army1.troops.get(it.nextIndex()) instanceof Lancer && army2HasNext) {
                army2.troops.get(it1.hasPrevious() ? it1.previousIndex() : it1.nextIndex()).hittedFromLancer(secontUnitHealth - army2.troops.get(it1.nextIndex()).getHealth());
                if (army2.troops.get(it1.hasPrevious() ? it1.previousIndex() : it1.nextIndex()) instanceof Healer) {
                    army2.troops.get(it1.nextIndex()).setHealth(army2.troops.get(it1.nextIndex()).getHealth() + 2);
                }
                //                index++;
            } else if (army2.troops.get(it1.nextIndex()) instanceof Lancer && army1HasNext) {
                army1.troops.get(it.hasPrevious() ? it.previousIndex() : it.nextIndex()).hittedFromLancer(firstUnitHealth - army1.troops.get(it.nextIndex()).getHealth());
                if (army1.troops.get(it.hasPrevious() ? it.previousIndex() : it.nextIndex()) instanceof Healer) {
                    army1.troops.get(it.nextIndex()).setHealth(army1.troops.get(it.nextIndex()).getHealth() + 2);
                }
                //                index++;
            }
            if (army1.troops.get(it.nextIndex()).isAlive()) {
                army2.deadthUnits();
            } else {
                army1.deadthUnits();
            }
            if (army2.troops.isEmpty()) {
                return true;
            }
        }
            return false;

    }
//    public static boolean straightFight (Army army1, Army army2){
//        ListIterator<Warrior> it = army1.troops.listIterator();
//        ListIterator<Warrior> it1 = army2.troops.listIterator();
//
//        while(army1.troops.get(it.nextIndex()).isAlive() && army2.troops.get(it1.nextIndex()).isAlive()){
//            fight(army1.troops.get(it.nextIndex()), army2.troops.get(it1.nextIndex()));
//            if(army1.troops.get(it.nextIndex()).getHealth() <= 0){
//                army2.deadthUnits();
//            } else if(army2.troops.get(it1.nextIndex()).getHealth() <= 0){
//                army1.deadthUnits();
//            }
//        }
//        return army1.troops.get(it.nextIndex()).isAlive();
//    }
public static boolean straightFight (Army army1, Army army2){
    ListIterator<Warrior> it = army1.troops.listIterator();
    ListIterator<Warrior> it1 = army2.troops.listIterator();

    while (army1.troops.get(it.nextIndex()).isAlive() && army2.troops.get(it1.nextIndex()).isAlive()){
        fight(army1.troops.get(it.nextIndex()), army2.troops.get(it1.nextIndex()));
       if(army1.troops.get(it.nextIndex()).isAlive()){
           army2.troops.remove(it1.nextIndex());
       } else if(army2.troops.get(it1.nextIndex()).isAlive()){
           army1.troops.remove(it.nextIndex());
       }
        if(army1.troops.isEmpty()){
            return false;
            }
        }
     return true;
    }

}
