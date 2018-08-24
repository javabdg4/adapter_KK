package com.sda.adapter;

import adapter.SocketAdapter;
import adapter.SocketClassAdapterImpl;
import adapter.SocketObjectAdapterImpl;
import adapter.Volt;

public class Main {
    public static void main(String[] args) {

        XML xml = new XML();
        xml.writeData();
        objectAdapter();
        classAdapter();


    }

    public static void objectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println(v12.getVolts());
    }

    public static void classAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        System.out.println(v12.getVolts());
    }

    public static Volt getVolt(SocketAdapter socketAdapter, int volt) {
        switch (volt) {
            case 3:
                return socketAdapter.get3Volt();
            case 12:
                return socketAdapter.get12Volt();
            case 120:
                return socketAdapter.get120Volt();
            default:
               return socketAdapter.get120Volt();
        }
    }
}

