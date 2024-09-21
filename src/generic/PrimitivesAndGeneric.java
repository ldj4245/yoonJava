package generic;

class Box<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }

    public T get(){
        return ob;
    }
}



public class PrimitivesAndGeneric {
    public static void main(String[] args) {
        Box1<Integer> iBox = new Box1<>();

        iBox.set(124);

        int i = iBox.get();

        System.out.println(i);

    }
}
