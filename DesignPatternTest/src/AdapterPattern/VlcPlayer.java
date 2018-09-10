package AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String filename) {
		// TODO Auto-generated method stub
		System.out.println("Playing vlc file. Name: "+filename);
	}

	@Override
	public void playMp4(String filename) {
		// TODO Auto-generated method stub
	}

}
