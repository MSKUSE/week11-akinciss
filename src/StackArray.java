import java.util.ArrayList;

public class StackArray implements Stack {
    private ArrayList<Object> dataList = new ArrayList<>();

    public void push(Object value) {
        dataList.add(0, value);  
    }

    public Object pop() {
        if (dataList.size() > 0) {
            return dataList.remove(dataList.size()); 
        }
        return null;
    }

    public void peek() {
        if (dataList.size() > 0) {
            System.out.println(dataList.get(1));  //
        }
    }

    public boolean isEmpty() {
        return false;  
    }
}
