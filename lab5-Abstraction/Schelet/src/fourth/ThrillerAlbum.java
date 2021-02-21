package fourth;

public class ThrillerAlbum extends Album{

    public void addSong(Song s) {
        if((s.id % 2 == 0) && (s.composer).equals("Michael Jackson"))
            list.add(s);
    }
}
