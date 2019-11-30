package ieee.madC.swift.app;

public class list_court {


    String court;
    String locateCourt;


    public list_court(String court, String locateCourt) {
        this.court = court;
        this.locateCourt = locateCourt;

    }

    public list_court() {
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court;
    }

    public String getLocateCourt() {
        return locateCourt;
    }

    public void setLocateCourt(String locateCourt) {
        this.locateCourt = locateCourt;
    }


}
