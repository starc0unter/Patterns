package adapter;

public class FormatAdapter implements MediaPlayer {
    private final MediaPackage media;

    public FormatAdapter(MediaPackage m) {
        media = m;
    }

    public void play(String filename) {
        System.out.print("Using Adapter --> ");
        media.playFile(filename);
    }
}
