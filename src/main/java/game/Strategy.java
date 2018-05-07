package game;

@FunctionalInterface
public interface Strategy {
    boolean sayStop(int currentValue);
}
