
What is Java Collection Framework?
    A java collection framework is a collection of interfaces and classes which are used to store and
    process data efficiently, as a Collection is something which is used to store Data objects.

    This framework was introduced in Java version 1.2.
    -> Reduced the development effort.
    -> Code quality is enhanced.

What are the basic interfaces of collection framework?

    1. Collection
    2. List
    3. Set
    4. Queue
    5. Map

Why Map Interface does not extend Collection interface?
    The Map is way different than collection. In Map there are no elements, it has key-value pairs.
    👉🏻 It does not fit into the Group of elements Paradigm.

    However there are many methods to retrieve keys and values as collection.

What is the difference between Collection and Collections?
	Collection is an interface in Java that represents a group of objects.
	It is the root interface in the Java Collections Framework, 
	and all other collection types (like List, Set, and Queue) extend or implement this interface.

	Collections is a utility class in Java that contains static methods for working with collections. 
	It is part of java.util and provides methods to manipulate or operate on collections, such as sorting, reversing, 
	and finding maximum/minimum elements.

Why Collection Interface does not extend Serializable and Cloneable interfaces?
    'There is no need to do it!'
    Collection is not supposed to do what Cloneable and Serializable interfaces do.

    What they do?
    They are just the marker interfaces which are actually empty interfaces.

    👉🏻 If Collection Interface implements these interfaces then it will mandate cloning and serialization
    in all implementation, which is less flexible and more restrictive.

When we had Array, Why do we need collection?
    We know Array is a group of primitives.. which holds homogeneous data.
    It has also some limitations like, arrays are always fixed in size.
    So to overcome these problems, collection were introduced.
    Collection, which can also be called a container, is a group of individual objects.

    How can it solve the problems that we had in array?

    Collections are grow-able in Nature,
    that means we aren't bound to declare size of any collection at declaration as we are with arrays.
    Size of collections can be increased or decreased on the base of our programming requirement.
    You can add or remove any number of elements in collection.

    hence collections solve the first limitation.

    And next,
    we only can have homogeneous type of data elements in array,
    But Collections can have any kind of data element. They can be homogeneous or heterogeneous.

when we should use arrays and when collection?
    Array are recommended to use if we know the size in advance..
    because Performance-wise Arrays are better to use than Collections.

    From Memory point of view, we should not use 'Arrays'..
    Suppose we take an array of 100 size. And if we only have 10 elements in it, so,
    here the rest of the memory blocks get wasted. Thats why arrays are not recommended to use in memory point of view.
    On the other hand, Collections are grow-able or resizable in nature, and it uses memory as per required only.

What is the difference between Array and ArrayList?
    The very first difference between Array and ArrayList is,
    Array can contain primitive or Objects whereas ArrayList can only contain Objects.
    next is
    Arrays are fixed in size whereas ArrayList size is dynamic.
    And, ArrayList accepts duplicate objects unlike arrays..
    Array does not provide a lot of features like ArrayList, such as add(), addAll(), removeAll() etc..

    So ArrayList is the obvious choice when we work on list.. But if the size of list is fixed and if we are using the list of primitives then we should use Arrays.. Although collection use auto boxing to reduce the coding effort but still it makes them slow.. so would use array with primitives.
    And if are working on multidimensional situation, then also using array [][] is way more easy than List<List<>>..

How LinkedList is different from ArrayList?
    ArrayList and LinkedList both implement the List interface but there are some differences between them..

    ArrayList is an indexed based data structure.. The underlying data structure for ArrayList is a resizable or growable Array.

    And LinkedList is a data structure which stores data and its address as list of nodes.. here, every node is linked to its previous and next node using pointers.. That is, the address part of the element points to the next element of the linked list.so see the address that the first node is having.. is actually the address of the next node.

    This is how we create ArrayList, and linkedLists

    ArrayList<String> al = new ArrayList<String>();
    //and to add elements.. these are the methods.. (explain the suggestions)
    al.add("John");
    al.add("Rohn");

    LinkedList<String> lList = new LinkedList<String>();
    lList.add("");

    Since ArrayList is index based data structure, it provides random access to its elements with the performance of O(1).. that is, we can access any element by the index.. Linked list also allows to get any element by index, but internally it traverse the list from start to read at the index node, then return the element. So the performance is O(n) which is slower than of arrayList. Therefore the ArrayList is recommended to use retrieving data..

    Next thing is, Insertion and removal of any element is faster in LinkedList compared to ArrayList. Because one insertion or deletion in middle requires n number of shifts.. So there is no concept of resizing array when element is added in middle..

    and in linkedList it requires only one change in the address pointer of the particular node to add or remove any element.

    Next is,
    LinkedList consumes more memory than ArrayList because every node in LinkedList stores reference of previous and next elements..'

