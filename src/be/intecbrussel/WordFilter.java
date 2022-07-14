package be.intecbrussel;

@FunctionalInterface
public interface WordFilter {
    public boolean isValid(String s);
}
