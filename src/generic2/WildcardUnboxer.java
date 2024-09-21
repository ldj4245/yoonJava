package generic2;



class Box2<T>{
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

    public static <T> T openBox(Box2<T> box){
        return box.get();
    }

    //상자 안의 내용들을 확인하는 (출력하는) 기능의 제네릭 메소드
    public static <T> void peekBox(Box2<T> box){
        System.out.println(box);

    }



}



public class WildcardUnboxer {
    public static void main(String[] args) {
        Box2<String> box = new Box2<>();

        box.set("박효신");

        Unboxer.peekBox(box);

        System.out.println("Unboxer.openBox(box) = " + Unboxer.openBox(box));


    }
}
