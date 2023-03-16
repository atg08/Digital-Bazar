abstract class Device {

    //string attributes

    private String name;
    private String description;
    private int id;

    //constructor with two parameters
    public Device(String name,String description) {
        setName(name);
        setDescription(description);
    }

    public abstract int generateId();

    //setter setName
    public void setName(String name) {

        this.name = name;
    }
    //getter getName
    public String getName() {

        return name;
    }

    //setter setDescription
    public void setDescription(String description) {

        this.description = description;
    }

    //getter getDescription
    public String getDescription() {

        return description;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    //toString method
    @Override
    public String toString() {
        return " | name: " + getName()+
                " | description: " + getDescription();
    }
}

