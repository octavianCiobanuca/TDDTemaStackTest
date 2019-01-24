import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomStackTest {
private CustomStack customStack;
@Before
public void initCustiomStack(){
    customStack = new CustomStack();
    customStack.MyStack(5);
}

@Test
public void  testIfStackIsEmpty(){
    //customStack.push(5); Adauga 5 in Stack si testul returneaza o eroare daca lasam true la expected
    Assert.assertEquals(true, customStack.isEmpty());
}

@Test
public void returnsTheObjectFromTheTopOfTheStackWithoutRemovingItFromTheStack(){
    customStack.push(1);
    customStack.push(2);
    //System.out.println(customStack.peek());
    customStack.push(3);
    Assert.assertEquals(3, customStack.peek());
    // System.out.println(customStack.peek());
}

@Test
public void returnsTheObjectFromTheTopOfTheStackAndRemoveItFromTheStack(){
    customStack.push(7);
    customStack.push(8);
    customStack.push(9);
    Assert.assertEquals(9,customStack.pop());
    //System.out.println(customStack.pop());
}

@Test
public void searchAnObjectInsideAStackAndReturnItsPositionForOneElement() {
    customStack.push(11);
    customStack.push(53);
    customStack.push(1);
    customStack.push(7);
    customStack.search(3);
}

}
