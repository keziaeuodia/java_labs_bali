package part_04;


/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */
class Queue{
    int q[];
    int putloc, getloc;

    Queue(int size){
        q = new int[size];
        putloc = getloc = 0;
    }

    void put(int i){
        if (putloc == q.length){
            System.out.println(" -Queue is full.");
            return;
        }
        q[putloc++] = i;
    }
    int get(){
        if (getloc == putloc){
            System.out.println(" -Queue is empty.");
            return 0;
        }
        return q[getloc++];
    }
    public static void main(String[] args) {
        Queue queue = new Queue(101);
        int i;
        for (i = 0; i < 101; i++){
            queue.put(i);
        }

        for (int a = 0; a < 101; a++){
            a = queue.get();
            if (a%2 == 0){
                System.out.print(a + " ");
            }
        }

    }
}