What are the different ways to iterate over a list?
    To access or to get elements from collection there are many ways present in java.
    1. Loops (classic for loop)
    2. Cursors
        In java these are the cursors available for collections:
            1. Iterator
            2. ListIterator
            3. Enumeration

What is the difference between Iterator and ListIterator and Enumeration?
	    1. Iterator (Introduced in Java 1.2)
	Iterator is the most general-purpose iterator and can be used with most Collection classes (e.g., List, Set, Queue, etc.).
	It allows you to iterate over a collection in a forward direction only.
	Key Methods:
	hasNext(): Returns true if there are more elements to iterate.
	next(): Returns the next element in the collection and advances the iterator.
	remove(): Removes the last element returned by the iterator (optional operation).
	    Use case: Iterator is used when you need to iterate over elements
	    in any collection like List, Set, etc., but you don’t need to go backward or modify the collection while iterating.
	2. ListIterator (A Subinterface of Iterator)
	ListIterator is a more advanced version of the Iterator interface. It extends Iterator and is specific to List collections (e.g., ArrayList, LinkedList),
	meaning it can be used only on List types, not other collection types like Set or Queue.
	It provides additional methods that allow you to traverse the list in both directions (forward and backward), as well as modify the list during iteration.
	Key Methods:
	All methods of Iterator (hasNext(), next(), remove()) are available.
	Additional methods:
	hasPrevious(): Returns true if there’s an element before the current position.
	previous(): Returns the previous element and moves the cursor backwards.
	add(E e): Adds an element to the list at the current position.
	set(E e): Replaces the last element returned by next() or previous() with the specified element.
	nextIndex(): Returns the index of the element that would be returned by a subsequent call to next().
	previousIndex(): Returns the index of the element that would be returned by a subsequent call to previous().
	Use case: Use ListIterator when you need to iterate over a List in both directions and modify the list during iteration (e.g., adding or updating elements).
	
	3. Enumeration (Introduced in Java 1.0)
	Enumeration is an older interface (from the original version of Java) and has been mostly superseded by Iterator in modern Java. It was primarily used in the legacy classes like Vector, Stack, and Properties, and it is still available for backward compatibility.
	It provides a simpler, less feature-rich way to iterate through elements in a collection and only allows forward traversal.
	Key Methods:
	hasMoreElements(): Returns true if there are more elements to iterate.
	nextElement(): Returns the next element in the enumeration.

	Use case: Enumeration is typically used when working with legacy classes (like Vector, Stack) 
	or when maintaining backward compatibility. It is rarely used in modern code since Iterator offers more flexibility and functionality.



What are the legacy implementations?
    Vector is a legacy class.
    Legacy class: The classes that were already there before introducing collection framework.

    Sub Class of Vector -> Stack, is also a legacy class.

    Vector is implemented on a growable or a resizable array.
        -> It is an ordered collection
        -> allows duplicates.

    Vector v = new Vector();

    Stack implements the stack data structure. It is based on the principle of Last In First Out.
        👉🏻 element which is inserted in last, will be the first one to come out.

    Stack s = new Stack();

      -> to insert any object : push()
      -> to remove the top element : pop()

