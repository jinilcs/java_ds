package stack;

/**
 * Created by jinilcs on 1/22/17.
 */
public class FixedArrayStackOfStrings {

    int capacity;
    String[] stack;
    int N =0;

    FixedArrayStackOfStrings(int capacity){
        this.capacity = capacity;
        stack = new String[capacity];
    }

    public String pop(){
        if(isEmpty()) return null;
        String item = stack[--N];
        stack[N]=null;
        return item;
    }

    public void push(String item){
        if(isFull()){
            System.out.println("Stack Full. Cannot insert " + item);
            return;
        }
        stack[N++]=item;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public boolean isFull(){
        return N >= capacity;
    }

    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return;
        }
        for(int i=N-1; i>=0; i--){
            System.out.print(stack[i].toString() + "->");
        }
        System.out.println();
    }
}
