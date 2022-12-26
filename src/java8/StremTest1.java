package java8;
import java.util.ArrayList;
import java.util.Iterator;
public class StremTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        ArrayList<Integer> even_numbers=new ArrayList<>();
        ArrayList<Integer> odd_numbers=new ArrayList<>();
        for(int i=1;i<=50;i++)
        {
            numbers.add(i);
        }
        System.out.println("Even numbers");
        for(Integer i:numbers)
        {
            if (i%2==0)
            even_numbers.add(i);
        }
        Iterator it= even_numbers.iterator();
         while(it.hasNext())
         {
             System.out.println(it.next());
         }
        System.out.println("odd numbers");
        for (Integer i:numbers)
        {
            if (i%2!=0)
                odd_numbers.add(i);
        }
        Iterator it2=odd_numbers.iterator();
        while(it2.hasNext())
        {
            System.out.println(it2.next());
        }
    }
}
