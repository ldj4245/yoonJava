package boundedGeneric;


class Box<T>{
    private T ob;
    public void set(T o){
        ob = o;
    }

    public T get(){
        return ob;
    }
}

class Toy{
    @Override
    public String toString() {
        return "I am Toy";
    }
}

class BoxHandler{
    public static void outBox(Box<Toy> box){
        Toy t = box.get(); //상자에서 꺼내기
        System.out.println(t);
    }

    public static void inBox(Box<Toy> box, Toy n){
        box.set(n);
    }
}


public class BoundedWildcardBase {
    public static void main(String[] args) {
        Box<Toy> box = new Box<>();
        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);
    }
}
