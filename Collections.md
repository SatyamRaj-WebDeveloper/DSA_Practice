# JAVA COLLECTION FRAMEWORK 
  The Java collections framework provides a set of interfaces and classes to implement various data structure and algorithms.
  The Java Collections framework provides various interfaces . 
  These interfaces include several methods to perform different operations 
  on collections.


# Common Methods of All the collections :
  add() , size() , remove() , iterator();
  addAll() , removeAll() , clear()


## LIST INTERFACE

# List Interface includes classes such as :- 
  1.  ArrayList
  2. LinkedList
  3. Stack
  4. Vector

# Methods specific to List Interface:
  add() , addAll() , get() , iterator() , set() , remove() , clear() , size() ,
  toArray() , conatins()

1. ARRAYLIST (More methods specific to ArrayList --> size() , sort() , clone() ,
               contains() , ensureCapacity() , isEmpty() , indexOf())
   --> In Java , we use the ArrayList classes to implement the functionality of resizeable-arrays . It implements the List Interface of the collections framework


2. LINKEDLIST(Most of the methods are from List Interface , ArrayList + lastIndexOf())
   -->linkedList is just a collection of Nodes. Each elemnent in the List is known as a Node. It consists of 3 fields.
   -->Prev - stores an address of the previous element in the list . it is null for the first element.
   -->Next - stores an address of the next element in the list . It is null for the last element .
   -->Data - stores the actual Data 
   
   CREATION: LinkedList<Integer> linkedlist = new LinkedList<>()
   ### LinkedList as Queue & Deque:
       addFirst() , addLast() , getFirst() , getLast() , removeFirst() , removeLast() , peek() , poll() , offer()
    
3. VECTOR (All Methods of List Interface included )
   In Java , both ArrayList and Vector implements the List interface and provides the same functionalities . However , there exist some difference between them.
   --> The Vector class synchronizes each indivisual operation . This means whenever we want to perform some operation on Vectors ,the vector class automatically applies a lock to that operation.
   --> It is because when one thread is accessing a vector , and at the same time another thread tries to access it , an exception called ConcurrentModificationException is generated . Hene, this continuos use of lock for each operation makes vectors less efficient.
   --> However , in array lists , methods are not synchronized . Instead , it uses the Collections.synchronizedList() method that synchronizes the list as a whole
   
   --> It is recommended to use ArrayList in place of Vector because vectors are less efficient.

4. STACK (Follows LIFO Ordering  , includes all the methods of List Interface)
   --> Java Collection Framework has a class named Stack that provides the functionality of the stack data structure. Stack class extends the Vector Class.

   CREATION: Stack<Integer> st = new Stack<>();

   Some Stack Specific Methods:- push(),pop(),peek(),search(),empty()