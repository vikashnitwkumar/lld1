package assiglld1.lld.Generics;

import org.w3c.dom.traversal.NodeIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public  class Node implements Iterable<Node> {
    private int data;
    private Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }


    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }
    private static class NodeIterator implements Iterator<Node> {
        private Node current;

        public NodeIterator(Node start) {
            this.current = start;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Node next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Node temp = current;
            current = current.getNext();
            return temp;
        }
}

        private Node getNext() {
            return this.next;
        }
    }