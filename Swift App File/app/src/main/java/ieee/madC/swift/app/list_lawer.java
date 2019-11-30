package ieee.madC.swift.app;

public class list_lawer {


    String lawers;
    String locateLawers;


    public list_lawer(String lawers, String locateLawers) {
        this.lawers = lawers;
        this.locateLawers = locateLawers;

    }

    public list_lawer() {
    }

    public String getLawers() {
        return lawers;
    }

    public void setLawers(String court) {
        this.lawers = lawers;
    }

    public String getLocateLawers() {
        return locateLawers;
    }

    public void setLocateLawers(String locateLawers) {
        this.locateLawers = locateLawers;
    }



}
