public class Device {

    private String name;
    private String description;

    public Device(String name,String description) {
        setName(name);
        setDescription(description);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return " | name: " + getName()+
                " | description: " + getDescription();
    }
}

