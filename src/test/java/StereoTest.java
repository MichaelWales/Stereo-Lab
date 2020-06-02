import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;

    @Before
    public void before() {
        stereo = new Stereo("Stereo-Max 1000");
    }

    @Test
    public void canTuneRadio() {
        assertEquals("Clyde 1", stereo.tuneRadio());
    }

    @Test
    public void canPlayCD() {
        assertEquals("CD Player", stereo.playCD());
    }

    @Test
    public void canPlayRecord() {
        assertEquals("Record Player", stereo.playRecord());
    }

    @Test
    public void canListenToMp3Player() {
        assertEquals("MP3 Player", stereo.listenToMp3Player());
    }

    @Test
    public void canConnectSpeakers() {
        assertEquals("La Dee Da!", stereo.connectSpeakers());
    }

}
