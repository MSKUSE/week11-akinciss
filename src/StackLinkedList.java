public class StackLinkedList implements Stack {
    StackItem bas;

    public void push(Object o) {
        StackItem yeni = new StackItem(o);
        yeni.setNext(bas);
        bas = yeni;
    }

    public Object pop() {
        if (bas == null) {
            return "boş";
        }
        Object d = bas.getData();
        bas = bas.getNext();
        return d;
    }

    public void peek() {
        System.out.println("üst: " + bas);
    }

    public boolean isEmpty() {
        return false; 
    }
}
