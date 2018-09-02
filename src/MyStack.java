public class MyStack {
    protected int[] data;
    protected int tos; //top of stack

    public static final int DEFAULT_CAPACITY = 5;

    public MyStack() {
        this.data = new int[DEFAULT_CAPACITY];
        this.tos = -1;
    }

    public MyStack(int capacity) {
        this.data = new int[capacity];
        this.tos = -1;
    }

    public int top() throws Exception{
        if (this.isEmpty()){
            throw new Exception("Stack is empty");
        }

        return this.data[this.tos];
    }

    public void push(int value) throws Exception {
        if (this.size() == this.data.length) {
            throw new Exception("Stack is full");
        }

        this.tos++;
        this.data[this.tos] = value;
    }

    public int pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack Empty, nothing to pop!");
        }

        int rv = this.data[this.tos];
        this.data[this.tos] = 0;
        this.tos--;

        return rv;
    }

    public int size() {
        return this.tos+1;
    }

    public boolean isEmpty() {
        return (this.size()==0);
    }

    public void display() {
        for (int i = this.tos; i >= 0; i--) {
            System.out.print(this.data[i] + ", ");
        }

        System.out.println("End of Stack!");
    }
}
