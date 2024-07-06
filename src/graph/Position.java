package graph;

public interface Position<E> {
    E getElement() throws IllegalStateException;
}
