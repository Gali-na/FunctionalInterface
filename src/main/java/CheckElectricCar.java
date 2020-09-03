/*
 * <p> Реализуйте подходящий функциональный интерфейс и
 * переопределите его метод, выполняющий проверку
 * установлен ли EngineType.ELECTRIC на авто. Метод должен
 * принимать Car. </p>
 * /
 */
import java.util.function.Predicate;

public class CheckElectricCar implements Predicate<Car> {

    @Override
    public boolean test(Car car) {
        if (car.getEngine().getEngineType() == EngineType.ELECTRIC) {
            return true;
        }
        return false;
    }
}

