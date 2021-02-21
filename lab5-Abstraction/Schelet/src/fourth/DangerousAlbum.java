package fourth;

public class DangerousAlbum extends Album {

    boolean isPrime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void addSong(Song s) {
        if(!isPrime(s.id)){
            list.add(s);
        }
    }
}
