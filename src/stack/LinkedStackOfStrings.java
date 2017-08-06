package stack;

/**
 * Created by jinilcs on 1/22/17.
 */
public class LinkedStackOfStrings {

    Node first = null;

    public LinkedStackOfStrings(String item){
        first = new Node();
        first.item = item;
        first.next=null;
    }

    public  LinkedStackOfStrings(){}

    private class Node{
        String item;
        Node next;
    }

    public String pop(){
        if(isEmpty()) return null;
        String item = first.item;
        first = first.next;
        return item;
    }

    public void push(String item){
        Node node = new Node();
        node.item = item;
        node.next = first;
        first = node;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return;
        }
        Node node = first;
        while(node !=null){
            System.out.print(node.item + "\t");
            node = node.next;
        }
        System.out.println("\n");
    }

}
