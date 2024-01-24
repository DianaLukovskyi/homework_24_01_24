package our_interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Homework {
    public static void main(String[] args) {
        Concatable concatable = (a, b) -> Integer.toString(a) + b;
        System.out.println(concatable.concat(1, 3));

        Predicate <String> checkable = s -> s.length() == 3;
        System.out.println(checkable.test("abc"));
        System.out.println(checkable.test("abcd"));

        System.out.println("checkable even");
        Predicate <String> checkable1 =  s -> s.length() % 2 == 0;
        System.out.println(checkable1.test("abc"));
        System.out.println(checkable1.test("abcd"));

        Function <String, String> toUpperCase = String :: toUpperCase;
        System.out.println(toUpperCase.apply("abcde"));

        Function <String,String>  transformable1 = s -> s.length() == 4 ? "****" : s;
        System.out.println(transformable1.apply("ab"));
        System.out.println(transformable1.apply("abcd"));

       Consumer<String> printable = s -> System.out.println("!" + s + "!");
        printable.accept("Hello");

       Supplier<String> producable = () -> "Hello World";
        System.out.println(producable.get());
    }
}
