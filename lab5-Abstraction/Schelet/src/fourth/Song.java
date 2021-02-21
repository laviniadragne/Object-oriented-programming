package fourth;

import java.util.Objects;

public class Song {

    String name;
    int id;
    String composer;

    public Song(String name, int id, String composer) {
        this.name = name;
        this.id = id;
        this.composer = composer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return id == song.id &&
                Objects.equals(name, song.name) &&
                Objects.equals(composer, song.composer);
    }

}
