package lotr;
import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kickStrategy;

    public void kick(Character whoKicked) {
        kickStrategy.kick(this, whoKicked);
    }


    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}

