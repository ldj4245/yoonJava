package generic2;


class Box3<T>{
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
    public static <T> T openBox(Box3<T> box){
        return box.get();
    }
    public static void peekBox(Box3<?> box){ //와일드 카드 사용
        System.out.println(box);
    }
}

public class WildcardUnboxer2 {
    public static void main(String[] args) {

//        Box3<Object> box2 = new Box3<>();
        Box3<String> box = new Box3<>();
        Box3<Integer> box2 = new Box3<>();
        box.set("So Simple String");
        box2.set(12345);

        Unboxer1.peekBox(box);
        Unboxer1.peekBox(box2);
    }
}
