package org.launchcode.studio7;

public class DVD extends BasicDisc implements OpticalDisc {

    // TODO: Implement your custom interface.
    public DVD(String name, Double capacity, String contents) {
        super (name, capacity, contents);
        this.discType = "DVD";
        this.discSpeed = 0.0;
    }
    public DVD(String name, Double capacity, String contents, String discType, Double discSpeed) {
        super(name, capacity, contents, discType, discSpeed);
        this.discType = "DVD";
        this.discSpeed = 0.0;
    }

    @Override
    public void spinDisc() {
        this.discSpeed = 1599.99;
        System.out.println("A DVD spin at a rate of 570 - 1600 rpms");
        System.out.println("This disc runs at "+this.discSpeed);
    }

    @Override
    public void storeData(String words) {
        this.contents += words;
    }

    @Override
    public String readDisc() {
        return this.contents;
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
