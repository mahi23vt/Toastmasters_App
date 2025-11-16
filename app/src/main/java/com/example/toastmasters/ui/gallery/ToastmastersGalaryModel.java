package com.example.toastmasters.ui.gallery;

public class ToastmastersGalaryModel {
    int image;
    String Name;
    String Role;

    public ToastmastersGalaryModel(int image, String name, String role) {
        this.image = image;
        Name = name;
        Role = role;
    }

    public ToastmastersGalaryModel() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
