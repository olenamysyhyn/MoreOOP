package kick;
import lotr.Character;

public class KnightKick implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        int damage = (int) (Math.random() * (whoKick.getPower() - 2 + 1)) + 2;
        int remainingHP = whoIsKicked.getHp() - damage;

        if (remainingHP < 0) {
            whoIsKicked.setHp(0);
        } else {
            whoIsKicked.setHp(remainingHP);
        }
    }
}

