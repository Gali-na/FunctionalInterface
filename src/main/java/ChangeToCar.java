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
        if(weight < 1500) {
            return AutoType.CAR;
        }
        else return AutoType.TRUCK;
    }
}


