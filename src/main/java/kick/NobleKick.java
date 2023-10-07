package kick;
import lotr.Character;

public class NobleKick implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        System.out.println("😢");
    }
}
