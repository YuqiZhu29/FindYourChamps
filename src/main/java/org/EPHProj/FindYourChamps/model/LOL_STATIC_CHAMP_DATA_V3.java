package org.EPHProj.FindYourChamps.model;

public class LOL_STATIC_CHAMP_DATA_V3 {

    //property
    private String name;
    private int id;
    private String key;

    //constructor
    public LOL_STATIC_CHAMP_DATA_V3(String name, int id, String key) {
        this.name=name;
        this.id=id;
        this.key=key;
    }

    // get/set method
    public int get_id () {
        return id;
    }
    public void set_id (int id_) {
        id=id_;
    }

    public String get_name () {
        return name;
    }
    public void set_name (String name_) {
        name=name_;
    }

    public String get_key () {
        return key;
    }
    public void set_key (String key_) {
        key=key_;
    }
}
