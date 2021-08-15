package shopAndGoods;


import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import javax.naming.OperationNotSupportedException;

public class ShopTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNonExistingShelve() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("TestName", "TestCode");
        shop.addGoods("NonExistingShelve", goods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAlreadyTakenShelve() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("TestName", "TestCode");
        shop.addGoods("Shelves12", goods);
        shop.addGoods("Shelves12", goods);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testAddGoodsShouldFail() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("TestName", "TestCode");
        shop.addGoods("TestShelve", goods);
    }

    @Test
    public void testAddGoodsSuccessfully() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("TestName", "TestCode");
        shop.addGoods("Shelves1", goods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetAlreadyTakenShelve() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("TestName", "TestCode");
        shop.addGoods("TestShelf", goods);
        shop.getShelves().get("TestName");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExistingShelve() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("TestName", "TestCode");
        shop.addGoods("TestShelf", null);
        shop.getShelves().get("TestName");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveGoods() {
        Shop shop = new Shop();
        Goods goods = new Goods("TestName", "TestCode");
        shop.removeGoods("TestShelv", goods);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveNotExistingGoods() {
        Shop shop = new Shop();
        Goods goods = new Goods("TestName", "TestCode");
        shop.removeGoods("Shelves12", goods);
    }

    @Test
    public void testRemoveExistingGoods() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("TestName", "TestCode");
        shop.addGoods("Shelves12", goods);
        assertEquals("Goods: TestCode is removed successfully!", shop.removeGoods("Shelves12", goods));
    }


}