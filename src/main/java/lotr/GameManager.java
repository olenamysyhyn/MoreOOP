package lotr;
import java.util.Random;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println("Big fight between:");
        System.out.println("Our first Character: " + c1.toString());
        System.out.println("Our second Character: " + c2.toString());
        System.out.println("Sooo the battle 🦶😲🥳 begins!!!");

        Random random = new Random();

        while (c1.getHp() > 0 && c2.getHp() > 0) {
            int c1AttackPower = random.nextInt(c1.getPower()) + 1;
            c1.kick(c2);
            System.out.println(c1.getClass().getSimpleName() + " attacks😵 " + c2.getClass().getSimpleName() + " with " + c1AttackPower + " damage😔");

            if (c2.getHp() <= 0) {
                System.out.println("Unfortunatelly " + c2.getClass().getSimpleName() + " has been defeated😩😩😩!");
                break;
            }

            int c2AttackPower = random.nextInt(c2.getPower()) + 1;
            c2.kick(c1);
            System.out.println(c2.getClass().getSimpleName() + " attacks😵 " + c1.getClass().getSimpleName() + " with " + c2AttackPower + " damage😔");

            if (c1.getHp() <= 0) {
                System.out.println("Unfortunatelly " + c1.getClass().getSimpleName() + " has been defeated😩😩😩!");
                break;
            }
        }

        System.out.println("🎉🎉🎉🎉🎉🎉🎉🎉Finally battle is over🎉🎉🎉🎉🎉🎉🎉🎉");
    }

    public static void main(String[] args) {
        Character character1 = CharacterFactory.createCharacter();
        Character character2 = CharacterFactory.createCharacter();

        fight(character1, character2);
    }
}
