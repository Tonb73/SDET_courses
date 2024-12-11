@FunctionalInterface
public interface IPredicate<T extends Number> {
    boolean test(T number);
}
