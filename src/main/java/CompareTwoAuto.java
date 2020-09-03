
/*
 * <p> Реализовать подходящий функциональный интерфейс и переопределить его метод
 * для сравнения мощности двигателей двух автомобилей (enginePower)
 * и верните разницу между ними. Метод должен принимать целое число. </p>
 * /
 */

import java.util.function.BiFunction;

public class CompareTwoAuto implements BiFunction<Integer, Integer, Integer> {
    @Override
    public Integer apply(Integer integer, Integer integer2) {
        return integer - integer2;
    }
}


