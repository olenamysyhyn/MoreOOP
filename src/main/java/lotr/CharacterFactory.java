package lotr;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> classes = reflections.getSubTypesOf(Character.class);
        List<Class<? extends Character>> list = new ArrayList<>(classes);
        return list.get(new Random().nextInt(list.size())).newInstance();
    }
}