package BoundedWildcardDemo;

class Box<T>{
    private T ob;
    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}


public class BoundedWildcardDemo {
    public static void addBox(Box<? extends Integer> b1, Box<? extends Integer> b2, Box<? super Integer> b3){
        b3.set(b1.get() + b2.get());
    }

    public static void main(String[] args) {
        Box<Integer> box1 = new Box<Integer>();
        box1.set(24);
        Box<Integer> box2 = new Box<Integer>();
        box2.set(37);
        Box<Integer> result = new Box<Integer>();
        result.set(0);
        addBox(box1,box2,result);
        System.out.println(result.get());

    }
}
