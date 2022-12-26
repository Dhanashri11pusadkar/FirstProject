package java8;
import java.util.ArrayList;
import java.util.Iterator;

public class StremTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add (1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        //numbers.add(6);
        numbers.add(7);
        numbers.add(9);
        numbers.add(10);
      /* Iterator it=numbers.iterator();
        while (it.hasNext());
        {
            System.out.println(it.hasNext());
        }*/
        int total_sum=(10*11);
        int sum_of_numbers=0;
                for (int i=0;i<numbers.size();i++)
                {
                    sum_of_numbers=sum_of_numbers+numbers.get(i);
                }
        System.out.println("total sum: "+total_sum);
        System.out.println("sum of numbers: "+sum_of_numbers);
        System.out.println("missing number from list is :"+(total_sum-sum_of_numbers));
    }
}
