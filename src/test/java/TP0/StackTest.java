package TP0;

import org.example.TP0.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack stack;

    @BeforeEach
    void init() {
        stack = new Stack();
    }
    @Test
    void pushAndPop() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void peek() {
        stack.push(3);
        assertEquals(3, stack.peek());
        assertEquals(1, stack.size());
    }

    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void expandArray() {
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        assertEquals(14, stack.pop());
    }

    @Test
    void popEmptyStack() {
        assertThrows(IllegalStateException.class, stack::pop);
    }
}