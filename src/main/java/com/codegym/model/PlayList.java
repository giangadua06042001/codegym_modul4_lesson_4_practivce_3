package com.codegym.model;

public class PlayList {
    private int idPlayList;
    private String namePlayList;
    private String label;
    private int quantity;

    public PlayList() {
    }

    public int getIdPlayList() {
        return idPlayList;
    }

    public void setIdPlayList(int idPlayList) {
        this.idPlayList = idPlayList;
    }

    public PlayList(int idPlayList,String namePlayList, String label, int quantity) {
        this.namePlayList = namePlayList;
        this.label = label;
        this.quantity = quantity;
        this.idPlayList=idPlayList;
    }

    public String getNamePlayList() {
        return namePlayList;
    }

    public void setNamePlayList(String namePlayList) {
        this.namePlayList = namePlayList;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}