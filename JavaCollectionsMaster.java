import java.util.*;

public class JavaCollectionsMaster {

    public static void main(String[] args) {

        // ==========================================================
        // ARRAYLIST
        // ==========================================================

        /*
         * ArrayList
         * ----------
         * Package : java.util
         * Implements : List Interface
         *
         * Features
         * --------
         * ✔ Dynamic Array
         * ✔ Maintains insertion order
         * ✔ Allows duplicate elements
         * ✔ Fast random access (O(1))
         * ✔ Slow insertion/deletion in middle (O(n))
         * ✔ Not synchronized
         */

        System.out.println("========== ARRAYLIST ==========\n");

        // Creating an empty ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // ----------------------------------------------------------
        // add(E element)
        // Adds element at the end of the list.
        // Return Type : boolean
        // Time Complexity : O(1) (Amortized)
        // ----------------------------------------------------------

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("After add(): " + list);

        // ----------------------------------------------------------
        // add(int index, E element)
        // Inserts an element at a specific index.
        // Existing elements shift right.
        // Time Complexity : O(n)
        // ----------------------------------------------------------

        list.add(1, 100);

        System.out.println("After add(index, element): " + list);

        // ----------------------------------------------------------
        // get(int index)
        // Returns element at given index.
        // Does not remove it.
        // Time Complexity : O(1)
        // ----------------------------------------------------------

        System.out.println("Element at index 2 : " + list.get(2));

        // ----------------------------------------------------------
        // set(index, element)
        // Replaces existing value.
        // Returns previous value.
        // Time Complexity : O(1)
        // ----------------------------------------------------------

        list.set(2, 200);

        System.out.println("After set(): " + list);

        // ----------------------------------------------------------
        // contains(Object o)
        // Checks if an element exists.
        // Uses equals() internally.
        // Return : true / false
        // Time Complexity : O(n)
        // ----------------------------------------------------------

        System.out.println("Contains 20 ? " + list.contains(20));

        // ----------------------------------------------------------
        // indexOf(Object o)
        // Returns first occurrence index.
        // Returns -1 if not found.
        // ----------------------------------------------------------

        System.out.println("Index of 30 : " + list.indexOf(30));

        // ----------------------------------------------------------
        // lastIndexOf(Object o)
        // Returns last occurrence.
        // ----------------------------------------------------------

        list.add(30);

        System.out.println("Last Index of 30 : " + list.lastIndexOf(30));

        // ----------------------------------------------------------
        // size()
        // Returns total number of elements.
        // Time Complexity : O(1)
        // ----------------------------------------------------------

        System.out.println("Size : " + list.size());

        // ----------------------------------------------------------
        // isEmpty()
        // Checks whether list contains elements.
        // ----------------------------------------------------------

        System.out.println("Is Empty ? " + list.isEmpty());

        // ----------------------------------------------------------
        // remove(index)
        // Removes element by index.
        // Returns removed element.
        // Time Complexity : O(n)
        // ----------------------------------------------------------

        list.remove(1);

        System.out.println("After remove(index): " + list);

        // ----------------------------------------------------------
        // remove(Object)
        // Removes first occurrence.
        // Returns boolean.
        // ----------------------------------------------------------

        list.remove(Integer.valueOf(30));

        System.out.println("After remove(Object): " + list);

        // ----------------------------------------------------------
        // addAll(Collection)
        // Adds entire collection.
        // ----------------------------------------------------------

        ArrayList<Integer> extra = new ArrayList<>();
        extra.add(100);
        extra.add(200);

        list.addAll(extra);

        System.out.println("After addAll(): " + list);

        // ----------------------------------------------------------
        // removeAll(Collection)
        // Removes all matching elements.
        // ----------------------------------------------------------

        list.removeAll(extra);

        System.out.println("After removeAll(): " + list);

        // ----------------------------------------------------------
        // retainAll(Collection)
        // Keeps only matching elements.
        // Removes remaining.
        // ----------------------------------------------------------

        ArrayList<Integer> keep = new ArrayList<>();
        keep.add(10);
        keep.add(20);

        list.retainAll(keep);

        System.out.println("After retainAll(): " + list);

        // ----------------------------------------------------------
        // clear()
        // Removes every element.
        // ----------------------------------------------------------

        list.clear();

        System.out.println("After clear(): " + list);

        // ==========================================================
        // LINKEDLIST
        // ==========================================================

        /*
         * LinkedList
         * ----------
         * Implements List and Deque.
         *
         * Internally uses Doubly Linked List.
         *
         * Advantages
         * ----------
         * Fast insertion/deletion
         * Efficient at beginning/end
         *
         * Disadvantages
         * -------------
         * Slow random access.
         */

        System.out.println("\n========== LINKEDLIST ==========\n");

        LinkedList<String> ll = new LinkedList<>();

        // add()

        ll.add("A");
        ll.add("B");
        ll.add("C");

        System.out.println(ll);

        // addFirst()

        ll.addFirst("Start");

        System.out.println("After addFirst(): " + ll);

        // addLast()

        ll.addLast("End");

        System.out.println("After addLast(): " + ll);

        // getFirst()

        System.out.println("First : " + ll.getFirst());

        // getLast()

        System.out.println("Last : " + ll.getLast());

        // removeFirst()

        ll.removeFirst();

        System.out.println("After removeFirst() : " + ll);

        // removeLast()

        ll.removeLast();

        System.out.println("After removeLast() : " + ll);

        // offer()

        ll.offer("D");

        System.out.println("offer() : " + ll);

        // offerFirst()

        ll.offerFirst("X");

        System.out.println("offerFirst() : " + ll);

        // offerLast()

        ll.offerLast("Y");

        System.out.println("offerLast() : " + ll);

        // peek()

        System.out.println("peek() : " + ll.peek());

        // peekFirst()

        System.out.println("peekFirst() : " + ll.peekFirst());

        // peekLast()

        System.out.println("peekLast() : " + ll.peekLast());

        // poll()

        System.out.println("poll() : " + ll.poll());

        System.out.println(ll);

        // pollFirst()

        System.out.println("pollFirst() : " + ll.pollFirst());

        System.out.println(ll);

        // pollLast()

        System.out.println("pollLast() : " + ll.pollLast());

        System.out.println(ll);

        // ==========================================================
        // VECTOR
        // ==========================================================

        /*
         * Vector
         * ------
         * Legacy Collection.
         *
         * Similar to ArrayList
         *
         * Difference
         * ----------
         * Synchronized
         * Thread Safe
         * Slower than ArrayList
         */

        System.out.println("\n========== VECTOR ==========\n");

        Vector<Integer> vector = new Vector<>();

        // add()

        vector.add(10);
        vector.add(20);
        vector.add(30);

        System.out.println(vector);

        // insertElementAt()

        vector.insertElementAt(100, 1);

        System.out.println("insertElementAt() : " + vector);

        // removeElement()

        vector.removeElement(20);

        System.out.println("removeElement() : " + vector);

        // capacity()

        System.out.println("Capacity : " + vector.capacity());

        // firstElement()

        System.out.println("First : " + vector.firstElement());

        // lastElement()

        System.out.println("Last : " + vector.lastElement());

        // elementAt()

        System.out.println("Element at 2 : " + vector.elementAt(2));

        // ==========================================================
        // STACK
        // ==========================================================

        /*
         * Stack
         * -----
         * Extends Vector.
         *
         * Works on LIFO
         * (Last In First Out)
         *
         * Examples
         * --------
         * Browser History
         * Undo Operation
         * Function Calls
         */

        System.out.println("\n========== STACK ==========\n");

        Stack<Integer> stack = new Stack<>();

        // push()

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        // peek()

        System.out.println("peek() : " + stack.peek());

        // pop()

        System.out.println("pop() : " + stack.pop());

        System.out.println(stack);

        // search()

        /*
         * Returns position from top.
         *
         * Top element = Position 1
         *
         * Returns -1 if not found.
         */

        System.out.println("search(10) : " + stack.search(10));

        // empty()

        System.out.println("empty() : " + stack.empty());

        // clear()

        stack.clear();

        System.out.println("After clear() : " + stack);

        // ==========================================================
        // HASHSET
        // ==========================================================

        /*
         * HashSet
         * -------
         * Package : java.util
         * Implements : Set Interface
         *
         * Features
         * --------
         * ✔ Does NOT maintain insertion order.
         * ✔ Stores unique elements only.
         * ✔ Duplicate elements are ignored.
         * ✔ Internally uses HashMap.
         * ✔ Allows one null value.
         * ✔ Average insertion/search/deletion : O(1)
         */

        System.out.println("========== HASHSET ==========\n");

        HashSet<Integer> hs = new HashSet<>();

        // add(E element)
        // Adds an element if it does not already exist.
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(20); // Duplicate (Ignored)

        System.out.println("After add() : " + hs);

        // contains(Object o)
        // Checks whether an element exists.
        System.out.println("Contains 20 ? " + hs.contains(20));

        // remove(Object o)
        // Removes the specified element.
        hs.remove(20);

        System.out.println("After remove() : " + hs);

        // size()
        System.out.println("Size : " + hs.size());

        // isEmpty()
        System.out.println("Is Empty ? " + hs.isEmpty());

        // addAll(Collection)
        hs.addAll(Arrays.asList(40, 50, 60));

        System.out.println("After addAll() : " + hs);

        // removeAll(Collection)
        hs.removeAll(Arrays.asList(40, 60));

        System.out.println("After removeAll() : " + hs);

        // retainAll(Collection)
        hs.retainAll(Arrays.asList(10, 30));

        System.out.println("After retainAll() : " + hs);

        // clear()
        hs.clear();

        System.out.println("After clear() : " + hs);

        // ==========================================================
        // LINKEDHASHSET
        // ==========================================================

        /*
         * LinkedHashSet
         * -------------
         * Features
         * --------
         * ✔ Maintains insertion order.
         * ✔ Stores unique elements.
         * ✔ Slightly slower than HashSet.
         * ✔ Internally uses LinkedHashMap.
         */

        System.out.println("\n========== LINKEDHASHSET ==========\n");

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Orange");
        lhs.add("Apple"); // Ignored

        System.out.println(lhs);

        // remove()
        lhs.remove("Banana");

        System.out.println("After remove() : " + lhs);

        // contains()
        System.out.println("Contains Orange : " + lhs.contains("Orange"));

        // size()
        System.out.println("Size : " + lhs.size());

        // clear()
        lhs.clear();

        System.out.println("After clear() : " + lhs);

        // ==========================================================
        // TREESET
        // ==========================================================

        /*
         * TreeSet
         * -------
         * ✔ Stores unique elements.
         * ✔ Automatically sorts elements.
         * ✔ Internally uses Red-Black Tree.
         * ✔ No null values allowed.
         * ✔ All operations : O(log n)
         */

        System.out.println("\n========== TREESET ==========\n");

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(50);
        ts.add(10);
        ts.add(30);
        ts.add(70);
        ts.add(40);

        System.out.println("Sorted Set : " + ts);

        // first()
        System.out.println("First : " + ts.first());

        // last()
        System.out.println("Last : " + ts.last());

        // higher()
        // Returns the smallest element greater than the given element.
        System.out.println("Higher than 30 : " + ts.higher(30));

        // lower()
        // Returns the largest element smaller than the given element.
        System.out.println("Lower than 30 : " + ts.lower(30));

        // ceiling()
        // Returns >= given value.
        System.out.println("Ceiling of 35 : " + ts.ceiling(35));

        // floor()
        // Returns <= given value.
        System.out.println("Floor of 35 : " + ts.floor(35));

        // headSet()
        // Returns elements before given value.
        System.out.println("HeadSet(40) : " + ts.headSet(40));

        // tailSet()
        // Returns elements from given value onwards.
        System.out.println("TailSet(30) : " + ts.tailSet(30));

        // subSet()
        // Returns elements between two values.
        System.out.println("SubSet(20,60) : " + ts.subSet(20, 60));

        // pollFirst()
        // Removes first element.
        System.out.println("pollFirst() : " + ts.pollFirst());

        System.out.println(ts);

        // pollLast()
        // Removes last element.
        System.out.println("pollLast() : " + ts.pollLast());

        System.out.println(ts);

        // ==========================================================
        // PRIORITY QUEUE
        // ==========================================================

        /*
         * PriorityQueue
         * -------------
         * ✔ Heap-based Queue.
         * ✔ Default : Min Heap.
         * ✔ Does NOT preserve insertion order.
         * ✔ First element always has highest priority
         * (smallest in natural ordering).
         */

        System.out.println("\n========== PRIORITYQUEUE ==========\n");

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // offer()
        // Adds element.
        pq.offer(50);
        pq.offer(10);
        pq.offer(40);
        pq.offer(20);

        System.out.println(pq);

        // peek()
        // Returns first element without removing.
        System.out.println("peek() : " + pq.peek());

        // poll()
        // Removes first element.
        System.out.println("poll() : " + pq.poll());

        System.out.println(pq);

        // add()
        pq.add(5);

        System.out.println("After add() : " + pq);

        // remove()
        pq.remove(20);

        System.out.println("After remove() : " + pq);

        // contains()
        System.out.println("Contains 40 : " + pq.contains(40));

        // size()
        System.out.println("Size : " + pq.size());

        // ==========================================================
        // ARRAYDEQUE
        // ==========================================================

        /*
         * ArrayDeque
         * ----------
         * Implements Deque Interface.
         *
         * Features
         * --------
         * ✔ Faster than Stack.
         * ✔ Faster than LinkedList for queue operations.
         * ✔ No null elements allowed.
         * ✔ Can work as Queue or Stack.
         */

        System.out.println("\n========== ARRAYDEQUE ==========\n");

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // offer()
        dq.offer(20);

        // offerFirst()
        dq.offerFirst(10);

        // offerLast()
        dq.offerLast(30);

        System.out.println(dq);

        // peek()
        System.out.println("peek() : " + dq.peek());

        // peekFirst()
        System.out.println("peekFirst() : " + dq.peekFirst());

        // peekLast()
        System.out.println("peekLast() : " + dq.peekLast());

        // poll()
        System.out.println("poll() : " + dq.poll());

        System.out.println(dq);

        // pollFirst()
        System.out.println("pollFirst() : " + dq.pollFirst());

        System.out.println(dq);

        dq.offer(100);
        dq.offer(200);

        // pollLast()
        System.out.println("pollLast() : " + dq.pollLast());

        System.out.println(dq);

        // push()
        // Inserts at front (Stack operation)
        dq.push(500);

        System.out.println("After push() : " + dq);

        // pop()
        // Removes first element (Stack operation)
        System.out.println("pop() : " + dq.pop());

        System.out.println(dq);

        // removeFirst()
        dq.removeFirst();

        System.out.println("After removeFirst() : " + dq);

        dq.offerFirst(10);
        dq.offerLast(20);

        // removeLast()
        dq.removeLast();

        System.out.println("After removeLast() : " + dq);

        // clear()
        dq.clear();

        System.out.println("After clear() : " + dq);

        // ==========================================================
        // HASHMAP
        // ==========================================================

        /*
         * HashMap
         * -------
         * Package : java.util
         * Implements : Map Interface
         *
         * Features
         * --------
         * ✔ Stores data as Key-Value pairs.
         * ✔ Keys are UNIQUE.
         * ✔ Values may be duplicated.
         * ✔ Does NOT maintain insertion order.
         * ✔ Allows ONE null key.
         * ✔ Allows multiple null values.
         * ✔ Average Time Complexity : O(1)
         * ✔ Internally uses Hash Table.
         */

        System.out.println("========== HASHMAP ==========\n");

        HashMap<Integer, String> hm = new HashMap<>();

        // ----------------------------------------------------------
        // put(K key, V value)
        // Adds or updates a key-value pair.
        // If the key already exists, its value is replaced.
        // ----------------------------------------------------------

        hm.put(101, "Jenil");
        hm.put(102, "Rahul");
        hm.put(103, "Amit");

        System.out.println(hm);

        // ----------------------------------------------------------
        // get(key)
        // Returns the value associated with the key.
        // Returns null if key does not exist.
        // ----------------------------------------------------------

        System.out.println("get(102) : " + hm.get(102));

        // ----------------------------------------------------------
        // getOrDefault(key, defaultValue)
        // Returns value if key exists,
        // otherwise returns default value.
        // ----------------------------------------------------------

        System.out.println(hm.getOrDefault(110, "Not Found"));

        // ----------------------------------------------------------
        // putIfAbsent(key,value)
        // Inserts only if key is NOT already present.
        // ----------------------------------------------------------

        hm.putIfAbsent(104, "Rohan");
        hm.putIfAbsent(101, "XYZ");

        System.out.println(hm);

        // ----------------------------------------------------------
        // containsKey()
        // Checks whether key exists.
        // ----------------------------------------------------------

        System.out.println(hm.containsKey(103));

        // ----------------------------------------------------------
        // containsValue()
        // Checks whether value exists.
        // ----------------------------------------------------------

        System.out.println(hm.containsValue("Rahul"));

        // ----------------------------------------------------------
        // replace(key,value)
        // Replaces existing value.
        // ----------------------------------------------------------

        hm.replace(103, "Akash");

        System.out.println(hm);

        // ----------------------------------------------------------
        // replace(key, oldValue, newValue)
        // Replaces only if oldValue matches.
        // ----------------------------------------------------------

        hm.replace(101, "Jenil", "JENIL");

        System.out.println(hm);

        // ----------------------------------------------------------
        // remove(key)
        // Removes specified key.
        // ----------------------------------------------------------

        hm.remove(104);

        System.out.println(hm);

        // ----------------------------------------------------------
        // remove(key,value)
        // Removes only if key AND value match.
        // ----------------------------------------------------------

        hm.remove(102, "Rahul");

        System.out.println(hm);

        // ----------------------------------------------------------
        // keySet()
        // Returns all keys.
        // ----------------------------------------------------------

        System.out.println("Keys : " + hm.keySet());

        // ----------------------------------------------------------
        // values()
        // Returns collection of values.
        // ----------------------------------------------------------

        System.out.println("Values : " + hm.values());

        // ----------------------------------------------------------
        // entrySet()
        // Returns all key-value pairs.
        // ----------------------------------------------------------

        System.out.println("Entry Set : " + hm.entrySet());

        // ----------------------------------------------------------
        // size()
        // Returns total entries.
        // ----------------------------------------------------------

        System.out.println("Size : " + hm.size());

        // ----------------------------------------------------------
        // isEmpty()
        // Checks if map contains entries.
        // ----------------------------------------------------------

        System.out.println(hm.isEmpty());

        // ----------------------------------------------------------
        // forEach()
        // Iterates over all entries.
        // ----------------------------------------------------------

        hm.forEach((key, value) -> System.out.println(key + " -> " + value));

        // ----------------------------------------------------------
        // clear()
        // Removes all entries.
        // ----------------------------------------------------------

        hm.clear();

        System.out.println(hm);

        // ==========================================================
        // LINKEDHASHMAP
        // ==========================================================

        /*
         * LinkedHashMap
         * -------------
         * ✔ Maintains insertion order.
         * ✔ Internally uses HashMap + Doubly Linked List.
         * ✔ Slightly slower than HashMap.
         */

        System.out.println("\n========== LINKEDHASHMAP ==========\n");

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        lhm.put(1, "One");
        lhm.put(2, "Two");
        lhm.put(3, "Three");

        System.out.println(lhm);

        // get()
        System.out.println(lhm.get(2));

        // replace()
        lhm.replace(3, "THREE");

        System.out.println(lhm);

        // containsKey()
        System.out.println(lhm.containsKey(2));

        // containsValue()
        System.out.println(lhm.containsValue("One"));

        // remove()
        lhm.remove(1);

        System.out.println(lhm);

        // keySet()
        System.out.println(lhm.keySet());

        // values()
        System.out.println(lhm.values());

        // entrySet()
        System.out.println(lhm.entrySet());

        // clear()
        lhm.clear();

        System.out.println(lhm);

        // ==========================================================
        // TREEMAP
        // ==========================================================

        /*
         * TreeMap
         * -------
         * ✔ Keys remain automatically sorted.
         * ✔ Internally uses Red Black Tree.
         * ✔ Does NOT allow null keys.
         * ✔ Time Complexity : O(log n)
         */

        System.out.println("\n========== TREEMAP ==========\n");

        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(30, "C");
        tm.put(10, "A");
        tm.put(20, "B");
        tm.put(40, "D");

        System.out.println(tm);

        // firstKey()
        System.out.println("First Key : " + tm.firstKey());

        // lastKey()
        System.out.println("Last Key : " + tm.lastKey());

        // higherKey()
        System.out.println("Higher than 20 : " + tm.higherKey(20));

        // lowerKey()
        System.out.println("Lower than 20 : " + tm.lowerKey(20));

        // ceilingKey()
        System.out.println("Ceiling 25 : " + tm.ceilingKey(25));

        // floorKey()
        System.out.println("Floor 25 : " + tm.floorKey(25));

        // firstEntry()
        System.out.println(tm.firstEntry());

        // lastEntry()
        System.out.println(tm.lastEntry());

        // pollFirstEntry()
        System.out.println(tm.pollFirstEntry());

        System.out.println(tm);

        // pollLastEntry()
        System.out.println(tm.pollLastEntry());

        System.out.println(tm);

        // headMap()
        System.out.println(tm.headMap(30));

        // tailMap()
        System.out.println(tm.tailMap(20));

        // subMap()
        System.out.println(tm.subMap(10, true, 40, false));

        // ==========================================================
        // HASHTABLE
        // ==========================================================

        /*
         * Hashtable
         * ---------
         * Legacy Collection.
         *
         * ✔ Thread Safe
         * ✔ Synchronized
         * ✔ Does NOT allow null key.
         * ✔ Does NOT allow null value.
         * ✔ Slower than HashMap.
         */

        System.out.println("\n========== HASHTABLE ==========\n");

        Hashtable<Integer, String> ht = new Hashtable<>();

        // put()
        ht.put(1, "One");
        ht.put(2, "Two");
        ht.put(3, "Three");

        System.out.println(ht);

        // get()
        System.out.println(ht.get(2));

        // containsKey()
        System.out.println(ht.containsKey(1));

        // containsValue()
        System.out.println(ht.containsValue("Three"));

        // replace()
        ht.replace(3, "THREE");

        System.out.println(ht);

        // remove()
        ht.remove(2);

        System.out.println(ht);

        // keySet()
        System.out.println(ht.keySet());

        // values()
        System.out.println(ht.values());

        // entrySet()
        System.out.println(ht.entrySet());

        // size()
        System.out.println(ht.size());

        // isEmpty()
        System.out.println(ht.isEmpty());

        // clear()
        ht.clear();

        System.out.println(ht);

        // ==========================================================
        // ITERATOR
        // ==========================================================

        /*
         * Iterator
         * --------
         * Used to traverse Collection objects one element at a time.
         *
         * Can traverse:
         * ArrayList
         * LinkedList
         * HashSet
         * TreeSet
         * Vector
         *
         * Cannot move backwards.
         */

        System.out.println("========== ITERATOR ==========\n");

        ArrayList<String> students = new ArrayList<>();

        students.add("Jenil");
        students.add("Rahul");
        students.add("Amit");
        students.add("Rohan");

        // iterator()
        // Returns an Iterator object.
        Iterator<String> itr = students.iterator();

        // hasNext()
        // Returns true if another element exists.
        while (itr.hasNext()) {

            // next()
            // Returns current element
            // and moves iterator forward.
            System.out.println(itr.next());
        }

        // ==========================================================
        // Iterator remove()
        // ==========================================================

        System.out.println("\nIterator remove()\n");

        ArrayList<Integer> nums = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50));

        Iterator<Integer> i = nums.iterator();

        while (i.hasNext()) {
            int value = i.next();

            if (value == 30) {
                // remove()
                // Removes current element safely.
                i.remove();
            }
        }

        System.out.println(nums);

        // ==========================================================
        // LIST ITERATOR
        // ==========================================================

        /*
         * ListIterator
         * ------------
         * Works only with List implementations.
         *
         * Can move
         * --------
         * Forward
         * Backward
         *
         * Can modify elements while iterating.
         */

        System.out.println("\n========== LIST ITERATOR ==========\n");

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Rajkot");
        cities.add("Ahmedabad");
        cities.add("Surat");

        ListIterator<String> litr = cities.listIterator();

        // hasNext()

        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        // hasPrevious()

        System.out.println("\nBackward");

        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        // add()

        litr = cities.listIterator();

        while (litr.hasNext()) {
            String city = litr.next();

            if (city.equals("Ahmedabad")) {
                // Inserts after current position
                litr.add("Vadodara");
            }
        }

        System.out.println(cities);

        // set()

        litr = cities.listIterator();

        while (litr.hasNext()) {
            String city = litr.next();

            if (city.equals("Rajkot")) {
                // Replaces current element.
                litr.set("RAJKOT");
            }
        }

        System.out.println(cities);

        // ==========================================================
        // ENHANCED FOR LOOP
        // ==========================================================

        /*
         * Simplest way to iterate.
         * Cannot modify collection safely.
         */

        System.out.println("\n========== ENHANCED FOR ==========\n");

        for (String city : cities) {
            System.out.println(city);
        }

        // ==========================================================
        // MAP ITERATION
        // ==========================================================

        System.out.println("\n========== MAP ITERATION ==========\n");

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Jenil");
        map.put(102, "Rahul");
        map.put(103, "Amit");

        // entrySet()

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(
                    entry.getKey()
                            + " -> "
                            + entry.getValue());
        }

        // keySet()

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // values()

        for (String value : map.values()) {
            System.out.println(value);
        }

        // ==========================================================
        // COLLECTIONS CLASS
        // ==========================================================

        /*
         * Collections
         * -----------
         * Utility class.
         *
         * Contains static methods
         * for manipulating collections.
         */

        System.out.println("\n========== COLLECTIONS ==========\n");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(40);
        list2.add(10);
        list2.add(50);
        list2.add(20);
        list2.add(30);

        System.out.println("Original");

        System.out.println(list2);

        // ----------------------------------------------------------
        // sort()
        // Sorts ascending.
        // O(n log n)
        // ----------------------------------------------------------

        Collections.sort(list2);

        System.out.println("sort()");

        System.out.println(list2);

        // ----------------------------------------------------------
        // reverse()
        // ----------------------------------------------------------

        Collections.reverse(list2);

        System.out.println("reverse()");

        System.out.println(list2);

        // ----------------------------------------------------------
        // shuffle()
        // Random order.
        // ----------------------------------------------------------

        Collections.shuffle(list2);

        System.out.println("shuffle()");

        System.out.println(list2);

        // ----------------------------------------------------------
        // max()
        // ----------------------------------------------------------

        System.out.println("Maximum : "
                + Collections.max(list2));

        // ----------------------------------------------------------
        // min()
        // ----------------------------------------------------------

        System.out.println("Minimum : "
                + Collections.min(list2));

        // ----------------------------------------------------------
        // swap()
        // Exchanges two elements.
        // ----------------------------------------------------------

        Collections.swap(list2, 0, 4);

        System.out.println("swap()");

        System.out.println(list2);

        // ----------------------------------------------------------
        // fill()
        // Replaces every element.
        // ----------------------------------------------------------

        Collections.fill(list2, 100);

        System.out.println("fill()");

        System.out.println(list2);

        // ----------------------------------------------------------
        // frequency()
        // Counts occurrences.
        // ----------------------------------------------------------

        ArrayList<Integer> freq = new ArrayList<>();

        freq.add(10);
        freq.add(20);
        freq.add(10);
        freq.add(10);

        System.out.println(
                Collections.frequency(freq, 10));

        // ----------------------------------------------------------
        // binarySearch()
        // Collection MUST be sorted.
        // ----------------------------------------------------------

        Collections.sort(freq);

        System.out.println(
                Collections.binarySearch(freq, 20));

        // ----------------------------------------------------------
        // rotate()
        // Circular shift.
        // ----------------------------------------------------------

        Collections.rotate(freq, 2);

        System.out.println(freq);

        // ----------------------------------------------------------
        // replaceAll()
        // Replace occurrences.
        // ----------------------------------------------------------

        Collections.replaceAll(freq, 10, 99);

        System.out.println(freq);

        // ----------------------------------------------------------
        // reverseOrder()
        // Descending sorting.
        // ----------------------------------------------------------

        Collections.sort(freq,
                Collections.reverseOrder());

        System.out.println(freq);

        // ==========================================================
        // ARRAYS CLASS
        // ==========================================================

        /*
         * Arrays
         * ------
         * Utility class for arrays.
         */

        System.out.println("\n========== ARRAYS ==========\n");

        int arr[] = { 40, 10, 20, 50, 30 };

        // sort()

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        // binarySearch()

        System.out.println(
                Arrays.binarySearch(arr, 30));

        // copyOf()

        int copy[] = Arrays.copyOf(arr, 7);

        System.out.println(Arrays.toString(copy));

        // copyOfRange()

        int part[] = Arrays.copyOfRange(arr, 1, 4);

        System.out.println(Arrays.toString(part));

        // fill()

        Arrays.fill(part, 100);

        System.out.println(Arrays.toString(part));

        // equals()

        int a[] = { 1, 2, 3 };

        int b[] = { 1, 2, 3 };

        System.out.println(
                Arrays.equals(a, b));

        // compare()

        System.out.println(
                Arrays.compare(a, b));

        // toString()

        System.out.println(
                Arrays.toString(a));

        // ==========================================================
        // CONVERT ARRAY TO LIST
        // ==========================================================

        List<String> names = Arrays.asList("A", "B", "C");

        System.out.println(names);

        // ==========================================================
        // SORT USING COMPARATOR
        // ==========================================================

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(50);
        marks.add(20);
        marks.add(80);
        marks.add(10);

        // Descending Order

        Collections.sort(
                marks,
                Collections.reverseOrder());

        System.out.println(marks);

    }
}
