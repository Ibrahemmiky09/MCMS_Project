package controller;

import model.Media;
import java.util.ArrayList;
import java.util.List;

public class MediaManager {

    private List<Media> mediaList = new ArrayList<>();

    public void addMedia(Media media) {
        mediaList.add(media);
        System.out.println("Media added successfully.");
    }

    public void displayAllMedia() {
        for (Media media : mediaList) {
            media.displayMedia();
        }
    }

    public Media searchMediaByTitle(String title) {
        for (Media media : mediaList) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
}