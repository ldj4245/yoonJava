//package generic;
//
//
//class BOX5<T>{
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
//class Unboxer{
//    public static <T> T openBox(BOX5<T> box){
//        return box.get();
//    }
//}
//
//
//public class GenericMethodBoxMaker2 {
//    public static void main(String[] args) {
//        BOX5<String> box = new BOX5<>();
//        box.set("park");
//
//        String a = Unboxer.<String>openBox(box);
//
//        System.out.println("a = " + a);
//    }
//}
