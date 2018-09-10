package AdapterPattern;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
		// TODO Auto-generated method stub
	}

	@Override
	public void playMp4(String filename) {
		// TODO Auto-generated method stub
		System.out.println("Playing mp4 file. Name: "+filename);
	}

}
