public class GenericBox<T> implements IStorage<T> {
    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        if(this.item instanceof Gun){
            ((Gun)item).showGunInfo();
        }
        return this.item;
    }



}
