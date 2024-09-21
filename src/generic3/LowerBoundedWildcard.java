package generic3;


class Box1<T>{
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

class Unboxer1{
    public static void peekBox(Box1<? super Integer> box){
        System.out.println(box);
    }
}


public class LowerBoundedWildcard {
    public static void main(String[] args) {
        Box1<Integer> iBox = new Box1<>();
        iBox.set(5577);

        Box1<Number> nBox = new Box1<>();
        nBox.set(12345);

        Box1<Object> oBox = new Box1<>();
        oBox.set("My Simple Instance");

        Unboxer1.peekBox(iBox);
        Unboxer1.peekBox(nBox);
        Unboxer1.peekBox(oBox);
    }
}
