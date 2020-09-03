import java.util.function.Function;

/**
 * * <p> Реализовать подходящий функциональный интерфейс и переопределить его метод
 * * который принимает вес автомобиля и возвращает тип автомобиля в зависимости от веса
 * * (если вес меньше 1500, то АВТО, если нет, то АВТО).
 * * Метод должен принимать целое число и возвращать автотип. </p>
 */
public class ChangeToCar implements Function<Integer, AutoType> {
    @Override
    public AutoType apply(Integer weight) {
        Function<Integer, AutoType> defineType = (testingWeight)
                -> (weight < 1500) ? AutoType.CAR : AutoType.TRUCK;
        return defineType.apply(weight);
    }

}

