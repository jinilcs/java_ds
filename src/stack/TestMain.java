package stack;

/**
 * Created by jinilcs on 1/22/17.
 */
public class TestMain {

    public static void main(String[] args) {

        //LinkedStackOfStrings stack = new LinkedStackOfStrings("TCS");
        FixedArrayStackOfStrings stack = new FixedArrayStackOfStrings(10);
        stack.printStack();

        stack.push("Amazon");
        stack.push("Yahoo");
        stack.push("Facebook");
        stack.push("Microsoft");

        stack.printStack();

        //stack.pop();

        stack.printStack();

        stack.push("Google");
        stack.push("Amazon");
        stack.push("Yahoo");
        stack.push("Facebook");
        stack.push("Microsoft");
        stack.push("Facebook");
        stack.push("Microsoft");

        stack.printStack();

        //stack.pop();
        //stack.pop();
        //stack.pop();

        stack.printStack();

        //stack.pop();

        stack.printStack();

        //stack.pop();

    }
}
