# Rutgers-Warehouse
Data Structures Assignment: _Hash Tables & Priority Queues Based Project_


A warehouse with 10 sectors, each holding 5 product types. Using Hash Table like structure with sector-based priority queues to manage the products effectively. Popularity is determined by initial demand, total purchases, and last purchase date. This setup allows efficient searching within each sector's queue. Although queues are min heaps, they can be treated as regular lists for sequential searches. The goal is to delete the least popular item in a sector efficiently while maintaining constant space usage.

-----------------
Files Implemented:

_RUWarehouse/src/warehouse/AddProduct.java_

_RUWarehouse/src/warehouse/Restock.java_

_RUWarehouse/src/warehouse/DeleteProduct.java_

_RUWarehouse/src/warehouse/PurchaseProject.java_

_RUWarehouse/src/warehouse/Everything.java_


_RUWarehouse/src/warehouse/Warehouse.java_:

addToEnd()

fixHeap()

evictIfNeeded()

restockProduct()

deleteProduct()

purchaseProduct()

to compile:  javac -d bin src/warehouse/*.java

to execute: java -cp bin warehouse.* *.in *.out

*: depends on which file you are running

-----------------
Programming Skills Utilizied: _only mentioning new skills NOT mentioned in previous methods_

_RUWarehouse/src/warehouse/AddProduct.java_

_RUWarehouse/src/warehouse/Restock.java_

_RUWarehouse/src/warehouse/DeleteProduct.java_

_RUWarehouse/src/warehouse/PurchaseProject.java_

_RUWarehouse/src/warehouse/Everything.java_

  - File Input/Output
  - slight changes in iterations and conditions depending on what is asked

addToEnd()
  - Object-Oriented Programming
  - String & Data manipulation
  - Priority Queue(implemented as a min heap)
  - File & Error handling
  - Printing & Formatting

fixHeap()
  - Understanding of heap operations: heapify, sift-up, sift-down

evictIfNeeded()
  - Hash-Tables(implemented using entries & tables)
  - Algorithm Design: deleteMin()
  - Testing & Debugging
  - Software Engineering Principles: modular design, enxapsulation, code reusability, and code conventions

restockProduct()
  - Method Implementation

deleteProduct()
  - Arrays & Lists
  - Algorithms: delete operations in O(logn) time by swapping it with last element & fixing the heap structure

purchaseProduct()
  - Programming logic
  - Integration & Interation


