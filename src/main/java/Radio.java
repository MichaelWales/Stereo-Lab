public class Radio extends Component implements IConnect {

    public Radio(String make, String model) {
        super(make, model);
    }

    public String tune() {
        return "Clyde 1";
    }

    public String raiseVolume() {
        return "Radio Volume Up";
    }

    public String lowerVolume() {
        return "Radio Volume Down";
    }

    public String connect(Stereo stereo) {
        return stereo.tuneRadio();
    }

}
