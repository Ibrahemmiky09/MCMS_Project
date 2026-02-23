package main;

import controller.MediaManager;
import model.Media;

public class MainApp {

    public static void main(String[] args) {

        MediaManager manager = new MediaManager();

        Media media1 = new Media(1, "Project Image", "Graduation project photo", "Image");
        Media media2 = new Media(2, "Lecture Video", "Software Engineering Lecture", "Video");

        manager.addMedia(media1);
        manager.addMedia(media2);

        System.out.println("All Media:");
        manager.displayAllMedia();

        System.out.println("Search Result:");
        Media result = manager.searchMediaByTitle("Project Image");

        if (result != null) {
            result.displayMedia();
        } else {
            System.out.println("Media not found.");
        }
    }
}