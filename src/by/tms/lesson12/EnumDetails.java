package by.tms.lesson12;

public enum EnumDetails {

    HEAD("Head"),
    BODY("Body"),
    LH("Left hand"),
    RH("Right hand"),
    LL("Left leg"),
    RL("Right leg"),
    CPU("CPU"),
    RAM("RAM"),
    HDD("HDD");

    private String name;

    EnumDetails(String name) {
        this.name = name;
    }

    public String getNameDetail(int i) {
        EnumDetails[] values = EnumDetails.values();
        return values[i].name;
    }
}
