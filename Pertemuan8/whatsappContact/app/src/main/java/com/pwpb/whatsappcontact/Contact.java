package com.pwpb.whatsappcontact;

public class Contact {
    int image;
    String name, stat;

    public Contact(int image, String name, String stat) {
        this.image = image;
        this.name = name;
        this.stat = stat;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getStat() {
        return stat;
    }
}
