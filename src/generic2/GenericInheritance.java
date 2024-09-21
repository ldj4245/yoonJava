package generic2;

class Box<T>{
    protected T ob;

    public void set(T o){
        ob = o;
    }

    public T get(){
        return ob;
    }
}

class SteelBox<T> extends Box<T>{

    public SteelBox(T o ){
        ob = o;
    }
}

class GenericInheritance{
    public static void main(String[] args) {

        Box<Integer> iBox = new SteelBox<>(13);
        Box<String> sBox = new SteelBox<>("don't never i'm hold you");

        System.out.println("iBox.get() = " + iBox.get());
        System.out.println("sBox = " + sBox);
    }



}
