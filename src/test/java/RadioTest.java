import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Philips", "R-100");
    }

    @Test
    public void canTuneRadio() {
        assertEquals("Clyde 1", radio.tune());
    }

    @Test
    public void hasModel() {
        assertEquals("R-100", radio.getModel());
    }

    @Test
    public void hasMake() {
        assertEquals("Philips", radio.getMake());
    }

}
