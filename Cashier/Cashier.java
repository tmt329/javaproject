package Cashier;

public class Cashier { // xin chao cac ban

    private int id;
    private String name; 

    public Cashier()
    {}
    public Cashier(int id, String name)
    {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String toString()
    {
        return "id: " + getId() + " name" + getName();
    }
     
    
}
