package AdapterPattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audioPlayer=new AudioPlayer();
		
		audioPlayer.play("mp3", "test.mp3");
		audioPlayer.play("mp4", "test.mp4");
		audioPlayer.play("vlc", "test.vlc");
		audioPlayer.play("avi", "test.avi");
	}

}
