public class Stereo{

    private String name;
    private Radio radio;
    private CDPlayer cdPlayer;
    private RecordDeck recordDeck;
    private Mp3Player mp3Player;
    private Speakers speakers;

    public Stereo(String name) {
        this.name = name;
    }

    public String tuneRadio() {
        return radio.tune();
    }

    public String playCD() {
        return cdPlayer.play();
    }

    public String playRecord() {
        return recordDeck.record();
    }

    public String listenToMp3Player() {
        return mp3Player.playMp3();
    }

    public String connectSpeakers() {
        return speakers.musicPlaying();
    }

}
