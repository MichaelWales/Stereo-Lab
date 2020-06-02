public class RecordDeck extends Component implements IConnect{

    public RecordDeck(String make, String model) {
        super(make, model);
    }

    public String record() {
        return "Record Player";
    }

    public String raiseVolume() {
        return "Record Playing Louder";
    }

    public String lowerVolume() {
        return "Record Playing Quieter";
    }

    public String connect(Stereo stereo) {
        return stereo.playRecord();
    }

}
