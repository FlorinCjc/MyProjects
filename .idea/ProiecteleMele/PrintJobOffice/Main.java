package comGoogle.PrintJobOffice;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        PrintJob printJob = new PrintJob(1,"Java Project files");
        PrintJob printJob2 = new PrintJob(2,"Document2.pdf");
        PrintJob printJob3 = new PrintJob(3,"Document3.pdf");
        PrintJob printJob4 = new PrintJob(4,"Document4.pdf");
        PrintQueue printQueue = new PrintQueue();


        printQueue.addDocument("Document1.pdf");
        printQueue.addDocument("CarInsurance.pdf");
        printQueue.addDocument("Court Decision 3 files");
        printQueue.addPrintJob(printJob);
        printQueue.addPrintJob(printJob2);
        printQueue.addPrintJob(printJob3);
        printQueue.addPrintJob(printJob4);
        while (!printQueue.isEmpty()){
            printQueue.printNextDocument();
        }
        if(printQueue.isEmpty()){
            System.out.println("The queue is now empty , all print jobs have been completed");
        }
        try {
        printQueue.queue.remove();
        }catch (NoSuchElementException e){
            System.out.println("Exception caught: NoSuchElementException");
        }
        System.out.println("Queue Size " + printQueue.queue.size());
    }
}
