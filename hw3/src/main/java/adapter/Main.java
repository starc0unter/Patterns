package adapter;

public class Main {

    public static void main(String[] args) {
        MediaPlayer player = new MP3();
        player.play("file.mp3");
        player = new FormatAdapter(new MP4());
        player.play("file.mp4");
        player = new FormatAdapter(new VLC());
        player.play("file.avi");
    }

}
