package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BattleTest {
    @Test
    @DisplayName("1. Fight")
    void test01(){
        var carl = new Warrior();
        var jim = new Knight();

        var test = Battle.fight(carl,jim);

        assertFalse(test);
    }
    @Test
    @DisplayName("2. Fight ")
    void test02(){
        var ramon = new Knight();
        var slevin = new Warrior();


        var test = Battle.fight(ramon,slevin);

        assertTrue(test);

    }
    @Test
    @DisplayName("3. Fight ")
    void test03(){
        var bob = new Warrior();
        var mars = new Warrior();

        Battle.fight(bob,mars);
        boolean test = bob.isAlive();

        assertTrue(test);

    }
    @Test
    @DisplayName("4. Fight ")
    void test04(){
        var zeus = new Knight();
        var godkiller  = new Warrior();

        Battle.fight(zeus,godkiller);
        boolean test = zeus.isAlive();

        assertTrue(test);
    }
    @Test
    @DisplayName("5. Fight ")
    void test05(){
        var husband  = new Warrior();
        var wife   = new Warrior();

        Battle.fight(husband,wife);
        boolean test = wife.isAlive();

        assertFalse(test);
    }
    @Test
    @DisplayName("6. Fight ")
    void test06(){
        var dragon  = new Warrior();
        var knight  = new Knight();

        Battle.fight(dragon,knight);
        boolean test = knight.isAlive();

        assertTrue(test);
    }
    @Test
    @DisplayName("7. Fight")
    void test13(){
        var unit_1 =  new Warrior();
        var unit_2 =  new Knight();
        var unit_3 = new Warrior();

       var test = Battle.fight(unit_1,unit_2);
       assertFalse(test);

       var test1 = Battle.fight(unit_2,unit_3);
       assertFalse(test1);
    }
    @Test
    @DisplayName("8. Fight")
    void test23(){
        var unit1 = new Defender();
        var unit2 = new Rookie();

        var result = Battle.fight(unit1,unit2);
        assertTrue(result);

        var result1 = unit1.getHealth();
        assertEquals(60,result1);
    }

    @Test
    @DisplayName("9. Fight")
    void test24(){
        var unit1 = new Defender();
        var unit2 = new Rookie();
        var unit3 = new Warrior();

        var result = Battle.fight(unit1,unit2);
        assertTrue(result);

        var result1 = Battle.fight(unit1,unit3);
        assertTrue(result1);
    }
    @Test
    @DisplayName("10. Fight")
    void test18(){
        var chuck = new Warrior();
        var bruce = new Warrior();
        var carl = new Knight();
        var dave = new Warrior();
        var mark = new Warrior();
        var bob = new Defender();
        var mike = new Knight();
        var rog = new Warrior();
        var lancelot = new Defender();

        assert Battle.fight(chuck, bruce) == true;
        assert Battle.fight(dave, carl) == false;
        assert chuck.isAlive() == true;
        assert bruce.isAlive() == false;
        assert carl.isAlive() == true;
        assert dave.isAlive() == false;
        assert Battle.fight(carl, mark) == false;
        assert carl.isAlive() == false;
        assert Battle.fight(bob, mike) == false;
        assert Battle.fight(lancelot, rog) == true;

        var myArmy = new Army();
        myArmy.addUnits("Defender", 1);

        var enemyArmy = new Army();
        enemyArmy.addUnits("Warrior", 2);

        var army3 = new Army();
        army3.addUnits("Warrior", 1);
        army3.addUnits("Defender", 1);

        var army4 = new Army();
        army4.addUnits("Warrior", 2);

        var result = Battle.fight(myArmy,enemyArmy);
        var result1 = Battle.fight(army3,army4);

        assertFalse(result);
        assertTrue(result1);
    }

    @Test
    @DisplayName("11. Fight")
    void test19(){
        var chuck = new Warrior();
        var bruce = new Warrior();
        var carl = new Knight();
        var dave = new Warrior();
        var mark = new Warrior();
        var bob = new Defender();
        var mike = new Knight();
        var rog = new Warrior();
        var lancelot = new Defender();
        var eric = new Vampire();
        var adam = new Vampire();
        var richard = new Defender();
        var ogre = new Warrior();

        assert Battle.fight(chuck, bruce) == true;
        assert Battle.fight(dave, carl) == false;
        assert chuck.isAlive() == true;
        assert bruce.isAlive() == false;
        assert carl.isAlive() == true;
        assert dave.isAlive() == false;
        assert Battle.fight(carl, mark) == false;
        assert carl.isAlive() == false;
        assert Battle.fight(bob, mike) == false;
        assert Battle.fight(lancelot, rog) == true;
        assert Battle.fight(eric, richard) == false;
        assert Battle.fight(ogre, adam) == true;
    }


    @Test
    @DisplayName("1. Battle ")
    void test07(){
        var army_1   = new Army();
        var army_2   = new Army();

        army_1.addUnits("Warrior",1);
        army_2.addUnits("Warrior",2);
        var test = Battle.fight(army_1,army_2);

        assertFalse(test);
    }
    @Test
    @DisplayName("2. Battle ")
    void test08(){
        var army_1   = new Army();
        var army_2   = new Army();

        army_1.addUnits("Warrior",2);
        army_2.addUnits("Warrior",3);
        var test = Battle.fight(army_1,army_2);

        assertFalse(test);
    }
    @Test
    @DisplayName("3. Battle ")
    void test09(){
        var army_1   = new Army();
        var army_2   = new Army();

        army_1.addUnits("Warrior",5);
        army_2.addUnits("Warrior",7);
        var test = Battle.fight(army_1,army_2);

        assertFalse(test);
    }

    @Test
    @DisplayName("4. Battle ")
    void test10(){
        var army_1   = new Army();
        var army_2   = new Army();

        army_1.addUnits("Warrior",20);
        army_2.addUnits("Warrior",21);
        var test = Battle.fight(army_1,army_2);

        assertTrue(test);
    }
    @Test
    @DisplayName("5. Battle ")
    void test11(){
        var army_1   = new Army();
        var army_2   = new Army();

        army_1.addUnits("Warrior",10);
        army_2.addUnits("Warrior",11);
        var test = Battle.fight(army_1,army_2);

        assertTrue(test);
    }
    @Test
    @DisplayName("6. Battle ")
    void test12(){
        var army_1   = new Army();
        var army_2   = new Army();

        army_1.addUnits("Warrior",11);
        army_2.addUnits("Warrior",7);
        var test = Battle.fight(army_1,army_2);

        assertTrue(test);
    }
    @Test
    @DisplayName("7. Battle")
    void test14(){
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits("Defender",5);
        army_1.addUnits("Warrior",20);
        army_2.addUnits("Warrior",21);
        army_1.addUnits("Defender",4);

        var result = Battle.fight(army_1,army_2);
        assertTrue(result);

    }
    @Test
    @DisplayName("8. Battle")
    void test15(){
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits("Defender",5);
        army_1.addUnits("Warrior",20);
        army_2.addUnits("Warrior",21);
        army_1.addUnits("Defender",4);

        var result = Battle.fight(army_1,army_2);
        assertTrue(result);

    }
    @Test
    @DisplayName("9. Battle")
    void test16(){
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits("Warrior",10);
        army_1.addUnits("Defender",5);
        army_2.addUnits("Warrior",5);
        army_1.addUnits("Defender",10);

        var result = Battle.fight(army_1,army_2);
        assertTrue(result);

    }
    @Test
    @DisplayName("10. Battle")
    void test17(){
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits("Defender",2);
        army_1.addUnits("Warrior",1);
        army_1.addUnits("Defender",1);
        army_2.addUnits("Warrior",5);

        var result = Battle.fight(army_1,army_2);
        assertFalse(result);

    }


    @Test
    @DisplayName("11. Battle")
    void test20(){
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits("Defender", 12);
        army_1.addUnits("Vampire", 6);
        army_1.addUnits("Warrior", 7);
        army_2.addUnits("Warrior", 6);
        army_2.addUnits("Defender", 12);
        army_2.addUnits("Vampire", 6);

        var result = Battle.fight(army_1,army_2);
        assertTrue(result);
    }
    @Test
    @DisplayName("12. Battle")
    void test21(){
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits("Defender", 2);
        army_1.addUnits("Vampire", 3);
        army_1.addUnits("Warrior", 4);
        army_2.addUnits("Warrior", 4);
        army_2.addUnits("Defender", 4);
        army_2.addUnits("Vampire", 3);

        var result = Battle.fight(army_1,army_2);
        assertFalse(result);
    }
    @Test
    @DisplayName("13. Battle")
    void test22(){
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits("Defender", 11);
        army_1.addUnits("Vampire", 3);
        army_1.addUnits("Warrior", 4);
        army_2.addUnits("Warrior", 4);
        army_2.addUnits("Defender", 4);
        army_2.addUnits("Vampire", 13);

        var result = Battle.fight(army_1,army_2);
        assertTrue(result);
    }
    @Test
    @DisplayName("14. Battle")
    void test25(){
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits("Defender", 9);
        army_1.addUnits("Vampire", 3);
        army_1.addUnits("Warrior", 8);
        army_2.addUnits("Warrior", 4);
        army_2.addUnits("Defender", 4);
        army_2.addUnits("Vampire", 13);

        var result = Battle.fight(army_1,army_2);
        assertTrue(result);
    }
    @Test
    @DisplayName("15. Battle")
    void test26(){
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits("Vampire", 1);
        army_1.addUnits("Vampire", 2);
        army_1.addUnits("Vampire", 3);
        army_1.addUnits("Vampire", 4);
        army_2.addUnits("Vampire", 1);
        army_2.addUnits("Vampire", 2);
        army_2.addUnits("Vampire", 3);
        army_2.addUnits("Vampire", 4);


        var result = Battle.fight(army_1,army_2);
        assertFalse(result);
    }
    @Test
    @DisplayName("16. Battle")
    void test27(){
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits("Lancer", 7);
        army_1.addUnits("Vampire", 3);
        army_1.addUnits("Warrior", 4);
        army_1.addUnits("Defender", 2);
        army_2.addUnits("Warrior", 4);
        army_2.addUnits("Defender", 4);
        army_2.addUnits("Vampire", 6);
        army_2.addUnits("Lancer", 4);

        var result = Battle.fight(army_1,army_2);
        assertTrue(result);
    }
    @Test
    @DisplayName("17. Battle")
    void test28(){
        var army_1 = new Army();
        var army_2 = new Army();

        army_1.addUnits("Lancer", 7);
        army_1.addUnits("Lancer", 3);
        army_1.addUnits("Lancer", 4);
        army_1.addUnits("Lancer", 2);
        army_2.addUnits("Lancer", 4);
        army_2.addUnits("Lancer", 4);
        army_2.addUnits("Lancer", 6);
        army_2.addUnits("Lancer", 2);

        var result = Battle.fight(army_1,army_2);
        assertTrue(result);
    }

}