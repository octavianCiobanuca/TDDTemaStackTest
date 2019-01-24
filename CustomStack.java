
public class CustomStack {
private int maxSize;
private long[] stackArray;
private int top;

public void MyStack(int s) {
    maxSize = s;
    stackArray = new long[maxSize];
    top = -1;
}

public boolean isEmpty() {
    return (top == -1);
}

public void push(int j) {
    stackArray[++top] = j;
}

public long pop() {
    return stackArray[top--];
}

public long peek() {
    return stackArray[top];
}

int i = maxSize;
boolean elementFound;
public long search(long element){
    while (i != -1){
        if(elementFound == false)
        {
            System.out.println("-1   ");
            return -1;
        }
        else {
            if(element == stackArray[i]){
                System.out.println("Pozitia: " + i);
                i--;
                elementFound = true;
                return i;
            }
        }
    }
    return 0;
}


}
