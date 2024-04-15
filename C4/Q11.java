import java.util.*;
public class Q11 {
public static void main(String[] args){
System.out.println("Fidha Fathima Rollno:27 .date: 15-APR-24 ");
System.out.println();
LinkedList<String> L=new LinkedList<>();
L.add("Gold");
L.add("Silver");
L.add("Bronze");
L.add(0,"Olympics Medals");
System.out.println(L);
L.remove("Bronze");
System.out.println(L);
L.remove(2);
System.out.println(L);
L.removeLast();
System.out.println(L);
L.removeFirst();
System.out.println(L);

}
}
