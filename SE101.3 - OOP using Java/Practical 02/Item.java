package com.mycompany.practical_02;

public class Item {
	// Q. 01
    private int location;
    private String description;

	// Q. 02 and 03
    public Item(int location, String description) {
        this.location = location;
        this.description = description;
    }

	// Q. 04
    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
