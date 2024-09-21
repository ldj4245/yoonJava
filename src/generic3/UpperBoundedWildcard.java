package generic3;


class Box<T>{
    private T ob;
    public void set(T o){
        ob = o;
    }

    public T get(){
        return ob;
    }

    @Override
    public String toString() {
        return ob.toString();
    }
}

class Unboxer{

    public static void peekBox(Box<? extends Number> box){
        System.out.println(box);
    }
}


public class UpperBoundedWildcard {
    public static void main(String[] args) {
        Box<String> box2 = new Box<>();
        box2.set("hello");

        Box<Integer> box = new Box<>();
        box.set(12345);

        Unboxer.peekBox(box);
//        Unboxer.peekBox(box2);
    }
}
