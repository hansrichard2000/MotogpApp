package com.uc.motogpapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.Gson;

import java.util.List;

public class Constructors implements Parcelable {

    public Constructors(){}

    private List<Data> data;

    protected Constructors(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Constructors> CREATOR = new Creator<Constructors>() {
        @Override
        public Constructors createFromParcel(Parcel in) {
            return new Constructors(in);
        }

        @Override
        public Constructors[] newArray(int size) {
            return new Constructors[size];
        }
    };

    public static Constructors objectFromData(String str) {

        return new Gson().fromJson(str, Constructors.class);
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public static class Data {
        private String name;
        private String description;
        private String nation;
        private String engine;
        private String logo;
        private String created_by;
        private String updated_by;

        public static Data objectFromData(String str) {

            return new Gson().fromJson(str, Data.class);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getNation() {
            return nation;
        }

        public void setNation(String nation) {
            this.nation = nation;
        }

        public String getEngine() {
            return engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getCreated_by() {
            return created_by;
        }

        public void setCreated_by(String created_by) {
            this.created_by = created_by;
        }

        public String getUpdated_by() {
            return updated_by;
        }

        public void setUpdated_by(String updated_by) {
            this.updated_by = updated_by;
        }
    }
}
