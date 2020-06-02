public class CDPlayer extends Component implements IConnect {

    public CDPlayer(String make, String model) {
        super(make, model);
    }

    public String play() {
        return "CD Player";
    }

    public String raiseVolume() {
        return "CD Volume Increased";
    }

    public String lowerVolume() {
        return "CD Volume Lowered";
    }

    public String connect(Stereo stereo) {
        return stereo.playCD();
    }
}
