package JsonToXml;

public class DemoObj {
    private long ID;
    private String name;

    public DemoObj() {
        super();
    }

    public DemoObj(long ID, String name) {
        super();
        this.ID = ID;
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
