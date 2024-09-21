//import java.util.Arrays;
//import java.util.Comparator;
//
//class Person implements Comparable{
//    private String name;
//    private int age;
//
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        Person p = (Person) o;
//        return this.name.length() - p.name.length();
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}
//
//
//
//public class ArrayObjSort {
//    public static void main(String[] args) {
//
//        Person [] ar = new Person[3];
//        ar[0] = new Person("Leasdsadsd", 29);
//        ar[1] = new Person("Goodds", 15);
//        ar[2] = new Person("Soosdadad", 37);
//
//
//        Arrays.sort(ar);
//
//
//
//        for (Person person : ar) {
//            System.out.println(person.toString());
//        }
//
//    }
//
//}
