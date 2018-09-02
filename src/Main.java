public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        MyStack intStack1 = new MyStack();

        intStack1.push(12);
        intStack1.push(15);
        intStack1.push(45);
        intStack1.display();
        System.out.println(intStack1.pop());
        intStack1.display();
        System.out.println(intStack1.top());


        MyStack intStack2 = new MyStack(10);
        intStack2.push(13);
        intStack2.push(56);
        intStack2.display();
    }
}
