package rpg_lab;

import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {

    @Test
    public void testDummyLosesHealthIfAttacked(){
        Dummy dummy = new Dummy(100, 100);

        dummy.takeAttack(10);

        assertEquals(90, dummy.getHealth());
    }

    @Test( expected = IllegalStateException.class)
    public void testDeadDummyThrowExceptionIfAttacked(){
        Dummy dummy = new Dummy(10, 100);
        dummy.takeAttack(11);
        dummy.takeAttack(11);
    }

    @Test
    public void testDeadDummyCanGiveExperience(){
        Dummy dummy = new Dummy(0, 100);

        assertEquals(100, dummy.giveExperience());
    }

    @Test (expected = IllegalStateException.class)
    public void testAliveDummyCannotGiveExperience(){
        Dummy dummy = new Dummy(1, 100);
        dummy.giveExperience();
    }
}