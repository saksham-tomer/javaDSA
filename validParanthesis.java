import java.util.Stack;

public class validParanthesis {

    public static Stack<Integer> reverse(Stack<Integer> myStack){


        if(myStack.isEmpty()){

        }
        myStack.pop();
        reverse(myStack);

    }

}
