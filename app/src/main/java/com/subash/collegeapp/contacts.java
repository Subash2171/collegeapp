package com.subash.collegeapp;


public class contacts {

    private String name;
    private String phoneNo;
    private String gender;
    private String address;
    private int imageId;

    public contacts(String name, String phoneNo,String gender, String address,int imageId){
        this.name = name;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.address = address;
        this.imageId = imageId;


    }



    public String getName()
    {
        return name;
    }



    public String getPhoneNo() {

        return phoneNo;
    }
    public String getGender() {

        return gender;
    }
    public String getAddress() {

        return address;
    }
    public int getImageId() {
        return imageId;
    }
}
