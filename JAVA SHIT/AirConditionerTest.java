import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void testACCanTurnOn() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        assertTrue(ac.isOn());
    }

    @Test
    public void testACCanTurnOff() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.turnOff();
        assertFalse(ac.isOn());
    }

    @Test
    public void testIncreaseTemperature() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.increaseTemperature();
        assertEquals(17, ac.getTemperature());
    }

    @Test
    public void testDecreaseTemperature() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.decreaseTemperature();
        assertEquals(15, ac.getTemperature());
    }

    @Test
    public void testTemperatureCannotExceed30() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.setTemperature(30);
        ac.increaseTemperature();
        assertEquals(30, ac.getTemperature());
    }

    @Test
    public void testTemperatureCannotGoBelow16() {
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.setTemperature(16);
        ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());
    }
}
