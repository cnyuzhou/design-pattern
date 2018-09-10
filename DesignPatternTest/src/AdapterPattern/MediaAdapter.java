package AdapterPattern;

public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer=new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer=new Mp4Player();
		}
	}
	
	@Override
	public void play(String audioType, String filename) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVlc(filename);
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playMp4(filename);
		}
	}

}
