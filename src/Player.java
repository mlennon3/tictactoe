/**
 * Created by mslennon on 3/9/14.
 */
public class Player {
    private String name;
    private final String piece;

    Player(String piece, String name) {
        this.piece = piece;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPiece() {
        return piece;
    }
}
