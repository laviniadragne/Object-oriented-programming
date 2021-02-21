package fourth;

import java.util.ArrayList;

public abstract class Album {

    ArrayList<Song> list;

    public Album() {
        list = new ArrayList<>();
    }
    abstract void addSong(Song s);

    void removeSong(Song removed){
        for(int i = 0; i < list.size(); i++){
            Song song = list.get(i);
            if(song.equals(removed)) {
                list.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder toPrint = new StringBuilder();
        int i;

        for(i = 0; i < list.size(); i++){
            toPrint.append(list.get(i).name);
            toPrint.append(" ");
            toPrint.append(list.get(i).id);
            toPrint.append(" ");
            toPrint.append(list.get(i).composer);
            toPrint.append(" ");

        }
        return toPrint.toString();

    }
}
