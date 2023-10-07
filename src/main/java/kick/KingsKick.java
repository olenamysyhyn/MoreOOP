package kick;
import lotr.Character;

public class KingsKick implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        int damage = (int) (Math.random() * (whoKick.getPower() - 5 + 1)) + 5;
        int remainingHP = whoIsKicked.getHp() - damage;
        if (remainingHP < 0) {
            whoIsKicked.setHp(0);
        } else {
            whoIsKicked.setHp(remainingHP);
        }
    }
}
