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

class QueueBasics{
    public static void main(String[] args) {
        /*Prefered Methods --> 
         offer() to add ,
         poll() to return and remove the head of queue , 
         peek() to return the head of the queue*/
        Queue<Integer> q =  new LinkedList<>();
        Deque<Integer> dq = new ArrayDeque<Integer>();
        Queue<Integer> pq = new PriorityQueue<Integer>();
        
        //default behaviour --> Integers -> Less Value -> High Priority --> minheap
        //maxheap --> Integers --> high value --> highPriorioty
        /* To create a maxHeao :
           Queue<Integer>pq = new PriorityQueue<>((a,b)->b-a); */
        pq.offer(40);
        pq.offer(50);
        pq.offer(20);
        pq.offer(90);
        
        System.out.println(pq);
        System.out.println(pq.poll()); // 20 will be removed and returned 
        System.out.println(pq);
        System.out.println(pq.poll()); // 40 will be removed and returned 
        System.out.println(pq);
        
        dq.offerFirst(50);
        dq.offerFirst(80);
        dq.offerFirst(60);
        dq.offerFirst(200);
        dq.offerFirst(70);
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
        dq.pollLast();
        System.out.println(dq);
        System.out.println(dq.size());
        System.out.println(dq.peek());
        q.add(10);
        q.add(20);// add() --> returns exception if fails to add.
        q.offer(30);//offer --> is prefered because add() return exception if fails , but offer() does not
        q.offer(50);
        q.offer(90);
        q.offer(100);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}

class SetBasics{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new TreeSet<>();
        /* HashSet --> Unordered and Unsorted
           LinkedHashSet --> Ordered and Unsorted
           TreeSet --> Ordered and Sorted */
        set.add(10);
        set.add(10); // duplicate elements are not allowed
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set);
    }
}