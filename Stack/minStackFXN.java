package Stack;
import java.util.*;

public class minStackFXN {

    private Stack<Integer> st = new Stack<>();
    private Stack<Integer> minSt = new Stack<>();

    public minStackFXN() {}

    public void push(int val) {
        st.push(val);

        if (minSt.isEmpty()) {
            minSt.push(val);
        } else {
            minSt.push(Math.min(val, minSt.peek()));
        }
    }

    public void pop() {
        if (st.isEmpty()) return;
        st.pop();
        minSt.pop();
    }

    public int top() {
        if (st.isEmpty()) return -1;
        return st.peek();
    }

    public int getMin() {
        if (minSt.isEmpty()) return -1;
        return minSt.peek();
    }
}
    

