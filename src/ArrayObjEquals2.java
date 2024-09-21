class INum1 {
    private int num;

    public INum1(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.num == ((INum1)obj).num){
            return true;
        }else{
            return false;
        }
    }
}


public class ArrayObjEquals2 {
    public static void main(String[] args) {

    }
}
