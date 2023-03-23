import org.scalatest.flatspec.AnyFlatSpec

class LinkedListTest extends AnyFlatSpec {
  "LinkedList add" should "add an element to list" in {
    var linkedList = new LinkedList[String]
    assert(!linkedList.hasElement)
    linkedList.add("India")
    linkedList.printList
    assert(linkedList.hasElement)
  }
  "LinkedList search" should "get the element at given index" in {
    var linkedList = new LinkedList[String]
    linkedList.add("India")
    linkedList.add("US")
    linkedList.add("UK")
    assert(linkedList.search(2).equals("US"))
  }
  "LinkedList remvove" should "remove the element at given index" in {
    var linkedList = new LinkedList[String]
    linkedList.add("India")
    linkedList.add("US")
    linkedList.add("UK")
    assert(linkedList.search(2).equals("US"))
    linkedList.removeElement(2)
    assert(linkedList.search(2).equals("UK"))

  }
}