What are the similarities and difference between ArrayList and Vector?
	Similarities Between ArrayList and Vector:
	Both Implement the List Interface:
	
	Both ArrayList and Vector implement the List interface, meaning they both support common operations like adding, removing, and accessing elements by index.
	Example operations: add(), get(), remove(), size(), etc.
	Both Allow Dynamic Sizing:
	
	Both ArrayList and Vector grow dynamically as elements are added. They start with an initial capacity, and if that capacity is exceeded, they automatically resize themselves.
	Index-Based Access:
	
	Both ArrayList and Vector provide constant-time (O(1)) access to elements via an index using the get(int index) method.
	Both Can Contain Null Elements:
	
	Both ArrayList and Vector can store null values as elements (unless otherwise restricted by your application).
	Both Are Part of the Java Collections Framework:
	
	Both classes are part of the java.util package and are considered part of the Collections Framework.
	
	Key Differences Explained in Detail:

	Synchronization:
	
	ArrayList: Not synchronized, which means it is not thread-safe by default. If you're working in a multi-threaded environment and need a thread-safe collection,
	you would either use Vector, or better yet, consider using collections from the java.util.concurrent package, such as CopyOnWriteArrayList.
	Vector: Synchronized, which means it is thread-safe out-of-the-box. This makes Vector suitable for multi-threaded environments,
	but the synchronization overhead can make it slower in situations where thread safety is not necessary.
	
	Resizing (Growth Factor):
	
	ArrayList: Grows by 50% of the current size when it needs more space, meaning its capacity increases at a slower rate compared to Vector. This can result in fewer resizing operations, which improves performance in some cases.
	Vector: Grows by doubling its size when more space is needed. This can sometimes lead to wasted memory, especially if the number of elements grows in smaller increments, as the Vector will allocate a large amount of unused space when it doubles.
	Performance:
	
	ArrayList tends to be more performant than Vector in single-threaded scenarios because it doesn't incur the synchronization overhead.
	Vector, being synchronized, incurs additional performance costs, especially in single-threaded contexts where synchronization is unnecessary.
	Legacy Methods:
	
	ArrayList does not have legacy methods such as addElement() and removeElement(), which were specific to Vector and are considered outdated.
	ArrayList uses modern methods like add(), remove(), and clear().
	Vector still includes these legacy methods for compatibility with older codebases.
	Memory Usage:
	
	ArrayList uses less memory compared to Vector in general, because it does not double the size of its array when it grows. It grows by a fixed percentage (50%).
	Vector can sometimes use more memory because it doubles its array size, leading to more unused space, especially when the number of elements grows incrementally.

Which collection classes provide random access of its elements?
    These are the collection classes which provide random access:
        ArrayList, Vector, Stack, HashMap, TreeMap, Hash-table.

What are Stack and Queue? How they are different?
    Stack and Queue are used to store data before processing them.

    Queue represents an ordered list of objects which is limited to insert elements
    at the end of the list and removing from the start..

    This is how we create a queue,

    Queue<Integer> q = new LinkedList<>();

    being an interface it needs the concrete classes to create objects,
    PriorityQueue and LinkedList are most common to use.

    And to add element,
    q.add(10);
    q.add(20);

    sysout(q);

    and the remove method will remove the head that is the first element

    int a = q.remove();		//return the removed element
    sysout("element removed- "+a)

    sysout(q);

    So Queue allows retrieval of element in First In First Out order. and it is different from stack as Stack allows elements to be retrieved in Last In First out order.

    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);

    To pop,
    st.pop();

    sysout(st);

    So thats the difference between Stack and queue.. Stack is a class and queue is an interface.

what are the implementation of queue intefcace in java collections?
	   Common classes that implement the Queue interface include LinkedList, PriorityQueue, and ArrayDeque. 
	     LinkedList is commonly used to implement the Queue interface due to its efficient insertion and removal at both ends.
		PriorityQueue is another implementation of Queue that orders elements based on their natural order or custom comparator, not FIFO.
		ArrayDeque is a more efficient alternative to LinkedList for queue operations when you do not need thread safety.

	    Key Methods in the Queue Interface:
		Here are some of the key methods provided by the Queue interface:
		
		add(E e): Adds the specified element to the queue. Throws IllegalStateException if the element cannot be added (e.g., due to capacity restrictions).
		offer(E e): Adds the specified element to the queue. Returns true if the element was added successfully, or false if it could not be added.
		remove(): Removes and returns the front element of the queue. Throws NoSuchElementException if the queue is empty.
		poll(): Removes and returns the front element of the queue, or null if the queue is empty.
		peek(): Returns the front element of the queue without removing it. Returns null if the queue is empty.
		element(): Returns the front element of the queue without removing it. Throws NoSuchElementException if the queue is empty.
	   

How can we sort Collections?
    There are some implementations of set and map which are used to store elements in a sorting order.
    -> SortedMap, SortedSet etc. - can be used to get a sorted collection(Map or Set).

    To sort List implementations, the Collections provides method sort().

    Collections.sort(): sorts list implementation passed to it.

    -> It does not return anything just sorts the collection.

How to make a collection read only?
    We can create a read only collection by using unmodifiableCollection method of Collections class.

    Collections.unmodifiableCollection(Collection c)

    -> if any operation occurs it will throw UnsupportedOperationException.

