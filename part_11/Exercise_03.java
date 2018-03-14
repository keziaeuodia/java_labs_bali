package part_11;

/**
 * Modify your Queue Class so that it is completely generic
 */
class GenQueue <T>{
    T q[];
    int putloc, getloc;

    GenQueue(T [] q){
        this.q = q;
        putloc = getloc = 0;
    }

    void put(T i) throws QueueIsFullException{
        if (putloc >= q.length)
            throw new QueueIsFullException();

        q[putloc++] = i;
    }

    T get() throws QueueIsEmptyException{
        if (getloc >= putloc)
            throw new QueueIsEmptyException();

        return q[getloc++];
    }

}

class QueueIsFullException extends Exception{

    @Override
    public String toString() {
        return "\nQueue is full.";
    }

}

class QueueIsEmptyException extends Exception{
    @Override
    public String toString() {
        return "\nQueue is empty.";
    }
}

class Queue{
    public static void main(String[] args) {

        String [] array = {"I", "don't", "want", "to", "sleep"};
        String [] array2 = new String[4]; //empty array called array2

        GenQueue queue = new GenQueue(array2); //assigning array2 as the queue

        int i;

        try {
            for (i = 0; i < array.length; i++) {
                queue.put(array[i]); //putting array to queue(array2) that can hold less than array, trigger an exception
            }
        }catch (QueueIsFullException exc){
            System.out.println(exc.toString());
        }

        try {
            for (i = 0; i < array.length; i++) {
                System.out.println(queue.get());
            }
        }catch (QueueIsEmptyException exc){
            System.out.println(exc.toString());
        }

    }
}