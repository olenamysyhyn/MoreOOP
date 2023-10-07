package kick;

import lotr.Character;

public class ElfKick implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoIsKicked.getPower() < whoKick.getPower()) {
            whoIsKicked.setHp(0);
        } else {
            whoIsKicked.setPower(whoIsKicked.getPower() - 1);
        }
    }
}