package com.sl.ms.inventorymanagement.controller;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="SL_INV")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private Timestamp date_loaded;
    private String json_File;

    public Inventory() {
        super();
    }

    public Inventory(String id, Timestamp date_loaded, String jsonFile) {
        this.id = id;
        this.date_loaded = date_loaded;
        this.json_File = jsonFile;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getDate_loaded() {
        return date_loaded;
    }

    public void setDate_loaded(Timestamp date_loaded) {
        this.date_loaded = date_loaded;
    }

    public String getJsonFile() {
        return json_File;
    }

    public void setJsonFile(String jsonFile) {
        this.json_File = jsonFile;
    }
}



