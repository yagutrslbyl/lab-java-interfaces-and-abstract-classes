package org.example;

public abstract class Video {
    String title;
    int duration;
    String getInfo(){
        return "Title: "+title+" Duration"+ duration;
    }
}
