package org.launchcode.studio7;

public abstract class BasicDisc {
    String name;
    Double capacity;
    String contents;
    String discType;
    Double discSpeed;

    public  BasicDisc() {
        this.contents = "";
    }
    public BasicDisc(String name, Double capacity, String contents) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
    }
    public BasicDisc(String name, Double capacity, String contents, String discType, Double discSpeed) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
        this.discSpeed = discSpeed;
    }

    void storeData(String words){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public Double getDiscSpeed() {
        return discSpeed;
    }

    public void setDiscSpeed(Double discSpeed) {
        this.discSpeed = discSpeed;
    }
}
