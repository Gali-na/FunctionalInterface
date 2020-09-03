import java.util.Random;
import java.util.function.Supplier;

/* * <p> Реализуйте подходящий функциональный интерфейс и переопределите его метод, который должен
 * вернуть случайный цвет из заданного массива - `COLORS` </p>
 */
public class RandomColor implements Supplier<String> {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "pink",
            "black", "white"};

    @Override
    public String get() {
        Random random = new Random();
        int n = random.nextInt(COLORS.length - 1);
        return COLORS[n];
    }
}
