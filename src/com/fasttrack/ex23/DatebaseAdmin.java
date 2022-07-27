package com.fasttrack.ex23;

public class DatebaseAdmin extends Employee{
    private String dbTechnology;

    public DatebaseAdmin(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void setBirthday(int x, int y, int z) {
        super.setBirthday(x, y, z);
    }

    @Override
    public String getAddress() {
        return "db admin: " + super.getAddress();
    }
}
