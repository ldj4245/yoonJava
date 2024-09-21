package generic;

class Box1<T extends Number>{
    private T ob;

    public void set(T o){
        ob = o;
    }

    public T get(){
        return ob;
    }
}


public class BoundedBox {
    public static void main(String[] args) {
        Box1<Integer> iBox = new Box1<>();

        iBox.set(24);

        Box1<Double> dBox = new Box1<>();
        dBox.set(5.97);

        System.out.println(iBox.get());
        System.out.println(dBox.get());
    }
}
