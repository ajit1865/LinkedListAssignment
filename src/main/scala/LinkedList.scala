class LinkedList[T] {
  private class Node(var value: T) {
    var Next: Node = null
  }

  // head to hold head of the LinkedList
  private var head: Node = null
  // _Length is used to find the length of LinkedList
  private var _Length = 0

  def Length = _Length

  // add method is used to add element to LinkedList
  def add(value: T): Unit = {
    if (head == null) {
      head = new Node(value)
      return
    }
    var currentNode: Node = head
    while (currentNode.Next != null) currentNode = currentNode.Next
    currentNode.Next = new Node(value)
  }

  // printList method is used to print all elements of LinkedList
  def printList(): Unit = {
    var curr = head
    while (curr != null) {
      println(curr.value)
      curr = curr.Next
    }
  }

  // Search method is used to search element in LinkedList
  def search(index: Int): T = {
    if (index > Length) {
      //Exception thrown if search index is greater than length of LinkedList
      new IndexOutOfBoundsException()
    }
    var curr = head
    for (i <- 1 to index - 1) {
      curr = curr.Next
    }
    curr.value
  }

  // hasElement is a boolean method used to check is LinkedList contain any element or not
  def hasElement: Boolean = {
    if (head == null) {
      false
    }
    else
      true
  }

  // removeElement method is used to remove element from LinkedList
  def removeElement(index: Int): Unit = {
    if (index > Length) {
      //Exception thrown if search index is greater than length of LinkedList
      new IndexOutOfBoundsException()
    }
    var curr = head.Next
    var parent = head
    if (index == 1) head = head.Next
    else {
      for (i <- 2 to index - 2) {

        parent = parent.Next
      }
      parent.Next = parent.Next.Next
    }

    _Length = _Length - 1
  }
}
