package model;

import java.util.Date;

public class Media {
    private int mediaID;
    private String title;
    private String description;
    private Date uploadDate;
    private String mediaType;
    private String status;

    public Media(int mediaID, String title, String description, String mediaType) {
        this.mediaID = mediaID;
        this.title = title;
        this.description = description;
        this.mediaType = mediaType;
        this.uploadDate = new Date();
        this.status = "Pending";
    }

    public int getMediaID() {
        return mediaID;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public void approve() {
        status = "Approved";
    }

    public void reject() {
        status = "Rejected";
    }

    public void displayMedia() {
        System.out.println("ID: " + mediaID);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Type: " + mediaType);
        System.out.println("Status: " + status);
        System.out.println("---------------------------");
    }
}