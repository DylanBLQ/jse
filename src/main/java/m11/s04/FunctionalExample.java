package m11.s04;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalExample {
    public static void main(String[] args) {
        Runnable execute = () -> System.out.println("Hello Runnable");
        execute.run();

        Predicate<Integer> isPositive = (x) -> x > 0;
        if (isPositive.test(42)) {
            System.out.println("Hello Predicate");
        }

        Consumer<String> consume = s -> System.out.println(s);
        consume.accept("Hello Consumer");

        Function<String, Integer> size = String::length;
        System.out.println("Size of string passed to Function is " + size.apply("Hello Function"));

        BiFunction<String, Integer, String> multi = String::repeat;
        System.out.println("BiFunction: " + multi.apply("Function", 2));

        Supplier<Double> pi = () -> Math.PI;
        System.out.println("Supplier of PI: " + pi.get());

        UnaryOperator<Boolean> not = x -> !x;
        System.out.println("Unary Operator NOT on true: " + not.apply(true));

        BinaryOperator<Boolean> and = Boolean::logicalAnd;
        System.out.println("Binary Operator AND on true and false: " + and.apply(true, false));
    }
}
