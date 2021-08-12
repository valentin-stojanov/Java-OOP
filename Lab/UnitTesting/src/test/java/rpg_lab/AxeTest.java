package rpg_lab;

import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {
    //A -> Arrange
    //A -> Act
    //A -> Assert

    @Test
    public void testAxeLosesDurabilityAfterEachAttack() {
        Axe axe = new Axe(10, 10);
        Dummy dummy = new Dummy(100, 100);

        axe.attack(dummy);

        assertEquals(9, axe.getDurabilityPoints());
    }

    @Test (expected = IllegalStateException.class)
    public void testAttackWithBrokenWeapon(){
        Axe axe = new Axe(10, 0);
        Dummy dummy = new Dummy (100, 100);

        axe.attack(dummy);
    }


}