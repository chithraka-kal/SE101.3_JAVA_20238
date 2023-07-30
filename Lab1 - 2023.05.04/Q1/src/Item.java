public class Item {
    private int location;
    private String description;

    Item(int location, String description){
        this.location = location;
        this.description = description;
    }

    public int getLocation(){
        return location;
    }
    public String getDescription(){
        return description;
    }
}
