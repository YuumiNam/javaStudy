package chapter02;

public class SongMain {
	public static void main(String[] args) {
		Song s = new Song();
		
		s.setTitle("좋은날");
		s.setArtist("아이유");
		s.setAlbum("Real");
		s.setComposer("이민수");
		s.setYear(2010);
		s.setTrack(3);
		
		s.show();
	}
}
