import java.util.Stack;
 
public class sortastack {
    public static void sortStack(Stack<Integer> s)
    {
        // If the stack is empty, return
        if (s.empty())
            return;
 
        // Remove the top element of the stack
        int x = s.pop();
 
        sortStack(s);
 
        // Create two auxiliary stacks
        Stack<Integer> tempStack = new Stack<>();
 
        while (!s.empty() && s.peek() > x) {
            tempStack.push(s.pop());
        }
 
        // Push x back into the main stack
        s.push(x);
 
        // Move all elements from tempStack back to the main
        // stack
        while (!tempStack.empty()) {
            s.push(tempStack.pop());
        }
    }
 
    public static void main(String[] args)
    {
        // Create a stack
        Stack<Integer> s = new Stack<>();
 
        // Push elements into the stack
        s.push(34);
        s.push(3);
        s.push(31);
        s.push(98);
        s.push(92);
        s.push(23);
 
        // Sort the stack
        sortStack(s);
 
        // Print the sorted elements
        System.out.print("Sorted numbers are: ");
        while (!s.empty()) {
            System.out.print(s.pop() + " ");
        }
    }
}