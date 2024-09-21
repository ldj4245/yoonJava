package generic;

class Box4<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }

    public T get(){
        return ob;
    }
}


class BoxFactory{
    public static <T> Box4<T> makeBox(T o){
        Box4<T> box = new Box4<>();
        box.set(o);
        return box;
    }
}



public class GenericMethdBoxMaker {
    public static void main(String[] args) {
        Box4<String> box4 = BoxFactory.makeBox("Sweet");

        System.out.println("box4.get() = " + box4.get());

        Box4<Double> dBox = BoxFactory.makeBox(1.3);

        System.out.println("dBox.get() = " + dBox.get());


    }
}
