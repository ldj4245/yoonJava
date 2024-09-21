package generic;


class Box6<T> {
    private T ob;
    public void set(T o){ ob = o;}
    public T get(){ return ob;}
}


class BoxSwapDemo {
    // 이 위치에 정의
    public static <T extends Number> void swapBox(Box6<T> box1, Box6<T> box2){

        T temp = box1.get();

        box1.set(box2.get());
        box2.set(temp);



    }

    public static void main(String[] args) {

        Box6<Integer> box1 = new Box6<>();
        box1.set(99);

        Box6<Integer> box2= new Box6<>();
        box2.set(55);

        System.out.println(box1.get() + ""  + box2.get());

        swapBox(box1,box2);

        System.out.println(box1.get() + " " + box2.get());

    }

}
