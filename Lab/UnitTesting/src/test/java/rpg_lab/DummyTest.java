package rpg_lab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {

    private static final int DUMMY_HEALTH = 100;
    private static final int DUMMY_EXPERIENCE = 100;
    private static final int ATTACK_POINT = 10;


    private Dummy dummy;
    private Dummy deadDummy;

    @Before
    public void initializeTestObject() {
        this.dummy = new Dummy(DUMMY_HEALTH, DUMMY_EXPERIENCE);
        this.deadDummy = new Dummy(0, DUMMY_EXPERIENCE);
    }

    @Test
    public void testDummyLosesHealthIfAttacked() {
        dummy.takeAttack(ATTACK_POINT);
        assertEquals(DUMMY_HEALTH - ATTACK_POINT, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testDeadDummyThrowExceptionIfAttacked() {
        deadDummy.takeAttack(ATTACK_POINT);
    }

    @Test
    public void testDeadDummyCanGiveExperience() {

        assertEquals(DUMMY_EXPERIENCE, deadDummy.giveExperience());
    }

    @Test(expected = IllegalStateException.class)
    public void testAliveDummyCannotGiveExperience() {
        dummy.giveExperience();
    }
}