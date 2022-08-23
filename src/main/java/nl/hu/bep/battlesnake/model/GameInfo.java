package nl.hu.bep.battlesnake.model;

public class GameInfo {
    private String apiversion = "1";
    private String author = "MyUsername";
    private String color = "#888888";
    private String head = "default";
    private String tail = "default";
    private String version = "0.0.1-beta";

    // de attributen zijn private. Om ze naar je webservice te sturen moet je er public getters en setters voor maken.
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getApiversion() {
        return apiversion;
    }

    public void setApiversion(String apiversion) {
        this.apiversion = apiversion;
    }
}