How can we make a collection thread-safe?
    There is a method in Collections class ->
    synchronizedCollection(Collection c) : used to get a synchronized or thread-safe collection.

What is the difference between Set and List?
    Both Set and List are used to store objects and provides convenient way to insert,
    remove and retrieve elements and also provides support for iteration.

    Fundamental differences between List and Set:
     1. Allowing Duplicate Elements
     2. Order

When should we use List and when to use Set??
    👉🏻 If we need to maintain insertion order and we can have duplicates too then we use List.
    👉🏻 If we want a collection of unique objects then we should use Set.

How does HashSet is implemented? How does it use Hashing?
	    How HashSet Works and Uses Hashing
		A HashSet in Java is implemented using a HashMap under the hood. Specifically, it uses the HashMap class to store its elements, where:
		
		The element itself is stored as a key.
		The associated value for each key is a constant object (typically a static dummy object, like PRESENT).
		The hashing mechanism involves mapping each element to a hash code that is used to determine
	    	where in the underlying hash table the element should be stored.
		
		Here’s a step-by-step breakdown of how HashSet works internally with hashing:
		
		1. Hashing the Element
		Each element added to the HashSet is passed to the hashCode() method, which computes an integer hash value for the object.
		The hash code is then used to determine the bucket where the element will be stored.
		java
		Copy code
		int hashCode = element.hashCode();
		2. Bucket Index Calculation
		The hash code is used to compute the bucket index in the internal hash table (an array of buckets).
		The bucket index is calculated using a formula such as:
		java
		Copy code
		index = hashCode % table.length;
		This ensures that the elements are distributed across different "buckets" or "slots" in the table.
		
		3. Handling Collisions
		Since the hash code for different objects may result in the same index (i.e., multiple elements may have the same bucket index), collisions occur.
		To handle collisions, HashSet uses chaining with linked lists (or sometimes other structures like balanced trees, depending on the implementation).
		When a collision occurs, the element is simply added to the linked list (or tree) at the corresponding bucket index.
		For example:
		
		Two objects, A and B, may have the same hash code and end up in the same bucket. The second object will be added to the linked list or another internal structure associated with the bucket.
		If A is already in the set and B is also added but B is equal to A (according to equals() method), B will not be added because HashSet does not allow duplicates.
		4. Equality Check (equals() Method)
		When an element is added to the HashSet, it must pass two checks:
		Hash Code Comparison: The hash code of the element is computed and compared with other elements in the same bucket (if they share the same bucket index).
		Equality Check (equals()): If elements have the same hash code, the equals() method is used to check whether the new element is equal to an existing element.
		If the equals() method returns true, the element is not added again (i.e., duplicates are prevented).
		Internal Structure of HashSet
		Here is a rough idea of the internal structure of a HashSet:
		
		HashMap: The HashSet internally uses a HashMap to store its elements. The keys of the HashMap are the elements of the HashSet, and the values are typically a dummy constant object (such as PRESENT).
		Buckets: The HashMap maintains an array of buckets, where each bucket is a linked list (or tree for high-collision situations) of elements that have the same hash code.
		Resize: When the number of elements exceeds a certain threshold (defined by the load factor), the hash table is resized, and the elements are rehashed to distribute them more evenly across the buckets.

What are Comparable and Comparator interface? When to use what?
	1. Comparable Interface
	The Comparable interface is used to define the natural ordering of objects of a class.
	It is typically implemented by classes whose instances need to be compared with each other for sorting purposes.
	public int compareTo(T o);
	import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // Compare by age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        );

        // Sorting using natural order (age)
        Collections.sort(people);
        System.out.println(people);
    }
}



Key Points About Comparable:
Location: It is part of the java.lang package.

2. Comparator Interface
The Comparator interface is used to define an external comparison strategy for objects. Unlike Comparable, which defines the default sorting order within the object itself, Comparator allows you to define multiple ways to compare objects outside of the objects' class.

Key Points About Comparator:
Location: It is part of the java.util package.

Method: It defines two methods:
int compare(T o1, T o2);    // Compares two objects
boolean equals(Object obj);  // Checks equality (optional)


