package com.fulin.offer.problem7;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void appendTail() {
        Queue queue = new Queue();
        queue.appendTail(1);
        assert queue.stack.peek() == 1;
        queue.appendTail(2);
        assert queue.stack.peek() == 2;
        queue.appendTail(3);
        assert queue.stack.peek() == 3;
        int node = queue.deleteHead();
        assert node == 1;
        queue.appendTail(4);
        assert queue.stack.peek() == 4;
        node = queue.deleteHead();
        assert node == 2;
        node = queue.deleteHead();
        assert  node ==3;
        node = queue.deleteHead();
        assert  node == 4;
    }

}