package creational._05_prototype.pojo;


import creational._05_prototype.pattern.Person;

public class Manager extends Person {

    public Manager(int id, String name, String surname) {
        super(id, name, surname);

    }
    private String sirket;
    private String address;


    public String getSirket() {
        return sirket;
    }
    public void setSirket(String sirket) {
        this.sirket = sirket;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Manager [sirket=" + sirket + ", address=" + address + "id=" +getId()+ " , name=" +getName()+""
                + ",surname=  "+ getSurname() + "]";
    }




}
