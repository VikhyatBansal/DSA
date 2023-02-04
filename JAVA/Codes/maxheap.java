// code to implement max heap

public class maxheap {
    
    int[] heap = new int[10];
    int size = 0;
    
    public void insert(int data) {
        if (size == heap.length) {
            System.out.println("Heap is full");
        } else {
            heap[size] = data;
            int i = size;
            int parent = (i-1)/2;
            while (parent >= 0 && heap[parent] < heap[i]) {
                int temp = heap[parent];
                heap[parent] = heap[i];
                heap[i] = temp;
                i = parent;
                parent = (i-1)/2;
            }
            size += 1;
        }
    }
    
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(heap[i]);
        }
    }
    
    public static void main(String[] args) {
        maxheap obj = new maxheap();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.insert(60);
        obj.insert(70);
        obj.insert(80);
        obj.insert(90);
        obj.insert(100);
        obj.display();
    }
}
