package aquarium;

import org.junit.Test;

import static org.junit.Assert.*;

public class AquariumTest {

    @Test (expected = NullPointerException.class)
    public void emptyNameShouldThrowException(){
        Aquarium aquarium = new Aquarium("", 10);
    }

    @Test (expected = NullPointerException.class)
    public void whitespaceNameShouldThroeException(){
        Aquarium aquarium = new Aquarium(null, 10);
    }

    @Test
    public void testSetCorrectName(){
        Aquarium aquarium = new Aquarium("TestName", 10);
        assertEquals( "TestName", aquarium.getName());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNegativeCapacityShouldThrowException(){
        Aquarium aquarium = new Aquarium("TestName", -1);
    }

    @Test
    public void testSetCorrectCapacity(){
        Aquarium aquarium = new Aquarium("TestName", 10);
        assertEquals(10, aquarium.getCapacity());
    }

    @Test
    public void testAddFish(){
        Aquarium aquarium = new Aquarium("TestName", 10);
        Fish fish = new Fish("TestFish");
        aquarium.add(fish);
        assertEquals(1, aquarium.getCount());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAddFishToFullAquarium(){
        Aquarium aquarium = new Aquarium("TestName", 0);
        Fish fish = new Fish("TestFish");
        aquarium.add(fish);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveFishFromEmptyAquarium(){
        Aquarium aquarium = new Aquarium("TestName", 0);
        aquarium.remove("TestFish");
    }

    @Test
    public void testRemoveFishFromAquarium(){
        Aquarium aquarium = new Aquarium("TestName", 1);
        Fish fish = new Fish("TestFish");
        aquarium.add(fish);
        aquarium.remove("TestFish");
        assertEquals(0, aquarium.getCount());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSellFishShouldThrowException(){
        Aquarium aquarium = new Aquarium("TestName", 1);

        aquarium.sellFish("TestFish");
    }

    @Test
    public void testSellFish(){
        Aquarium aquarium = new Aquarium("TestName", 1);
        Fish fish = new Fish("TestFish");
        aquarium.add(fish);
        assertEquals(fish, aquarium.sellFish("TestFish"));
    }

    @Test
    public void testReport(){
        Aquarium aquarium = new Aquarium("TestName", 1);
        Fish fish = new Fish("TestFish");
        aquarium.add(fish);
        aquarium.sellFish("TestFish");
        assertFalse(fish.isAvailable());
    }



}

