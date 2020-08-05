package adapter;

public class VLC implements MediaPackage {
    public void playFile(String filename) {
        System.out.println("Playing VLC File " + filename);
    }
}
