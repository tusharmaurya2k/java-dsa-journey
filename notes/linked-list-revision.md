# Linked List – Quick Revision

## What is a Linked List?
- A Linked List is a collection of nodes.
- Each node contains:
  - data
  - reference to the next node

## Important Terms
- Head: reference to the first node
- Next: points to the next node
- Null: end of the list

## Traversal
- Start from head
- Move using temp = temp.next
- Stop when temp becomes null

## Insertion
- Beginning: newNode.next = head, update head
- End: traverse to last, last.next = newNode

## Deletion
- Beginning: head = head.next
- End: go to second-last, set next = null
- By value: skip the node

## Time Complexity
- Traversal: O(n)
- Insert at beginning: O(1)
- Insert at end: O(n)
