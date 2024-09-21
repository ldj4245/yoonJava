package generic;

class DDBox<U,D>{
    private U left;
    private D right;


    public void set(U u, D d){
        left = u;
        right =d;
    }

    @Override
    public String toString() {
        return "DDBox{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}

class DBox<L,R>{
    private L left;
    private R right;

    public void set(L o, R r){
        left = o;
        right = r;

    }

    @Override
    public String toString() {
        return "DBox{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}

public class exam21_1 {
    public static void main(String[] args) {
        DBox<String,Integer> box1 = new DBox<>();
        box1.set("Apple",25);

        DBox<String,Integer> box2 = new DBox<>();
        box2.set("Orange",33);

//        DDBox<DBox<String,Integer>,DBox<String,Integer>> ddBox = new DDBox<>();
//        ddBox.set(box1,box2);
//
//        System.out.println("ddBox = " + ddBox);

        DBox<DBox<String,Integer>,DBox<String,Integer>> box3 = new DBox<>();

        box3.set(box1,box2);

        System.out.println("box3 = " + box3);


    }



}
