public class Mp3Player extends Component implements IConnect {

    public Mp3Player(String make, String model) {
        super(make, model);
    }

    public String connect(Stereo stereo) {
        return stereo.listenToMp3Player();
    }

    public String lowerVolume() {
        return "MP3 Volume Turned Down";
    }

    public String raiseVolume() {
        return "MP3 Volume Turned Up";
    }

    public String playMp3() {
        return "Mp3 Player";
    }

}
