package com.example.learningandroid.model;

public class ListViewModel {
    private String Name;
    private String Button;

    public ListViewModel(String name, String button) {
        Name = name;
        Button = button;
    }

    public String getName() {return Name;}
    public void setName(String name) {Name = name;}
    public String getButton() {return Button;}
    public void setButton(String button) {Button = button;}
}
