package generic;


class Box5<T> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}


class BoxFactory1 {
    public static <T extends Number> Box5<T> makeBox(T o) {
        Box5<T> box = new Box5<>();
        box.set(o);

        System.out.println("Boxed data : " + o.intValue());

        return box;

    }
}

class Unboxer1{
    public static <T extends Number> T openBox(Box5<T> box){
        System.out.println("unboxed data :" + box.get().intValue());
        return box.get();
    }
}



public class BoundedGenericMethod {
    public static void main(String[] args) {
        Box5<Integer> sBox = BoxFactory1.makeBox((5959));

        int a = sBox.get();

        int n = Unboxer1.openBox(sBox);

        System.out.println("a = " + a);
        System.out.println("n = " + n);


    }
}
