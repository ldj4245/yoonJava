package boundedWildcardUsage2;


class Box<T> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}

class Toy{
    @Override
    public String toString() {
        return "I am a Toy";
    }
}

class BoxHandler{
    public static void outBox(Box<? extends Toy> box){
        Toy t = box.get();
        System.out.println(t);
    }
    public static void inBox(Box<? super Toy> box, Toy n){

        Object t = box.get();
        box.set(n);
    }
}

public class BoundedWildcardUsage2 {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        box.set(new Toy());

        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);
    }
}
