package org.example;

import java.util.*;

public class Army  {

List<Warrior> troops = new ArrayList<>();
    void addUnits(String unitType, int quantity) {
        switch (unitType) {
            case "Warrior":
                for (int i = 0; i < quantity; i++) {
                    troops.add(new Warrior());
                }
                break;

            case "Knight":
                for (int i = 0; i < quantity; i++) {
                    troops.add(new Knight());
                }
                break;

            case "Defender":
                for(int i=0;i<quantity;i++){
                    troops.add(new Defender());
                }
                break;

            case "Vampire":
                for(int i=0;i<quantity;i++){
                    troops.add(new Vampire());
                }
                break;

            case "Lancer":
                for(int i=0;i<quantity;i++){
                    troops.add(new Lancer());
                }
                break;

            case "Healer":
                for(int i=0;i<quantity;i++){
                    troops.add(new Healer());
                }
                break;
        }
    }
    void deadthUnits(){
        troops.remove(0);
    }

}
