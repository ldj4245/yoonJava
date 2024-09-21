//package generic;
//
//
//
//class Apple{
//    public String toString(){
//        return "I am an apple.";
//    }
//}
//
//class Orange {
//    public String toString(){
//        return "I am an orange.";
//    }
//}
//
//class Box<T>{
//    private T ob;
//
//    public void set(T o){
//        this.ob = o;
//    }
//
//    public T get(){
//        return ob;
//    }
//}
//
//
//public class FruitAndBox2_Generic {
//    public static void main(String[] args) {
//        Box<Apple> abox = new Box<>();
//        Box<Orange> oBox = new Box<>();
//
//        abox.set(new Apple());
//        oBox.set(new Orange());
//
//        Apple ap = abox.get();
//        Orange og  = oBox.get();
//
//
//        System.out.println(ap);
//        System.out.println(og);
//
//    }
//}
