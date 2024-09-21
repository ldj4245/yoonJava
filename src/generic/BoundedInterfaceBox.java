package generic;

interface Eatable{
    public String eat();
}

class Apple implements Eatable{
    @Override
    public String toString() {
        return "I am an apple.";
    }

    @Override
    public String eat() {
        return "Apple eat";
    }
}


class Box2<T extends Eatable>{
    T ob;

    public void set(T o){
        ob = o;
    }

    public T get(){
        System.out.println(ob.eat());
        return ob;
    }

}


public class BoundedInterfaceBox {
    public static void main(String[] args) {
        Box2<Apple> box2 = new Box2<>();

        box2.set(new Apple()); // 사과 저장

        Apple ap = box2.get();

        System.out.println("box2.get() = " + ap);
    }
}
