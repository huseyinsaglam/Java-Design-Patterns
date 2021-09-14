package _04_protoType.solution.prototype;

import _04_protoType.solution.pojo.Person;

public class Employee extends Person {

    public Employee(int id, String name, String surname) {
        super(id, name, surname);

    }

    private String city;
    private int phone;


    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Employee [city=" + city + ", phone=" + phone + ", id=" +getId()+ " , name=" +getName()+""
                + ",surname=  "+ getSurname() + "]";
    }








}