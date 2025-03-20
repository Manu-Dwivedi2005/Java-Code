# Java Data Structures and Algorithms

This repository contains comprehensive implementations of various Data Structures and Algorithms in Java. The code is well-documented and includes examples to help understand the concepts better.

## 🚀 Current Implementations

### Data Structures
- **Arrays**
  - Array manipulations
  - Array algorithms
  - Common array problems

- **Linked List**
  - Single Linked List implementation
  - Cycle detection in Linked List (Floyd's Algorithm)
  - Basic operations (add, delete, search)

- **Stack**
  - Stack implementation
  - Stack operations
  - Stack-based problem solving

### Algorithms
- **Recursion**
  - Basic recursion problems
  - Advanced recursive algorithms
  - Recursive problem-solving techniques

- **BackTracking**
  - Backtracking algorithms
  - Problem-solving using backtracking
  - Optimization problems

### Programming Fundamentals
- **Basics**
  - Core Java concepts
  - Basic programming constructs
  - Problem-solving fundamentals

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
- Example usage for each data structure and algorithm
- Time and space complexity analysis
- Progressive learning path from basics to advanced concepts
- Practical problem-solving approaches

## 📚 Available Operations

### Data Structure Operations
1. **Array Operations**
   - Array traversal and manipulation
   - Searching and sorting
   - Array-based problem solving

2. **Linked List Operations**
   - `addFirst(int data)` - Add node at the beginning
   - `addLast(int data)` - Add node at the end
   - `deleteFirst()` - Delete first node
   - `search(int key)` - Search for a value
   - `isCycle()` - Detect cycle in linked list
   - `print()` - Display the linked list

3. **Stack Operations**
   - Push and pop operations
   - Stack traversal
   - Stack-based expressions

### Algorithm Implementation
1. **Recursion**
   - Basic recursive functions
   - Advanced recursive problems
   - Recursive pattern solving

2. **BackTracking**
   - Solving complex problems
   - Optimization techniques
   - Pattern-based solutions

## 🔧 How to Use

1. Clone the repository:
```bash
git clone https://github.com/Manu-Dwivedi2005/Java-Code.git
```

2. Navigate to the project directory:
```bash
cd Java-Code
```

3. Choose the topic you want to explore:
```bash
# For Array implementations
cd Array

# For LinkedList implementations
cd LinkedList

# For Stack implementations
cd Stack

# For Recursion problems
cd Recursion

# For BackTracking problems
cd BackTracking

# For Basic concepts
cd Basics
```

4. Compile and run any Java file:
```bash
javac FileName.java
java FileName
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

## 🌟 Learning Path

This repository is structured to provide a comprehensive learning path:
1. Start with **Basics** to understand core concepts
2. Move to **Array** for fundamental data structure operations
3. Progress to **LinkedList** for dynamic data structure understanding
4. Learn **Stack** for LIFO operations and problem-solving
5. Master **Recursion** for advanced problem-solving techniques
6. Explore **BackTracking** for complex algorithmic solutions 