package _11_DSA_Stack_Queue.bai_tap.trien_khai_sd_Queue_sd_danh_sach_lk_vong;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data){
        Node temp = new Node(data);
        if (this.front==null){
            this.front=this.rear=temp;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
        temp.link = this.front;

    }

    public Node deQueue() {
        if (this.front == null) {
            return null;
        }
        if (this.front == this.rear) {
            return this.front = this.rear = null;
        }
        Node temp = this.front;
        this.front = temp.link;
        this.rear.link = this.front;
        return temp;
    }
}
