package com.company;

public class PostOffice {
    public static final String legalAddress = "Kyiv city, Chrechatik street 22"; // адресс ООО "Укрпочта" (почтовые отделения данной организации)
    public int postOfficeNumber;
    public int index;
    public String address;

    public static String getLegalAddress() {
        return legalAddress;
    }

    public int getPostOfficeNumber() {
        return postOfficeNumber;
    }

    public void setPostOfficeNumber(int postOfficeNumber) {
        this.postOfficeNumber = postOfficeNumber;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void info () {
        System.out.println("Имя класса:" + getClass() + " Юридический адрес: " + legalAddress + " Номер отделения: " + postOfficeNumber
                           + " Индекс отделения: " + index + " Адресс: " + address);
    }

}
