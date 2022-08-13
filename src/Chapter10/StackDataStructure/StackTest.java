package Chapter10.StackDataStructure;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        //Declaring the Stacks elements
        Stack<String> cars = new Stack<>();

        //Pushing elements tp to the Stack
        cars.push("Toyota");
        cars.push("Honda");
        cars.push("Benz");
        cars.push("Volvo");
        cars.push("Audi");

        System.out.println("cars " + cars);
        System.out.println();

        //Removing Elements from the Stack

        String poppedElement = cars.pop();
        String poppedElement2 = cars.pop();

        System.out.println("The first element out of the Stack is " + poppedElement);
        System.out.println("The second element out of the Stack is " + poppedElement2);
        System.out.println();

        //Pushing the elements back into the stack
        cars.push("Volvo");
        cars.push("Audi");
        System.out.println("cars " + cars);

        //Peeking Element from the Stacks(Returns the last elements added to the stacks)

        String peekedElement = cars.peek();
        String peekedElement2 = cars.peek();

        System.out.println("The first Peeked in the Stack is " + peekedElement);
        System.out.println("The second Peeked in the Stack is " + peekedElement2);
        System.out.println();

        //Searching the element in the stacks(Returns the Position of the Element searched)

        int searchedElement = cars.search("Benz");
        int searchedElement2 = cars.search("Audi");

        System.out.println("cars " + cars);
        System.out.println("The position of Benz in the Stack is " + searchedElement);
        System.out.println("The position of Audi in the Stack is " + searchedElement2);
        System.out.println();

        //Determining if the Stack is Empty or Not.

        boolean isStackEmpty = cars.isEmpty();

        System.out.println("Is the Stack Empty " + isStackEmpty);
        System.out.println();

        isStackEmpty = cars.empty();

        System.out.println("Is the Stack Empty " + isStackEmpty);

    }
}
