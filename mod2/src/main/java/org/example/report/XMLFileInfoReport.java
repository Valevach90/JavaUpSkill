package org.example.report;

public class XMLFileInfoReport {
    private String oldFileName;
    private boolean reported;

    public boolean isReported() {
        return reported;
    }

    public void setReported(boolean reported) {
        this.reported = reported;
    }

    private String newFileName;


    public String getOldFileName() {
        return oldFileName;
    }

    public void setOldFileName(String oldFileName) {
        this.oldFileName = oldFileName;
    }

    public String getNewFileName() {
        return newFileName;
    }

    public void setNewFileName(String newFileName) {
        this.newFileName = newFileName;
        if(newFileName.equals(oldFileName)){
            reported=true;
        }
    }
}