Whats difference between TreeSet and LinkedHashSet and HashSet?
    These are the implementations of Set.

    Starting with TreeSet, the main feature of TreeSet is Sorting.
    Its the implementation class of sortedSet.
    So in TreeSet the insertion of elements is done on some sorting order.
    like we want to store all the Employee's object according to their EmployeeIds then we should
    go for SortedSet or TreeSet.
    Also in treeSet, we cannot put heterogeneous elements in it.
    Its about sorting as we cannot sort different type of objects so it is restricted to insert diff data types in treeSet.

    SortedSet<Integer> t = new TreeSet<>();

    It will creates an TreeSet object in which elements to be inserted in Default natural sorting order.
    Note that, If we are depending on the default natural sorting order, then our elemtns/object should be...
    homogeneous and comparable, otherwise we will get classCastException.

    So we can add integer only.
    t.add(10);
    t.add(5);
    sysout(t);

    This will add both elements in ascending order by default.

    And next is LinkedHashSet.. it was introduced in 1.4 version. It is the sub class of Hashset (no insertion order) where insertion order is preserved.
    And that's the main difference between HashSet and LinkedHashSet.

    We create linkedHashSet like,
    LinkedHashSet lhs = new LinkedHashSet();

    So all of the three, TreeSet, LinkedHashSet and HashSet doesn't allow to store duplicates.
    And none of these are thread-safe..
    But HashSet is the Fastest among them.
    LinkedHashSet comes second or can be similar to HashSet but
    TreeSet is slower because it performs sorting for each insertion.

    Next difference between these, is ordering.
    HashSet doesn't maintain any order while LinkedHashSet maintains insertion order
    and treeSet maintains sorting order of elements.

    And talking about internal implementations,
    HashSet is backed by HashMap..
    whereas LinkedHashSet is implemented using HashSet and LinkedList.
    And TreeSet, it is backed up by navigableMap and it internally uses TreeMap.

    Next difference is about way of comparing things,
    like HashSet and LinkedHashSet uses equals() for comparison
    and TreeSet uses compareTo() method for maintaining ordering.
    This was all about differences between them.

Can we add a null element to TreeSet and HashSet?
    We can add a null element in HashSet but not in treeSet.

    👉🏻 TreeSet uses compareTo() method to compare objects with each other, if any element will be null
    by any chance, it will throw NullPointerException.

What is difference between poll() and remove() methods of Queue?
    Both of these methods are used to remove element and returns the head of the queue. The difference is,

    -> if the queue is empty and we call the remove() method, then it will throw exception,
    but if we call poll() method, it will return null.

What is the difference between remove() method of Collection and remove() method of Iterator?
    Collection.remove() is used for removing object from collection, while not iterating.

    -> When we use this remove() method to remove element at the time of iteration then it may throw
    ConcurrentModificationException.

    -> Iterator.remove() is advised to use for remove element while iterating.

