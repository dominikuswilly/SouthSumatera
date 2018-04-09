package com.mediaanda.southsumatera;

import java.util.ArrayList;

public class DestinationData {
    public static String[][] data = new String[][]{
            {"Palembang","Keterangan Palembang",null},
            {"Empat Lawang","Keterangan Empat Lawang", null}
    };

    public static ArrayList<Destination> getListData(){
        Destination destination = null;
        ArrayList<Destination> list = new ArrayList<>();
        for(int i = 0; i < data.length; i++){
            destination = new Destination();
            destination.setName(data[i][0]);
            destination.setDescription(data[i][1]);
            destination.setPhoto(data[i][2]);
        }

        return list;
    }
}
