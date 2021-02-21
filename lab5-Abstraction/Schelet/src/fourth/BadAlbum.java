package fourth;

public class BadAlbum extends Album{

    boolean palindrom(int n) {

        int r, sum = 0, temp;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            return true;
        else
            return false;
    }

    public void addSong(Song s) {
        if((s.name.length() == 3) && (palindrom(s.id)))
            list.add(s);
    }
}