How HashMap works in Java?
	Key Features of HashMap:
	No duplicates in keys: A HashMap does not allow duplicate keys, but it allows duplicate values.
	Unordered: The entries (key-value pairs) are not ordered. The order of keys and values is not guaranteed,
	as it depends on the hash function and the internal resizing.
	Null values: HashMap allows one null key and multiple null values.
	Thread-unsafe: HashMap is not thread-safe. If multiple
	threads access the HashMap concurrently and at least one of the threads modifies the map structurally, it must be synchronized externally.
	How HashMap Works Internally
	The internal structure of a HashMap is a hash table with the following key components:
	
	Hash Table (Array of Buckets): The HashMap uses an array of buckets (or "bins"), where each bucket is a 
	linked list or tree (depending on the implementation and number of collisions).
	
	Hashing: When you add a key-value pair to the HashMap, the key's hash code is computed using 
	the key’s hashCode() method. The hash code is then used to determine the index in the hash table
	where the entry should be stored. This is done through a hash function, which helps map the key to an index in the array.
	
	Collision Handling: Hash collisions happen when two keys produce the same hash code. 
	In this case, the HashMap uses a technique called chaining to store multiple key-value pairs in the same bucket. 
	Initially, this is done with a linked list. If the number of elements in a bucket becomes too large,
	the linked list can be converted into a balanced tree for faster lookups.
	
	Resizing: As the number of entries grows, 
	the HashMap might exceed the load factor threshold (by default, it's 0.75). 
	This triggers a resizing operation where the capacity of the hash table is increased (typically doubled), and all the entries are rehashed to the new array.

Whats the difference between HashMap and HashTable?
	Summary of Differences Between HashMap and Hashtable
	Feature					HashMap								Hashtable
	Thread Safety				Not synchronized, not thread-safe				Synchronized, thread-safe
	Null Keys/Values			Allows 1 null key and multiple null values			Does not allow null keys or values
	Performance				Faster due to lack of synchronization				Slower due to synchronization overhead
	Inheritance				Implements Map interface (modern)				Extends Dictionary interface (legacy)
	Iteration				Uses Iterator (fail-fast)					Uses Enumeration (legacy), supports Iterator
	Usage					Preferred for new code						Legacy class, not recommended for new code
	Resizing Mechanism			Grows dynamically when load factor is reached			Grows dynamically but synchronized at each step
	Order of Elements			No guaranteed order						No guaranteed order

Can we use a Custom object as a key in HashMap? If yes then How?
    Yes! we may create custom object key for HashMap.
    -> for that we need to override the equals() and hashcode() method to the Class which we want to use
    as key.

Why it is suggetsed to have immutable objects as keys in hashMap?
  //why string is popular hasmap key in java?
    -> if we want to use custom object as key, we need to ensure that the hashcode() of the key of hashMap
    does not change. If it happens then it is impossible to get object value from that key.

What is the contract of equals() and hashCode() method?
    👉🏻 If two objects are equal, then they must have the same hashcode.
    👉🏻 if two objects have the same hash code, then they may or may not be equal.

    //Equal objects must produce same hashcode
	   //a.equals(b) -> true    then  a.hashCode() = b.hashCode()

  	//unequal objects need not produce same hashcode
  	//a.equals(b) -> false    then  a.hashCode() = b.hashCode() -> true
  	//a.equals(b) -> false    then  a.hashCode() = b.hashCode() -> false

What is the NavigableMap?

What is the difference between HashMap and HashSet in java?
    👉🏻 HashMap is collection of key-value pairs whereas HashSet is an un-ordered collection of unique
    elements!

What are IdentityHashMap and WeakHashMap? How they are different?

When to use HashMap and when to use TreeMap?
    👉🏻 HashMap is the best implementation of Map for inserting, deleting, and locating elements.

    👉🏻 TreeMap is the better alternative if we need to traverse the keys in a sorted order.

    -> HashMap is faster than TreeMap; for sorted key traversal, it is faster way to add elements to a
    HashMap, and then convert the map to a TreeMap.


//Concurrent Collections
//java.util.concurrent v5

What is iterator's fail-fast property?
    While iterating over any collection, we cannot perform any modification on elements.
    Whenever we access the next element in collection, Iterator's fail fast property checks for any
    modification in the structure of that collection.'
    -> If any modifications found, it throws RuntimeException.

    👉🏻 Almost all the implementations of the iterator, are fail-fast by design.
      ** Except the concurrent collection classes.

What are Concurrent Collection classes? When does ConcurrentModificationException occur?
    The Concurrent Package [java.util.concurrent] which introduced in java 1.5,
    contains thread-safe collection classes called Concurrent Collection class:
    -> that allows collections to be modified while iterating.

    By design, iterator implementation are fail fast and throw the ConcurrentModificationException
    whenever we modify element while iterating.

    -> Iterator implementations in Concurrent Package allows us to do the modifications at runtime too.

    1. CopyOnWriteArrayList 2. ConcurrentHashMap 3. CopyOnWriteArraySet.

What is the difference between fail-fast and fail safe?

What is the difference between Synchronized Collection and concurrent collection?
    Synchronized collections classes, like Hashtable and Vector provides thread-safe implementation of Map
    and List.

    There are several factors which make them less suitable for use in highly concurrent applications.

    Performance: The synchronized collections are unsuitable because of their 'wide-locking mechanism'.
    They acquire lock on complete object whereas concurrent classes locks only a part.

When do we use ConcurrentHashMap in Java?

Can we replace HashTable with ConcurrentHashMap?
    Yes, we can replace the HashTable with ConcurrentHashMap.
    -> As the performance of ConcurrentHashMap is better than HashTable.

    We need to be careful with code which relies on locking behavior of Hashtable.
    Since Hashtable locks whole Map instead of a portion of Map, compound operations like
    if(Hashtable.get(key) == null) put(key, value) works in Hashtable but not in concurrentHashMap.

What is CopyOnWriteArrayList? How it is different than ArrayList?
    <lecture>

What is BlockingQueue?
    <lecture>
