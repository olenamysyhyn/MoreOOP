package lotr;
// import kick.KingsKick;
import kick.KnightKick;

public class Knight extends Character {
    public Knight() {
        super(2, 12, new KnightKick());
    }
}
