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
		
		
		Song s2 = new Song("LoveDive", "IVE", "LoveDive", "Jamie Parker외 3명", 2022, 1);
		s2.show();
		
		Song s3 = new Song("사건의지평선", "윤하");
		s3.show();
	}
}
