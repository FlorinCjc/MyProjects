package comGoogle.PrintJobOffice;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
     public Queue<String> queue ;

    public PrintQueue() {
        this.queue = new LinkedList<>();
    }
    public void addDocument(String document){
        queue.offer(document);
        System.out.println("Document added to print queue: " + document);
    }
    //print and remove the next document in the queue
    public  void printNextDocument(){
        String document = queue.poll();
        if(document != null){
            System.out.println("Printing: " + document);
        }else {
            System.out.println("No Documents in the print queue.");
        }

    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void addPrintJob(PrintJob printJob){
        queue.offer(String.valueOf(printJob));
        System.out.println("PrintJob added to print queue: " +printJob);
    }


}
