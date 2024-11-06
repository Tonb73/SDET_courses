public interface IStorage<T> {
    void setItem(T item);

    T getItem();

}
