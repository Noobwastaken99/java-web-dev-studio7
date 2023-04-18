package org.launchcode.studio7;

public class CD extends BasicDisc implements OpticalDisc {
    // TODO: Implement your custom interface.
    public CD(String name, Double capacity, String contents) {
        super (name, capacity, contents);
        this.discType = "CD";
        this.discSpeed = 0.0;
    }
    public CD(String name, Double capacity, String contents, String discType, Double discSpeed) {
        super(name, capacity, contents, discType, discSpeed);
        this.discType = "CD";
        this.discSpeed = 0.0;
    }

    @Override
    public void spinDisc() {
        this.discSpeed = 500.0;
        System.out.println("A CD spin at a rate of 200 - 500 rpms");
        System.out.println("This disc runs at "+this.discSpeed);
    }

    @Override
    public void storeData(String words) {
        this.contents += words;
    }

    @Override
    public void readDisc() {
        System.out.println(this.contents);
    }

    @Override
    public void writeDisc() {
        System.out.println("disc is wrotten...");
    }

    @Override
    public void loadDisc() {
        System.out.println("name: " + this.name + "\n"
        + "type: " + this.discType + "\n"
        + "content: " + this.contents + "\n"
        + "capacity: " + this.capacity);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
