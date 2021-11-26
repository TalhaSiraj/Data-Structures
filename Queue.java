
package queue;


public class Queue {

    
    public static void main(String[] args) {

        MyQueue mq = new MyQueue(3); //rear = 0
        mq.EnQueue(10);// arr[0] -> 10, rear=1
        mq.EnQueue(20);// arr[1] -> 20, rear=2
        mq.EnQueue(30);// arr[2] -> 30, rear=3
        mq.EnQueue(40);// arr[3] -> 40, rear=4
        System.out.println("Value =" +mq.DeQueue());
    }
    
}
class MyQueue{
private int[] arr;
private int _rear;
private int _front;
    public MyQueue(int size)
    {
        arr = new int[size];
        _rear = 0;
        _front = 0;
        
    }
    public void EnQueue(int val){
        if(_rear == arr.length){
            System.out.println("Queue is full");
        }
        else
        {
            arr[_rear] = val;
            
            System.out.println(""+arr[_rear]+"  "+val);
        _rear++;
        }
    }
    
    public int DeQueue(){
        if(_front == arr.length){
            System.out.println("Queue is empty");
        }
        else
        {
            return arr[_front++];
        }
        return 0;
    }
}
