# Java Data Structures and Algorithms

This repository contains implementations of various Data Structures and Algorithms in Java. The code is well-documented and includes examples to help understand the concepts better.

## 🚀 Current Implementations

### Data Structures
- **Linked List**
  - Single Linked List implementation
  - Cycle detection in Linked List (Floyd's Algorithm)
  - Basic operations (add, delete, search)

## 🔍 Code Examples

### Linked List with Cycle Detection
```java
// Create a new linked list
LinkedList1 ll = new LinkedList1();
ll.addFirst(1);
ll.addLast(2);
ll.addLast(3);
ll.addLast(4);
ll.addLast(5);

// Check for cycle
System.out.println(ll.isCycle()); // false

// Create a cycle
ll.head.next.next.next.next.next = ll.head;

// Check again
System.out.println(ll.isCycle()); // true
```

## 🛠️ Features

- Clean and efficient implementations
- Well-documented code
- Example usage for each data structure
- Time and space complexity analysis

## 📚 Available Operations

### Linked List Operations
1. `addFirst(int data)` - Add node at the beginning
2. `addLast(int data)` - Add node at the end
3. `deleteFirst()` - Delete first node
4. `search(int key)` - Search for a value
5. `isCycle()` - Detect cycle in linked list
6. `print()` - Display the linked list

## 🔧 How to Use

1. Clone the repository:
```bash
git clone https://github.com/Manu-Dwivedi2005/Java-Code.git
```

2. Navigate to the project directory:
```bash
cd Java-Code
```

3. Compile and run the Java files:
```bash
javac LinkedList/CycleLinkedList.java
java LinkedList.CycleLinkedList
```

## 📝 Contributing

Feel free to contribute to this repository by:
1. Forking the project
2. Creating your feature branch (`git checkout -b feature/AmazingFeature`)
3. Committing your changes (`git commit -m 'Add some AmazingFeature'`)
4. Pushing to the branch (`git push origin feature/AmazingFeature`)
5. Opening a Pull Request

## 📫 Contact

Manu Dwivedi - manudwivedi2005@gmail.com

Project Link: [https://github.com/Manu-Dwivedi2005/Java-Code](https://github.com/Manu-Dwivedi2005/Java-Code) 