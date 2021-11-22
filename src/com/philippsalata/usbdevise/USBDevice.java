package com.philippsalata.usbdevise;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
