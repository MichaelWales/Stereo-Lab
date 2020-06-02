public class Speakers implements IConnect{

    public String connect(Stereo stereo) {
        return stereo.connectSpeakers();
    }

    public String musicPlaying() {
        return "La Dee Da!";
    }

}
