package bicycle;

import org.junit.Assert;
import org.junit.Test;

public class BicycleTest {

    @Test
    public void constructorBicycleTest() {

        Bicycle c = new Bicycle(1, 10, 20);
        c.setCadence(8);
        c.setGear(3);
        c.setSpeed(40);
        
        Assert.assertEquals(9, c.cadence);
        Assert.assertEquals(13, c.gear);
        Assert.assertEquals(60, c.speed);

        c.applyBrake(30);
        Assert.assertEquals(30, c.speed);

        c.applyBrake(30);
        Assert.assertEquals(0, c.speed);
        
        Assert.assertEquals("Stopped", c.stop(c.speed));

        c.speedUp(100);
        c.applyBrake(90);
        Assert.assertEquals(10, c.speed);


    }
}