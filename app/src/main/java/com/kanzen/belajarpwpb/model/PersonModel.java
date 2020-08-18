package com.kanzen.belajarpwpb.model;

import android.os.Parcel;
import android.os.Parcelable;

public class PersonModel implements Parcelable {
    private String name, email, city;
    private int age;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.email);
        dest.writeString(this.city);
        dest.writeInt(this.age);
    }

    public PersonModel() {
    }

    protected PersonModel(Parcel in) {
        this.name = in.readString();
        this.email = in.readString();
        this.city = in.readString();
        this.age = in.readInt();
    }

    public static final Parcelable.Creator<PersonModel> CREATOR = new Parcelable.Creator<PersonModel>() {
        @Override
        public PersonModel createFromParcel(Parcel source) {
            return new PersonModel(source);
        }

        @Override
        public PersonModel[] newArray(int size) {
            return new PersonModel[size];
        }
    };
}
