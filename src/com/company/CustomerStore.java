package com.company;

public class CustomerStore {
    public static final String targetAudience = "Youth";
    public String name;
    public String email;
    public String mobilePhone;

    public static String getTargetAudience() {
        return targetAudience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void info () {
        System.out.println("Имя класса:" + getClass() + " Целевая аудитория: " + targetAudience + " Имя покупателя: " + name
                + " Email: " + email + " Мобильный телефон: " + mobilePhone);
    }


}
