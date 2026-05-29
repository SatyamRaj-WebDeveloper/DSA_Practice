import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Collections{
    public static void main(String[] args) {
        //3 ways to create an ArrayList<>();
         ArrayList<Integer> arl = new ArrayList<>();
        //  List<Integer> arr = new ArrayList<>();
        //  Collection<Integer> ar1 = new ArrayList<>();

        arl.add(10);
        arl.add(20);
        arl.add(40);
        arl.add(50);
        System.err.println(arl);
        arl.remove(0);
        System.out.println(arl);

        //addAll --> Adds(pushes) all the elements of a list to another list
        List<Integer> list =  new ArrayList<>();
        list.addAll(arl);
        System.out.println(list);

        list.add(201);
        list.add(501);
        list.removeAll(arl); // removeAll() --> removes all the elements of any List from a List
        System.err.println(list);

        System.out.println(list.size());
        // arl.clear();
        // System.out.println(arl);
        
        //List Traversal using Iterator
        Iterator<Integer> itr = arl.iterator();
        while(itr.hasNext()){
            System.out.println("ELement :" + itr.next());
        }



    }
}