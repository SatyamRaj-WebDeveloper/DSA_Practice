import java.util.*;

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
        // Iterator<Integer> itr = arl.iterator();
        // while(itr.hasNext()){
        //     System.out.println("ELement :" + itr.next());
        // }
        
        LinkedList<Integer> linkList = new LinkedList<>();
        linkList.add(40);
        linkList.add(30);
        linkList.add(10);
        linkList.add(80);

        //addFirst() and addLast()
        linkList.addFirst(100);
        linkList.addLast(90);
        System.out.println(linkList);
        
        System.out.println(linkList.poll());
        linkList.offer(3); // offer() adds element to the last of the list 
        System.out.println(linkList);

    }
}