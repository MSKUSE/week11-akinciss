public class Main {
    public static void main(String[] args) {
        Stack y = new StackArray();

        y.push(1);
        y.push("abc");
        y.pop();
        y.peek();
        y.pop();
        y.pop();
        y.isEmpty();
    }
}
