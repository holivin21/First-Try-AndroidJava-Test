package com.example.learningandroid.model;

public class ButtonMainModel {
    private String text;
    private String link;

    public ButtonMainModel(String text, String link) {
        this.text = text;
        this.link = link;
    }

    public String getText() {return text;}
    public void setText(String text) {this.text = text;}
    public String getLink() {return link;}
    public void getLink(String link) {this.link = link;}
}
