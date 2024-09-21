class Box<T>{
    private T ob;
    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}

class Toy{
    @Override
    public String toString() {
        return "I am a Toy";
    }
}

class BoxContentsMover{
    //from 에 저장된 내용물울 to로 이동
    public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from){
        to.set(from.get());
    }
}

class MoveBoxContents{
    public static void main(String[] args) {
        Box<Toy> box1 = new Box<>();
        box1.set(new Toy());

        Box<Toy> box2 = new Box<>();

        BoxContentsMover.moveBox(box2,box1);

        System.out.println(box2.get());
    }
}