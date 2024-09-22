package comGoogle.PrintJobOffice;

public class PrintJob {
    private int jobId;
    private String documentName;

    public PrintJob(int jobId,String documentName) {
    this.jobId = jobId;
    this.documentName = documentName;
    }

    public int getJobId() {
        return jobId;
    }

    public PrintJob setJobId(int jobId) {
        this.jobId = jobId;
        return this;
    }

    public String getDocumentName() {
        return documentName;
    }

    public PrintJob setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    @Override
    public String toString() {
        return "PrintJob{" +
                "jobId=" + jobId +
                ", documentName='" + documentName + '\'' +
                '}';
    }
}
